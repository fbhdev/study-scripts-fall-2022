import asyncio
import csv
import json
from csv import reader
from datetime import datetime

import pandas as pd
from matplotlib import pyplot as plt
import seaborn as sns
import os


class Screen:

    def __init__(self):
        self.sleep = 60  # seconds
        self.flags = [False, False, False, False]
        self.courses = {
            "Web Services": 0,
            "Web Dev": 0,
            "DSA": 0,
            "PT2": 0
        }

    @staticmethod
    def directory_length(course):
        return len(os.listdir("../records/" + course + "/"))

    @staticmethod
    def directory(course):
        length = []
        for item in os.listdir("../records/" + course + "/"):
            if item.endswith(".json"):
                length.append(item)
        return length

    def update_length(self):
        flag = False
        for count, course in enumerate(self.courses):
            if self.courses[course] != len(self.directory(course)):
                self.courses[course] = len(self.directory(course))
                self.flags[count] = True
                flag = True
        if flag:
            return True
        return False

    def clear_flags(self):
        for count, flag in enumerate(self.flags):
            if flag:
                self.flags[count] = False

    @staticmethod
    def read_files(name: str, course: str):
        with open(f"../records/{course}/{name}", "r") as file:
            if name.endswith(".json"):
                return json.load(file)
            elif name.endswith(".csv"):
                return reader(file)
            else:
                return file.read()

    def read_data(self, name: str, index: int):
        course = list(self.courses.keys())[index]
        if name.endswith(".json"):
            data = self.read_files(name, course)
            num_question = list(data.values())[0]
            grade = list(data.values())[1]
            course = list(data.values())[3]
            return [grade, num_question, course]

    async def check(self) -> None:
        while True:
            if self.update_length():
                for count, flag in enumerate(self.flags):
                    if flag:
                        self.save_data(count)
                        self.clear_flags()
                        print(f"Data saved for {list(self.courses.keys())[count]}")
            print(f"Sleeping for {self.sleep} seconds")
            await asyncio.sleep(self.sleep)

    def plot(self, index: int) -> None:
        course = list(self.courses.keys())[index]
        try:
            data = pd.read_csv(f"../records/{course}/records.csv")
            if data.empty:
                print("No data to plot")
                return
        except FileNotFoundError:
            return
        plt.figure(figsize=(10, 6))
        sns.color_palette("light:#5A9", as_cmap=True)
        sns.despine()
        plt.title(f"{course} Grades")
        plt.ylabel("Grades")
        plt.xlabel("Questions")
        grades = []
        questions = []
        for row in data.itertuples():
            grades.append(row[1])
            questions.append(row[2])
        pd.DataFrame({"Grades": grades, "Questions": questions})
        sns.scatterplot(x="Number of Questions", y="Grade", data=data, hue="Course")
        try:
            plt.savefig(f"../records/{course}/plots/{datetime.now()}.png")
        except FileNotFoundError:
            os.mkdir(f"../records/{course}/plots")

    def save_data(self, index: int) -> None:
        course = list(self.courses.keys())[index]
        with open(f"../records/{course}/records.csv", "w") as file:
            writer = csv.writer(file)
            if os.stat(f"../records/{course}/records.csv").st_size == 0:
                writer.writerow(["Grade", "Number of Questions", "Course"])
            for name in self.directory(course):
                if name.__contains__("plot"):
                    continue
                writer.writerow(self.read_data(name, list(self.courses.keys()).index(course)))
        self.plot(index)

    def run(self):
        asyncio.run(self.check())


if __name__ == "__main__":
    Screen().run()

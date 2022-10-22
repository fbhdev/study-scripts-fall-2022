import asyncio
import csv
import json
from csv import reader
from datetime import datetime
import plotly.express as px

import pandas as pd
import os


class Screen:

    def __init__(self):
        self.sleep = 60  # seconds
        self.flags = [False, False, False, False]
        self.courses = {
            "Web Services": 0,
            "Web Development": 0,
            "Data Structures and Algorithms": 0,
            "PT2": 0
        }

    @staticmethod
    def directory(course):
        length = []
        for item in os.listdir("../records/" + course + "/"):
            if item.endswith(".json"):
                length.append(item)
        return length

    def update_length(self):
        for count, course in enumerate(self.courses):
            if self.courses[course] != len(self.directory(course)):
                self.courses[course] = len(self.directory(course))
                self.flags[count] = True

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

    def read_json(self, name: str, index: int):
        course = list(self.courses.keys())[index]
        if name.endswith(".json"):
            data = self.read_files(name, course)
            num_question = list(data.values())[0]
            grade = list(data.values())[1]
            course = list(data.values())[3]
            return [grade, num_question, course, name]

    def plot(self) -> None:
        try:
            data = pd.read_csv(f"../records/records.csv")
            if os.stat(f"../records/records.csv").st_size == 0:
                print("No data to plot")
                return
        except FileNotFoundError:
            return
        grades = []
        questions = []
        courses = []
        for row in data.itertuples():
            grades.append(row[1])
            questions.append(row[2])
            courses.append(row[3])
        df = pd.DataFrame({"Grade": grades, "Questions": questions, "Course": courses})
        fig = px.scatter(df,
                         x="Questions",
                         y="Grade",
                         width=1440, height=900,
                         color="Course",
                         title=f"Fall 2022 Study Script Grades",
                         labels={"Questions": "Number of Questions", "Grade": "Grades"},
                         size="Questions",
                         template="plotly_dark",
                         color_discrete_sequence=px.colors.qualitative.Pastel)
        fig.update_xaxes(showgrid=False)
        for item in os.listdir(f"../records/plots"):
            os.remove(f"../records/plots/{item}")
        fig.write_image(f"../records/plots/{datetime.now()}.png")
        fig.write_html(f"../records/plots/{datetime.now()}.html")

    def save_data(self, index: int) -> None:
        course = list(self.courses.keys())[index]
        with open(f"../records/records.csv", "a") as file:
            writer = csv.writer(file)
            if os.stat(f"../records/records.csv").st_size == 0:
                writer.writerow(["Grade", "Number of Questions", "Course", "File Name"])
            for name in self.directory(course):
                if name.__contains__("plot"):
                    continue
                if not self.is_logged(name):
                    writer.writerow(self.read_json(name, list(self.courses.keys()).index(course)))
            file.close()
        self.plot()

    @staticmethod
    def is_logged(name):
        with open("../records/records.csv", "r") as file:
            csv = reader(file)
            for row in csv:
                if name in row:
                    return True
            return False

    @staticmethod
    def averages(course):
        with open(f"../records/records.csv", "r") as file:
            csv = reader(file)
            grades = []
            for row in csv:
                if course in row:
                    grades.append(float(row[0]))
            try:
                return round(sum(grades) / len(grades), 2)
            except ZeroDivisionError:
                return 0

    @staticmethod
    def total_questions(course):
        with open(f"../records/records.csv", "r") as file:
            csv = reader(file)
            questions = []
            for row in csv:
                if course in row:
                    questions.append(int(row[1]))
            return sum(questions)

    def stats(self, course):
        print()
        print(f"Data Saved for {course}")
        print(f"Average Grade for {course} is {self.averages(course)}")
        print(f"{self.total_questions(course)} questions answered.")
        print()

    async def check(self) -> None:
        while True:
            self.update_length()
            for count, flag in enumerate(self.flags):
                if flag:
                    self.save_data(count)
                    course = list(self.courses.keys())[count]
                    self.stats(course)
            self.clear_flags()
            print(f"Sleeping for {self.sleep} seconds")
            await asyncio.sleep(self.sleep)

    def run(self):
        asyncio.run(self.check())


if __name__ == "__main__":
    Screen().run()
    # print()
    # print(dir(px.colors.qualitative))

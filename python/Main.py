import asyncio
from matplotlib import pyplot as plt
import seaborn as sns
import os


class Screen:

    def __init__(self):
        self.sleep = 60  # seconds
        self.global_array = []
        self.course = {
            "Web Services": 0,
            "Web Dev": 0,
            "DSA": 0,
            "PT2": 0
        }

    def update_length(self):
        for course in self.course:
            directory = os.listdir("../records/" + course + "/")
            self.course[course] = len(directory)
            if self.course[course] != len(directory):
                self.course[course] = len(directory)

    def update_dataset(self):
        for item in os.listdir("../records"):
            self.global_array.append(item)

    def open(self, course):
        for item in self.global_array:
            with(open("../records/" + course + "/" + item)) as file:
                print(file.read())

    async def check(self):
        while True:
            self.update_length()
            for course in self.course:
                self.open(course)
            await asyncio.sleep(self.sleep)

    def plot(self):
        # plot
        plt.title("Title")

    def run(self):
        asyncio.run(self.check())


if __name__ == "__main__":
    Screen().run()

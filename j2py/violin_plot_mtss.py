import os

import matplotlib.pyplot as plt
import pandas as pd
import seaborn as sns
from pandas import DataFrame
from progress.bar import Bar

if __name__ == "__main__":
    data = pd.read_csv("csvs/merged_mutants.csv")
    if not os.path.exists("plots"):
        os.makedirs("plots", exist_ok=True)

    percentage = lambda item: sum(item) / len(item)

    grouped = data.groupby(['class', 'mutant']).agg({"equal_results": percentage})
    grouped = grouped.rename(columns={"equal_results": "Surviving Score"})

    plt.figure()
    violin = sns.violinplot(data=grouped, y="Surviving Score", cut=0, bw=0.01)
    violin.set(ylabel="Mutant Surviving Score")
    plt.savefig('plots/violin_mtss_mutant.png')

    grouped = grouped.groupby('class')["Surviving Score"].mean().to_frame("Surviving Score")

    plt.figure()
    violin = sns.violinplot(data=grouped, y="Surviving Score", cut=0, bw=0.01)
    violin.set(ylabel="Mean Mutant Surviving Score per Class")
    plt.savefig('plots/violin_mtss.png')

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
    aggregate_mutants = lambda item: all(item)


    grouped = data.groupby(['class', 'mutant']).agg({"equal_results": aggregate_mutants})
    grouped = grouped.groupby(["class"]).agg({"equal_results": percentage})
    grouped = grouped.rename(columns={"equal_results": "Surviving Score"})

    plt.figure()
    violin = sns.violinplot(data=grouped, y="Surviving Score", cut=0, bw=0.01)
    violin.set(ylabel="Mutant Surviving Score")
    plt.savefig('plots/violin_mtss_mutant.png')

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
    aggregate_mutants = lambda item: not all(item)

    # Find the mutants with all at least one different output outputs
    mts_name = "Mutation-based Translation Score"
    grouped = data.groupby(['class', 'mutant']).agg({"equal_results": aggregate_mutants})
    grouped = grouped.rename(columns={"equal_results": mts_name})
    print(f"Number of classes: {len(data.groupby(['class']))}")
    print(f"Number of non-anomalous mutants: {len(data.groupby(['class', 'mutant']))}")
    print(f"Number of killed mutants: {len(grouped[grouped[mts_name] != 0])}")
    print(f"General MTS: {grouped.agg({mts_name: percentage})[mts_name]}")
    # Group by class and get the percentage of mutants that were killed
    grouped = grouped.groupby(["class"]).agg({mts_name: percentage})

    print(f"Number of 0 MTSS: {len(grouped.loc[grouped[mts_name] == 0].index)}")
    print(f"Percentage of 0 MTSS: {len(grouped.loc[grouped[mts_name] == 0].index) / len(grouped.index)}")
    print(f"Number of 1 MTSS: {len(grouped.loc[grouped[mts_name] == 1].index)}")
    print(f"Percentage of 1 MTSS: {len(grouped.loc[grouped[mts_name] == 1].index) / len(grouped.index)}")
    print(f"Mean: {grouped[mts_name].mean()}")
    print(f"Median: {grouped[mts_name].median()}")
    print(f"Standard Deviation: {grouped[mts_name].std()}")

    plt.figure()
    violin = sns.violinplot(data=grouped, y=mts_name, cut=0, bw=0.01)
    violin.set(ylabel="Mutant-based Translation Score per Program")
    plt.savefig('plots/violin_mts.png')

    data = pd.read_csv("csvs/merged_original.csv")
    # Group by class and get the percentage of mutants that survived
    original_grouped = data.groupby(["class"]).agg({'equal_results': percentage})
    accuracy_name = "Computational Accuracy"
    original_grouped = original_grouped.rename(columns={"equal_results": accuracy_name})
    print()
    print(f"Number of classes: {len(original_grouped.groupby(['class']))}")
    print(f"CA: {data.agg({'equal_results': percentage})['equal_results']}")
    print(f"Number of correct outputs: {data.agg({'equal_results': sum})['equal_results']}")
    print(f"Number of 0 CA: {len(original_grouped.loc[original_grouped[accuracy_name] == 0].index)}")
    print(f"Percentage of 0 CA: {len(original_grouped.loc[original_grouped[accuracy_name] == 0].index) / len(original_grouped.index)}")
    print(f"Number of 1 CA: {len(original_grouped.loc[original_grouped[accuracy_name] == 1].index)}")
    print(f"Percentage of 1 CA: {len(original_grouped.loc[original_grouped[accuracy_name] == 1].index) / len(original_grouped.index)}")
    print(f"Mean: {original_grouped[accuracy_name].mean()}")
    print(f"Median: {original_grouped[accuracy_name].median()}")
    print(f"Standard Deviation: {original_grouped[accuracy_name].std()}")

    plt.figure()
    violin = sns.violinplot(data=original_grouped, y=accuracy_name, cut=0, bw=0.01)
    violin.set(ylabel="Computational Accuracy per Program")
    plt.savefig('plots/violin_computational_accuracy.png')

    print(grouped)
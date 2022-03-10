import codecs
import csv
import os

from glob import glob
from tqdm import tqdm

csvs = glob('../MuJava/result/**/*.csv', recursive=True)

# progress = tqdm(csvs)
for csv_file in csvs:
    print(csv_file)
    with open(csv_file, "r", encoding="latin-1") as file:
        content = file.readlines()
    with open(csv_file, "w", encoding="latin-1") as file:
        for line in content:
            row = line.split(',', 3)
            if len(row) >= 4:
                row[3] = row[3].replace(",", ";")
            file.write(",".join(row))

import os.path
from pathlib import Path

from glob2 import glob

result_path = os.path.join("..", "MuJava", "result")
containing_dirs = glob(result_path + "/*")
dir_names = [Path(directory).name for directory in containing_dirs]

with open("python_translated_mutants.txt", "w") as mutants_file:
    for containing_dir in containing_dirs:
        mutants_dir = os.path.join(containing_dir, "traditional_mutants")
        with open(os.path.join(mutants_dir, "method_list"), "r") as method_list:
            method_name = method_list.readline().strip("\n")
        mutants_dir = os.path.join(mutants_dir, method_name)
        mutants_list = glob(mutants_dir + "/*/*.py")
        [mutants_file.write(str(mutant).replace(result_path, "").replace("\\", "/").strip("/") + "\n") for mutant in mutants_list]

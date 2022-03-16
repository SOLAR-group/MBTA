import codecs
import os
from pathlib import Path

from progress.bar import Bar
from tqdm import tqdm

if __name__ == "__main__":
    directory = '../..'
    with open(f'{directory}/intersecting_java_mutants.txt', 'r') as mutants_file:
        lines = mutants_file.readlines()
    num_java_mutants = 0
    num_java_compiled = 0
    num_java_runnable = 0
    num_java_time_out = 0
    num_java_10_outputs = 0
    num_java_exception = 0
    num_java_success = 0
    num_python_mutants = 0
    num_python_compiled = 0
    num_python_runnable = 0
    num_python_time_out = 0
    num_python_10_outputs = 0
    num_python_exception = 0
    num_python_success = 0

    progress = tqdm(lines)
    for line in progress:
        line = line.replace('\n', '')
        # split_line = line.split('/')
        mutant_dir = directory + '/../MuJava/result/' + line
        output_dir = directory + '/../MuJava/result/' + line

        java_mutant = mutant_dir
        if os.path.isfile(java_mutant) and os.path.getsize(java_mutant) > 0:
            num_java_mutants += 1
            java_compiled = mutant_dir.replace(".java", ".class")
            if os.path.isfile(java_compiled) and os.path.getsize(java_compiled) > 0:
                num_java_compiled += 1
                java_output = output_dir.replace(".java", ".csv")
                if os.path.isfile(java_output) and os.path.getsize(java_output) > 0:
                    num_java_runnable += 1
                    with codecs.open(java_output, 'r', encoding="unicode_escape") as output_file:
                        output_lines = output_file.readlines()
                        if 'TIMEOUT' in output_lines[0]:
                            num_java_time_out += 1
                        elif len(output_lines) == 11:
                            num_java_10_outputs += 1
                            if any("EXCEPTION" in element for element in output_lines):
                                num_java_exception += 1
                            else:
                                num_java_success += 1

                                python_mutant = mutant_dir.replace(".java", "_TRANSLATED.py")
                                if os.path.isfile(python_mutant) and os.path.getsize(python_mutant) > 0:
                                    num_python_mutants += 1
                                    python_compiled = os.path.join(Path(mutant_dir).parent, "__pycache__", Path(mutant_dir).name.replace(".java", "_TRANSLATED.cpython-310.pyc"))
                                    if os.path.isfile(python_compiled) and os.path.getsize(python_compiled) > 0:
                                        num_python_compiled += 1
                                    python_output = output_dir.replace(".java", "_TRANSLATED.csv")
                                    if os.path.isfile(python_output) and os.path.getsize(python_output) > 0:
                                        num_python_runnable += 1
                                        with codecs.open(python_output, 'r', encoding="unicode_escape") as output_file:
                                            output_lines = output_file.readlines()
                                            if 'TIMEOUT' in output_lines[0]:
                                                num_python_time_out += 1
                                            elif len(output_lines) == 11:
                                                num_python_10_outputs += 1
                                                if any("EXCEPTION" in element for element in output_lines):
                                                    num_python_exception += 1
                                                else:
                                                    num_python_success += 1

    print(f'Number of Java Mutants: {num_java_mutants} ({round(num_java_mutants/num_java_mutants*100, 2)}%)')
    print(f'Number of Java Compiled Mutants: {num_java_compiled} ({round(num_java_compiled/num_java_mutants*100, 2)}%)')
    print(f'Number of Java Runnable: {num_java_runnable} ({round(num_java_runnable/num_java_mutants*100, 2)}%)')
    print(f'Number of Java Timeout: {num_java_time_out} ({round(num_java_time_out/num_java_mutants*100, 2)}%)')
    print(f'Number of Java 10 outputs: {num_java_10_outputs} ({round(num_java_10_outputs/num_java_mutants*100, 2)}%)')
    print(f'Number of Java Exceptions: {num_java_exception} ({round(num_java_exception/num_java_mutants*100, 2)}%)')
    print(f'Number of Java Success: {num_java_success} ({round(num_java_success/num_java_mutants*100, 2)}%)')
    print()
    print(f'Number of Python Mutants: {num_python_mutants} ({round(num_python_mutants/num_java_success*100, 2)}%)')
    print(f'Number of Python Compiled Mutants: {num_python_compiled} ({round(num_python_compiled/num_java_success*100, 2)}%)')
    print(f'Number of Python Runnable: {num_python_runnable} ({round(num_python_runnable/num_java_success*100, 2)}%)')
    print(f'Number of Python Timeout: {num_python_time_out} ({round(num_python_time_out/num_java_success*100, 2)}%)')
    print(f'Number of Python 10 outputs: {num_python_10_outputs} ({round(num_python_10_outputs/num_java_success*100, 2)}%)')
    print(f'Number of Python Exceptions: {num_python_exception} ({round(num_python_exception/num_java_success*100, 2)}%)')
    print(f'Number of Python Success: {num_python_success} ({round(num_python_success/num_java_success*100, 2)}%)')


import os

from progress.bar import Bar

if __name__ == "__main__":
    directory = '../../TransCode'
    with open(f'{directory}/mutants.txt', 'r') as mutants_file:
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
    with Bar('Processing', max=len(lines)) as bar:
        bar.check_tty = False
        for line in lines:
            bar.next()
            line = line.replace('\n', '')
            split_line = line.split('/')
            mutant_dir = directory + '/mutants/' + line + '/' + split_line[0]
            output_dir = directory + '/output/' + line.replace('/', '-')

            java_mutant = mutant_dir + '.java'
            if os.path.isfile(java_mutant) and os.path.getsize(java_mutant) > 0:
                num_java_mutants += 1
                java_compiled = mutant_dir + '.class'
                if os.path.isfile(java_compiled) and os.path.getsize(java_compiled) > 0:
                    num_java_compiled += 1
                    java_output = output_dir + ".csv"
                    if os.path.isfile(java_output) and os.path.getsize(java_output) > 0:
                        num_java_runnable += 1
                        with open(java_output, 'r') as output_file:
                            output_lines = output_file.readlines()
                            if len(output_lines) == 1 and 'TIMEOUT' in output_lines[0]:
                                num_java_time_out += 1
                            elif len(output_lines) == 10:
                                num_java_10_outputs += 1
                                if any("EXCEPTION" in element for element in output_lines):
                                    num_java_exception += 1
                                else:
                                    num_java_success += 1

            python_mutant = mutant_dir + '.py'
            if os.path.isfile(python_mutant) and os.path.getsize(python_mutant) > 0:
                num_python_mutants += 1
                python_compiled = mutant_dir + '.pyc'
                if os.path.isfile(python_compiled) and os.path.getsize(python_compiled) > 0:
                    num_python_compiled += 1
                    python_output = output_dir + "_python.csv"
                    if os.path.isfile(python_output) and os.path.getsize(python_output) > 0:
                        num_python_runnable += 1
                        with open(python_output, 'r') as output_file:
                            output_lines = output_file.readlines()
                            if len(output_lines) == 1 and 'TIMEOUT' in output_lines[0]:
                                num_python_time_out += 1
                            elif len(output_lines) == 10:
                                num_python_10_outputs += 1
                                if any("EXCEPTION" in element for element in output_lines):
                                    num_python_exception += 1
                                else:
                                    num_python_success += 1
                    else:
                        print(python_output)

    print(f'Number of Java Mutants: {num_java_mutants}')
    print(f'Number of Java Compiled Mutants: {num_java_compiled}')
    print(f'Number of Java Runnable: {num_java_runnable}')
    print(f'Number of Java Timeout: {num_java_time_out}')
    print(f'Number of Java 10 outputs: {num_java_10_outputs}')
    print(f'Number of Java Exceptions: {num_java_exception}')
    print(f'Number of Java Success: {num_java_success}')
    print()
    print(f'Number of Python Mutants: {num_python_mutants}')
    print(f'Number of Python Compiled Mutants: {num_python_compiled}')
    print(f'Number of Python Runnable: {num_python_runnable}')
    print(f'Number of Python Timeout: {num_python_time_out}')
    print(f'Number of Python 10 outputs: {num_python_10_outputs}')
    print(f'Number of Python Exceptions: {num_python_exception}')
    print(f'Number of Python Success: {num_python_success}')

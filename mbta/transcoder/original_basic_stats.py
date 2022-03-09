import os

from progress.bar import Bar

if __name__ == "__main__":
    directory = '../../TransCode'
    with open(f'{directory}/classes.txt', 'r') as mutants_file:
        lines = mutants_file.readlines()
    num_java_programs = 0
    num_java_compiled = 0
    num_java_runnable = 0
    num_java_time_out = 0
    num_java_10_outputs = 0
    num_java_exception = 0
    num_java_success = 0
    num_python_programs = 0
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
            original_dir = directory + '/mutants/' + line + '/original/' + line

            java_mutant = original_dir + '.java'
            if os.path.isfile(java_mutant) and os.path.getsize(java_mutant) > 0:
                num_java_programs += 1
                java_compiled = original_dir + '.class'
                if os.path.isfile(java_compiled) and os.path.getsize(java_compiled) > 0:
                    num_java_compiled += 1
                    java_output = directory + '/output/' + line + '_original.csv'
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

            python_mutant = original_dir + '.py'
            if os.path.isfile(python_mutant) and os.path.getsize(python_mutant) > 0:
                num_python_programs += 1
                python_compiled = original_dir + '.pyc'
                if os.path.isfile(python_compiled) and os.path.getsize(python_compiled) > 0:
                    num_python_compiled += 1
                    python_output = directory + '/output/' + line + '_original_python.csv'
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

    print(f'Number of Java Programs: {num_java_programs}')
    print(f'Number of Java Compiled Programs: {num_java_compiled}')
    print(f'Number of Java Runnable: {num_java_runnable}')
    print(f'Number of Java Timeout: {num_java_time_out}')
    print(f'Number of Java 10 outputs: {num_java_10_outputs}')
    print(f'Number of Java Exceptions: {num_java_exception}')
    print(f'Number of Java Success: {num_java_success}')
    print()
    print(f'Number of Python Programs: {num_python_programs}')
    print(f'Number of Python Compiled Mutants: {num_python_compiled}')
    print(f'Number of Python Runnable: {num_python_runnable}')
    print(f'Number of Python Timeout: {num_python_time_out}')
    print(f'Number of Python 10 outputs: {num_python_10_outputs}')
    print(f'Number of Python Exceptions: {num_python_exception}')
    print(f'Number of Python Success: {num_python_success}')

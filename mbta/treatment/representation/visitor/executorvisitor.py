import os.path
import signal
import subprocess
from pathlib import Path

from mbta.treatment.representation.visitor.classvisitor import ClassVisitor


class ExecutorVisitor(ClassVisitor):

    def __init__(self, mutant_id=None):
        self.mutant_id = mutant_id

    def visit_java_file(self, source_file):
        source_path: Path = source_file.source_path
        if "_MAIN" not in source_path.stem:
            csv_output = os.path.join(source_path.parent.absolute(), source_path.stem + ".csv")
            with subprocess.Popen(["java", "-cp", source_path.parent.absolute(), source_path.stem, csv_output,
                                   self.mutant_id if self.mutant_id is not None else "ORIGINAL"],
                                  cwd=source_path.parent.absolute()) as process_object:
                try:
                    process_object.wait(timeout=3)
                except:
                    os.kill(process_object.pid, signal.SIGKILL)
                    with open(csv_output, "w+") as output_file:
                        output_file.write("TIMEOUT\n")
                        output_file.truncate()

    def visit_python_file(self, source_file):
        source_path: Path = source_file.source_path
        if "_MAIN" not in source_path.stem:
            csv_output = os.path.join(source_path.parent.absolute(), source_path.stem + ".csv")
            with open(csv_output, "w+") as output_file, subprocess.Popen(
                    ["python", source_path.absolute(), self.mutant_id if self.mutant_id is not None else "ORIGINAL"],
                    cwd=source_path.parent.absolute(),
                    stdout=output_file) as process_object:
                try:
                    process_object.wait(timeout=3)
                except:
                    os.kill(process_object.pid, signal.SIGKILL)
                    output_file.seek(0, 0)
                    output_file.write("TIMEOUT\n")
                    output_file.truncate()

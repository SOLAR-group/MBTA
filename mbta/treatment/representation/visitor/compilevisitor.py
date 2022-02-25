import subprocess
from pathlib import Path

from mbta.treatment.representation.visitor.classvisitor import ClassVisitor


class CompileVisitor(ClassVisitor):

    def visit_java_file(self, source_file):
        source_path: Path = source_file.source_path
        if "_MAIN" not in source_path.stem:
            with open("output.txt", "a+") as output_file, subprocess.Popen(f"javac {source_path.name}",
                                                                           cwd=source_path.parent.absolute(),
                                                                           stdout=output_file,
                                                                           stderr=output_file) as process_object:
                process_object.wait()

    def visit_python_file(self, source_file):
        pass

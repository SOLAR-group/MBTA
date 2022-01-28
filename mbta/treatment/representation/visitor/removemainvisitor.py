from pathlib import Path

from mbta.treatment.representation.files.javafile import JavaFile
from mbta.treatment.representation.visitor.classvisitor import ClassVisitor


class RemoveMainVisitor(ClassVisitor):
    def visit_java_file(self, source_file):
        source_path: Path = source_file.source_path
        with source_path.open("r+") as file_reader_writer:
            content = file_reader_writer.readlines()
            file_reader_writer.seek(0, 0)
            inject_imports = "import java.io.FileWriter;\nimport java.io.IOException;\n"
            if inject_imports not in content:
                file_reader_writer.write(inject_imports)
            copy = True
            for line in content:
                if copy:
                    if line.startswith("//TOFILL"):
                        copy = False
                    file_reader_writer.write(line)
                else:
                    file_reader_writer.write("\n}\n")
                    break
            file_reader_writer.truncate()

    def visit_python_file(self, source_file):
        pass

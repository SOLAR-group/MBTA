from pathlib import Path

from mbta.treatment.representation.files.javafile import JavaFile
from mbta.treatment.representation.visitor.classvisitor import ClassVisitor


class RemoveMainVisitor(ClassVisitor):
    def visit_java_file(self, source_file):
        source_path: Path = source_file.source_path
        if "_MAIN" not in source_path.stem:
            with source_path.open("r+") as file_reader_writer:
                content = file_reader_writer.readlines()
                file_reader_writer.seek(0, 0)
                inject_imports = ["import java.io.FileWriter;\n", "import java.io.IOException;\n"]
                if not inject_imports == content[:2]:
                    file_reader_writer.write("".join(inject_imports))
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
        source_path: Path = source_file.source_path
        if "_MAIN" not in source_path.stem:
            with source_path.open("r+") as file_reader_writer:
                content = file_reader_writer.readlines()
                file_reader_writer.seek(0, 0)
                copy = True
                for line in content:
                    if copy:
                        if line.startswith("#TOFILL"):
                            copy = False
                        file_reader_writer.write(line)
                    else:
                        break
                file_reader_writer.truncate()

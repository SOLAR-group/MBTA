import os.path
from pathlib import Path

from mbta.treatment.representation.files.javafile import JavaFile
from mbta.treatment.representation.visitor.classvisitor import ClassVisitor


class CopyMainVisitor(ClassVisitor):

    def __init__(self, main_path):
        self.main_path = main_path

    def visit_java_file(self, source_file):
        source_path: Path = source_file.source_path
        if "_MAIN" not in source_path.stem:
            with source_path.open("r+") as file_reader_writer:
                content = file_reader_writer.readlines()
                file_reader_writer.seek(0, 0)
                copy = True
                for line in content:
                    if copy:
                        if line.startswith("//TOFILL"):
                            copy = False
                        file_reader_writer.write(line)
                    else:
                        break
                with open(os.path.join(self.main_path, source_path.stem + "_MAIN" + source_path.suffix)) as main_file:
                    if copy:
                        file_reader_writer.seek(file_reader_writer.tell() - 3)
                    for line in main_file:
                        file_reader_writer.write(line)
                    file_reader_writer.write("}\n")
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
                with open(os.path.join(self.main_path, source_path.stem + "_MAIN" + source_path.suffix)) as main_file:
                    for line in main_file:
                        file_reader_writer.write(line)
                file_reader_writer.truncate()

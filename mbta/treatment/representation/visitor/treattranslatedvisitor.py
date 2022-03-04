import os.path
from pathlib import Path

from mbta.treatment.representation.files.javafile import JavaFile
from mbta.treatment.representation.visitor.classvisitor import ClassVisitor


class TreatTranslatedVisitor(ClassVisitor):

    def __init__(self, main_path):
        self.main_path = main_path

    def visit_java_file(self, source_file):
        pass

    def visit_python_file(self, source_file):
        source_path: Path = source_file.source_path
        if "_MAIN" not in source_path.stem:
            with source_path.open("r+") as file_reader_writer:
                content = file_reader_writer.readlines()
                if content[0].startswith("="):
                    main_path = Path(os.path.join(self.main_path,
                                        source_path.stem.replace("_TRANSLATED", "") + "_MAIN" + source_path.suffix))
                    if os.path.exists(main_path):
                        def_function = content[1]
                        def_function = "def f_gold (" + def_function.partition("(")[2]
                        file_reader_writer.seek(0, 0)
                        file_reader_writer.write("import sys\n\n")
                        file_reader_writer.write(def_function)
                        content = content[2:]
                        for line in content:
                            file_reader_writer.write(line)
                        with open(main_path) as main_file:
                            for line in main_file:
                                file_reader_writer.write(line)
                        file_reader_writer.truncate()
                    else:
                        print(f"Ops! {main_path.name} does not exist! Skipping.")

import os
import subprocess
from pathlib import Path

from mbta.treatment.representation.visitor.classvisitor import ClassVisitor


class TranslateVisitor(ClassVisitor):

    def __init__(self, transcoder_path):
        self.transcoder_path: Path = Path(transcoder_path)

    def validate(self, source_stem, translated_path):
        return "_TRANSLATED" not in source_stem and "_MAIN" not in source_stem and not os.path.exists(translated_path)

    def get_default_info(self, source_file):
        source_path: Path = source_file.source_path
        source_stem: str = source_path.stem
        translated_path = source_path.with_stem(source_stem + "_TRANSLATED")
        return translated_path, source_path, source_stem

    def visit_java_file(self, source_file):
        translated_path, source_path, source_stem = self.get_default_info(source_file)
        if self.validate(source_stem, translated_path.with_suffix(".py")):
            self.translate_java(translated_path.with_suffix(".py"), source_path, source_stem)

    def visit_python_file(self, source_file):
        translated_path, source_path, source_stem = self.get_default_info(source_file)
        if self.validate(source_stem, translated_path.with_suffix(".java")):
            self.translate_python(translated_path.with_suffix(".java"), source_path, source_stem)

    def translate_java(self, translated_path, source_path, source_stem):
        with open(translated_path, "w") as stdout_file:
            command = f'''
cd {self.transcoder_path.resolve()}
. venv/bin/activate
python3 translate.py --src_lang java --tgt_lang python --model_path model_1.pth < {str(source_path.resolve())}
'''
            # print(command)
            with subprocess.Popen(command, shell=True, stdout=stdout_file, stderr=subprocess.DEVNULL) as process_object:
                process_object.wait()

    def translate_python(self, translated_path, source_path, source_stem):
        with open(translated_path, "w") as stdout_file:
            command = f'''
cd {self.transcoder_path.resolve()}
. venv/bin/activate
python3 translate.py --src_lang python --tgt_lang java --model_path model_2.pth < {str(source_path.resolve())}
'''
            # print(command)
            with subprocess.Popen(command, shell=True, stdout=stdout_file, stderr=subprocess.DEVNULL) as process_object:
                process_object.wait()

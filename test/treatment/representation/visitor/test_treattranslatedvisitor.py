import os
import shutil
from pathlib import Path
from unittest import TestCase

from mbta.treatment.representation.files.javafile import JavaFile
from mbta.treatment.representation.files.pythonfile import PythonFile
from mbta.treatment.representation.visitor.copymainvisitor import CopyMainVisitor
from mbta.treatment.representation.visitor.treattranslatedvisitor import TreatTranslatedVisitor


class TestTreatTranslatedVisitor(TestCase):
    test_resource2: PythonFile = PythonFile(Path("./resources/Test_TRANSLATED.py"))

    def test_visit_python_file(self):
        orignal_path = self.test_resource2.source_path
        generated = PythonFile(orignal_path.with_stem("Test_TRANSLATED_TEMP"))
        shutil.copyfile(orignal_path, generated.source_path)
        generated_main = shutil.copyfile(orignal_path.with_stem("Test_MAIN_expected"),
                                         generated.source_path.with_stem("Test_TEMP_MAIN"))
        visitor = TreatTranslatedVisitor("./resources/")
        generated.accept(visitor)
        with open(generated.source_path) as main_generated, open(
                "./resources/Test_TRANSLATED_TEMP_MAIN_expected.py") as main_expected:
            self.assertSequenceEqual(main_generated.readlines(), main_expected.readlines())
        os.remove(generated.source_path)
        os.remove(generated_main)

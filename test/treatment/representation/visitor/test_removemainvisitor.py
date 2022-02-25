import os
import shutil
import sys
from pathlib import Path
from unittest import TestCase

from mbta.treatment.representation.files.javafile import JavaFile
from mbta.treatment.representation.files.pythonfile import PythonFile
from mbta.treatment.representation.visitor.removemainvisitor import RemoveMainVisitor


class TestRemoveMainVisitor(TestCase):
    test_resource: JavaFile = JavaFile(Path("./resources/Test.java"))
    test_resource2: PythonFile = PythonFile(Path("./resources/Test.py"))

    def test_visit_java_file(self):
        orignal_path = self.test_resource.source_path
        generated = JavaFile(orignal_path.with_stem("Test_TEMP"))
        shutil.copyfile(orignal_path, generated.source_path)
        visitor = RemoveMainVisitor()
        generated.accept(visitor)
        with open(generated.source_path) as main_generated, open(
                "./resources/Test_TEMP_expected.java") as main_expected:
            self.assertSequenceEqual(main_generated.readlines(), main_expected.readlines())
        os.remove(generated.source_path)

    def test_visit_python_file(self):
        orignal_path = self.test_resource2.source_path
        generated = PythonFile(orignal_path.with_stem("Test_TEMP"))
        shutil.copyfile(orignal_path, generated.source_path)
        visitor = RemoveMainVisitor()
        generated.accept(visitor)
        with open(generated.source_path) as main_generated, open(
                "./resources/Test_TEMP_expected.py") as main_expected:
            self.assertSequenceEqual(main_generated.readlines(), main_expected.readlines())
        os.remove(generated.source_path)

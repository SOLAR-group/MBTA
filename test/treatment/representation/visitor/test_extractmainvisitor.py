import os
import sys
from pathlib import Path
from unittest import TestCase

from mbta.treatment.representation.files.javafile import JavaFile
from mbta.treatment.representation.files.pythonfile import PythonFile
from mbta.treatment.representation.visitor.extractmainvisitor import ExtractMainVisitor


class TestExtractMainVisitor(TestCase):
    test_resource: JavaFile = JavaFile(Path("./resources/Test.java"))
    test_resource2: JavaFile = JavaFile(Path("./resources/Test2.java"))
    test_resource3: PythonFile = PythonFile(Path("./resources/Test.py"))
    test_resource4: PythonFile = PythonFile(Path("./resources/Test2.py"))

    def test_visit_java_file(self):
        visitor = ExtractMainVisitor()
        self.test_resource.accept(visitor)
        generated = "./resources/Test_MAIN.java"
        with open(generated) as main_generated, open(
                "./resources/Test_MAIN_expected.java") as main_expected:
            self.assertSequenceEqual(main_generated.readlines(), main_expected.readlines())
        os.remove(generated)

    def test_visit_java_file2(self):
        visitor = ExtractMainVisitor()
        self.test_resource2.accept(visitor)
        generated = "./resources/Test2_MAIN.java"
        with open(generated) as main_generated, open(
                "./resources/Test_MAIN_expected2.java") as main_expected:
            self.assertSequenceEqual(main_generated.readlines(), main_expected.readlines())
        os.remove(generated)

    def test_visit_python_file(self):
        visitor = ExtractMainVisitor()
        self.test_resource3.accept(visitor)
        generated = "./resources/Test_MAIN.py"
        with open(generated) as main_generated, open(
                "./resources/Test_MAIN_expected.py") as main_expected:
            self.assertSequenceEqual(main_generated.readlines(), main_expected.readlines())
        os.remove(generated)

    def test_visit_python_file2(self):
        visitor = ExtractMainVisitor()
        self.test_resource4.accept(visitor)
        generated = "./resources/Test2_MAIN.py"
        with open(generated) as main_generated, open(
                "./resources/Test_MAIN_expected2.py") as main_expected:
            self.assertSequenceEqual(main_generated.readlines(), main_expected.readlines())
        os.remove(generated)
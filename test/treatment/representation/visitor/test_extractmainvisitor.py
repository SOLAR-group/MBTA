import os
import sys
from pathlib import Path
from unittest import TestCase

from mbta.treatment.representation.files.javafile import JavaFile
from mbta.treatment.representation.visitor.extractmainvisitor import ExtractMainVisitor


class TestExtractMainVisitor(TestCase):
    test_resource: JavaFile = JavaFile(Path("./resources/Test.java"))

    def test_visit_java_file(self):
        visitor = ExtractMainVisitor()
        self.test_resource.accept(visitor)
        generated = "./resources/Test_MAIN.java"
        with open(generated) as main_generated, open(
                "./resources/Test_MAIN_expected.java") as main_expected:
            self.assertSequenceEqual(main_generated.readlines(), main_expected.readlines())
        os.remove(generated)

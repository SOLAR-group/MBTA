import os.path

from mbta.treatment.representation.visitor.classvisitor import ClassVisitor


class ExtractMainVisitor(ClassVisitor):

    def validate(self, source_stem, main_path):
        return "_MAIN" not in source_stem and "_TRANSLATED" not in source_stem and not os.path.exists(main_path)

    def get_default_info(self, source_file):
        source_path = source_file.source_path
        source_stem: str = source_path.stem
        main_path = source_path.with_stem(source_stem + "_MAIN")
        return main_path, source_path, source_stem

    def visit_java_file(self, source_file):
        main_path, source_path, source_stem = self.get_default_info(source_file)
        if self.validate(source_stem, main_path):
            self.create_java_main(main_path, source_path, source_stem)

    def visit_python_file(self, source_file):
        main_path, source_path, source_stem = self.get_default_info(source_file)
        if self.validate(source_stem, main_path):
            self.create_python_main(main_path, source_path, source_stem)

    def create_java_main(self, main_path, source_path, source_stem):
        with source_path.open() as file_reader, main_path.open("w") as file_writer:
            inside_main = 0
            for line in file_reader:
                if inside_main == 0 and line.strip().startswith("public static void main"):
                    inside_main = 1
                    file_writer.write("public static void main(String args[]) throws IOException {\n")
                elif inside_main == 1:
                    if line.strip().startswith("for(int i = 0; i < param0.size(); ++i)"):
                        inside_main = 2
                        file_writer.write("""\
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\\n");
    FileWriter writer = new FileWriter(args[0]);
""")
                    file_writer.write(line)
                elif inside_main == 2:
                    inside_main = 3
                    file_writer.write("""\
    {
        try {
""")
                elif inside_main == 3:
                    if line.strip().startswith("f_filled"):
                        continue
                    if line.strip().startswith("if"):
                        if "f_gold" in line:
                            start_index = line.find("f_gold")
                            end_index = line.find("))", start_index) + 2
                            string_to_append = line[start_index:end_index]
                        else:
                            split = str(line).split("&&")
                            strings_to_append = []
                            for part in split:
                                if part.strip().startswith("if("):
                                    part = part.replace("if(", "")
                                if part.strip().startswith("Arrays.equals("):
                                    strings_to_append.append("Arrays.toString(" + part.split(",")[0].replace("Arrays.equals(", "").strip() + ").replace(\",\", \";\")")
                                else:
                                    strings_to_append.append(part.split("==")[0].strip())
                            string_to_append = ' + ";" + '.join(strings_to_append)
                        file_writer.write(f"""\
            builder.append("{source_stem}," + args[1] + "," + i + "," + {string_to_append} + "\\n");
        }} catch (Exception e) {{
            builder.append("{source_stem}," + args[1] + "," + i + ",EXCEPTION\\n");
        }}
    }}
    writer.write(builder.toString());
    writer.close();
}}
""")
                        break
                    else:
                        file_writer.write("\t" + line)

    def create_python_main(self, main_path, source_path, source_stem):
        with source_path.open() as file_reader, main_path.open("w") as file_writer:
            inside_main = 0
            for line in file_reader:
                if inside_main == 0 and line.strip().startswith("if __name__ == '__main__':"):
                    inside_main = 1
                    file_writer.write(line)
                elif inside_main == 1:
                    if line.strip().startswith("for i, parameters_set in enumerate(param):"):
                        inside_main = 2
                        file_writer.write('    print("class,mutant,test_index,result")\n')
                    file_writer.write(line)
                elif inside_main == 2:
                    file_writer.write("""\
        try:
""")
                    inside_main = 3
                if inside_main == 3:
                    if line.strip().startswith("f_filled"):
                        continue
                    if line.strip().startswith("if"):
                        if "f_gold" in line:
                            start_index = line.find("f_gold")
                            end_index = line.find(")", start_index) + 1
                            string_to_append = line[start_index:end_index]
                            string_to_append = "str(" + string_to_append + ")"
                        else:
                            string_to_append = "','.join(str(e) for e in parameters_set).replace(',', ';')"
                        file_writer.write(f"""\
            print("{source_stem}," + sys.argv[1] + "," + str(i) + "," + {string_to_append})
        except:
            print("{source_stem}," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
""")
                        break
                    else:
                        file_writer.write("    " + line)

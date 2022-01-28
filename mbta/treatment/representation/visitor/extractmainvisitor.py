from mbta.treatment.representation.visitor.classvisitor import ClassVisitor


class ExtractMainVisitor(ClassVisitor):
    def visit_java_file(self, source_file):
        source_path = source_file.source_path
        source_stem: str = source_path.stem
        if "_MAIN" not in source_stem:
            main_path = source_path.with_stem(source_stem + "_MAIN")
            main_stem = main_path.stem
            self.create_java_main(main_path, main_stem, source_path, source_stem)

    def create_java_main(self, main_path, main_stem, source_path, source_stem):
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
    builder.append("class,mutant,test_index,result");
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
                    if line.strip().startswith("n_success+=1;"):
                        file_writer.write(f"""\
                builder.append("{main_stem}," + args[1] + "," + i + ",SUCCESS\\n");
            }} else {{
                builder.append("{main_stem}," + args[1] + "," + i + ",FAILURE\\n");
            }}
        }} catch (Exception e) {{
            builder.append("{main_stem}," + args[1] + "," + i + ",EXCEPTION\\n");
        }}
    }}
    writer.write(builder.toString());
    writer.close();
}}
""")
                        break
                    else:
                        file_writer.write("\t" + line)

    def visit_python_file(self, source_file):
        pass

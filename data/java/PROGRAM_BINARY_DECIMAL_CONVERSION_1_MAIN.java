public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("uEmIAgF");
    param0.add("753310137");
    param0.add("010011010");
    param0.add("kNi");
    param0.add("04562016903312");
    param0.add("000111101");
    param0.add("bk");
    param0.add("9");
    param0.add("1");
    param0.add("XxT nXLlk");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PROGRAM_BINARY_DECIMAL_CONVERSION_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PROGRAM_BINARY_DECIMAL_CONVERSION_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

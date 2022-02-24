public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("1001ab010abc01001");
    param0.add("1001010001");
    param0.add("010100010100");
    param0.add("DLCu");
    param0.add("7072430592");
    param0.add("011");
    param0.add("pnJpypYOza");
    param0.add("1037");
    param0.add("111");
    param0.add("HxK");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_OF_OCCURRENCES_OF_A_101_PATTERN_IN_A_STRING," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_OF_OCCURRENCES_OF_A_101_PATTERN_IN_A_STRING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

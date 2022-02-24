public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("aabcdaabc");
    param0.add("1372494598");
    param0.add("110000100001");
    param0.add("abcab");
    param0.add("488938");
    param0.add("011010101011");
    param0.add("aaaa");
    param0.add("3356203205");
    param0.add("1010");
    param0.add("kkXiiTZkGeh");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("LONGEST_PREFIX_ALSO_SUFFIX_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("LONGEST_PREFIX_ALSO_SUFFIX_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

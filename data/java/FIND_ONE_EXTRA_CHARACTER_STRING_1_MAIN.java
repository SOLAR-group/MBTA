public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("obfLA mmMYvghH");
    param0.add("2941");
    param0.add("0111111");
    param0.add("oWvbFstI");
    param0.add("4937516500");
    param0.add("101110100");
    param0.add("hYZscJQFBE");
    param0.add("58443");
    param0.add("1100");
    param0.add("ZUdYuIBVNaeeb");
    List<String> param1 = new ArrayList<>();
    param1.add("obfLA  mmMYvghH");
    param1.add("2941");
    param1.add("0111111");
    param1.add("oWvbFstI");
    param1.add("4937516500");
    param1.add("101110100");
    param1.add("hYZscJQFBE");
    param1.add("58443");
    param1.add("1100");
    param1.add("ZUdYuIBVNaeeb");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FIND_ONE_EXTRA_CHARACTER_STRING_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FIND_ONE_EXTRA_CHARACTER_STRING_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

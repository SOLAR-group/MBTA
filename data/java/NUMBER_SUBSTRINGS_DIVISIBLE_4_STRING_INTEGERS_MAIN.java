public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("Qaq");
    param0.add("9400761825850");
    param0.add("0011001111");
    param0.add("lasWqrLRq");
    param0.add("5662");
    param0.add("110");
    param0.add(" tOYKf");
    param0.add("6536991235305");
    param0.add("11111");
    param0.add("uZftT iDHcYiCt");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("NUMBER_SUBSTRINGS_DIVISIBLE_4_STRING_INTEGERS," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("NUMBER_SUBSTRINGS_DIVISIBLE_4_STRING_INTEGERS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

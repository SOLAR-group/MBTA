public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("onWEchl");
    param0.add("2");
    param0.add("100");
    param0.add("GHbCZA");
    param0.add("50568798206105");
    param0.add("001011110001");
    param0.add("lljpYhznnyu");
    param0.add("54499921759984");
    param0.add("11101");
    param0.add("qvypgCYEjsyjwZ");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("LEXICOGRAPHICALLY_MINIMUM_STRING_ROTATION," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("LEXICOGRAPHICALLY_MINIMUM_STRING_ROTATION," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

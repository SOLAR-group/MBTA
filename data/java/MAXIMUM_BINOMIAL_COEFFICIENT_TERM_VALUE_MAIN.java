public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(23);
    param0.add(41);
    param0.add(69);
    param0.add(56);
    param0.add(71);
    param0.add(38);
    param0.add(26);
    param0.add(52);
    param0.add(93);
    param0.add(44);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MAXIMUM_BINOMIAL_COEFFICIENT_TERM_VALUE," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MAXIMUM_BINOMIAL_COEFFICIENT_TERM_VALUE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

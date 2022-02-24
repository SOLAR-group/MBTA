public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(29);
    param0.add(97);
    param0.add(71);
    param0.add(82);
    param0.add(69);
    param0.add(30);
    param0.add(82);
    param0.add(32);
    param0.add(77);
    param0.add(39);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_SUM_OF_DIGITS_IN_NUMBERS_FROM_1_TO_N," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_SUM_OF_DIGITS_IN_NUMBERS_FROM_1_TO_N," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

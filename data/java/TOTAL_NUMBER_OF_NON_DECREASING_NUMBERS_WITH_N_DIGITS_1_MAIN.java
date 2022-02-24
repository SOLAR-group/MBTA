public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(40);
    param0.add(11);
    param0.add(94);
    param0.add(73);
    param0.add(6);
    param0.add(73);
    param0.add(58);
    param0.add(40);
    param0.add(64);
    param0.add(66);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

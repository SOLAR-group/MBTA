public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(6);
    param0.add(35);
    param0.add(87);
    param0.add(91);
    param0.add(63);
    param0.add(11);
    param0.add(66);
    param0.add(17);
    param0.add(92);
    param0.add(81);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("SUM_LARGEST_PRIME_FACTOR_NUMBER_LESS_EQUAL_N," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("SUM_LARGEST_PRIME_FACTOR_NUMBER_LESS_EQUAL_N," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(90);
    param0.add(56);
    param0.add(43);
    param0.add(31);
    param0.add(77);
    param0.add(35);
    param0.add(43);
    param0.add(66);
    param0.add(15);
    param0.add(95);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

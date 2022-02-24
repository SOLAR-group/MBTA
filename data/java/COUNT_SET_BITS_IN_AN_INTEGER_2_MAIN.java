public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(32);
    param0.add(94);
    param0.add(33);
    param0.add(99);
    param0.add(17);
    param0.add(64);
    param0.add(80);
    param0.add(42);
    param0.add(12);
    param0.add(86);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_SET_BITS_IN_AN_INTEGER_2," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_SET_BITS_IN_AN_INTEGER_2," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

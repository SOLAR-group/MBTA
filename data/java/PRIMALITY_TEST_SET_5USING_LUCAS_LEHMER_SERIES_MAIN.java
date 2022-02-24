public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(11);
    param0.add(27);
    param0.add(31);
    param0.add(47);
    param0.add(3);
    param0.add(14);
    param0.add(41);
    param0.add(72);
    param0.add(39);
    param0.add(22);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

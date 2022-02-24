public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(31);
    param0.add(72);
    param0.add(23);
    param0.add(42);
    param0.add(13);
    param0.add(93);
    param0.add(33);
    param0.add(94);
    param0.add(60);
    param0.add(11);
    List<Integer> param1 = new ArrayList<>();
    param1.add(91);
    param1.add(85);
    param1.add(49);
    param1.add(32);
    param1.add(7);
    param1.add(5);
    param1.add(32);
    param1.add(76);
    param1.add(60);
    param1.add(26);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_OF_PAIRS_SATISFYING_THE_GIVEN_CONDITION," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_OF_PAIRS_SATISFYING_THE_GIVEN_CONDITION," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

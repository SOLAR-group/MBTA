public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(84);
    param0.add(95);
    param0.add(67);
    param0.add(92);
    param0.add(97);
    param0.add(13);
    param0.add(37);
    param0.add(9);
    param0.add(10);
    param0.add(90);
    List<Integer> param1 = new ArrayList<>();
    param1.add(99);
    param1.add(64);
    param1.add(21);
    param1.add(22);
    param1.add(35);
    param1.add(77);
    param1.add(46);
    param1.add(92);
    param1.add(26);
    param1.add(94);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_NUMBER_OF_WAYS_TO_PARTITION_A_SET_INTO_K_SUBSETS_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_NUMBER_OF_WAYS_TO_PARTITION_A_SET_INTO_K_SUBSETS_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

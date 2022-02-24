public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(31);
    param0.add(78);
    param0.add(19);
    param0.add(36);
    param0.add(77);
    param0.add(94);
    param0.add(86);
    param0.add(16);
    param0.add(95);
    param0.add(2);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("ROUND_THE_GIVEN_NUMBER_TO_NEAREST_MULTIPLE_OF_10," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("ROUND_THE_GIVEN_NUMBER_TO_NEAREST_MULTIPLE_OF_10," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(83);
    param0.add(29);
    param0.add(17);
    param0.add(12);
    param0.add(93);
    param0.add(55);
    param0.add(97);
    param0.add(75);
    param0.add(22);
    param0.add(52);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_NUMBER_WAYS_REACH_GIVEN_SCORE_GAME," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_NUMBER_WAYS_REACH_GIVEN_SCORE_GAME," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

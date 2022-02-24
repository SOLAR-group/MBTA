public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(13);
    param0.add(27);
    param0.add(1);
    param0.add(24);
    param0.add(98);
    param0.add(94);
    param0.add(36);
    param0.add(41);
    param0.add(74);
    param0.add(39);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

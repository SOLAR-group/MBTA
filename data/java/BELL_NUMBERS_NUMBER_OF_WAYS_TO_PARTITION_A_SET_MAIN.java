public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(84);
    param0.add(78);
    param0.add(9);
    param0.add(73);
    param0.add(4);
    param0.add(53);
    param0.add(85);
    param0.add(38);
    param0.add(39);
    param0.add(6);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("BELL_NUMBERS_NUMBER_OF_WAYS_TO_PARTITION_A_SET," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("BELL_NUMBERS_NUMBER_OF_WAYS_TO_PARTITION_A_SET," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(60L);
    param0.add(46L);
    param0.add(4L);
    param0.add(67L);
    param0.add(93L);
    param0.add(89L);
    param0.add(8L);
    param0.add(53L);
    param0.add(96L);
    param0.add(38L);
    List<Long> param1 = new ArrayList<>();
    param1.add(24L);
    param1.add(43L);
    param1.add(50L);
    param1.add(1L);
    param1.add(35L);
    param1.add(97L);
    param1.add(78L);
    param1.add(73L);
    param1.add(92L);
    param1.add(64L);
    List<Long> param2 = new ArrayList<>();
    param2.add(58L);
    param2.add(29L);
    param2.add(71L);
    param2.add(66L);
    param2.add(73L);
    param2.add(8L);
    param2.add(55L);
    param2.add(22L);
    param2.add(83L);
    param2.add(83L);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

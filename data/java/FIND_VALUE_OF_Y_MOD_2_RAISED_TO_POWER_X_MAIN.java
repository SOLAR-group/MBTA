public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(57L);
    param0.add(80L);
    param0.add(84L);
    param0.add(35L);
    param0.add(3L);
    param0.add(42L);
    param0.add(7L);
    param0.add(99L);
    param0.add(13L);
    param0.add(44L);
    List<Long> param1 = new ArrayList<>();
    param1.add(76L);
    param1.add(46L);
    param1.add(96L);
    param1.add(16L);
    param1.add(84L);
    param1.add(79L);
    param1.add(2L);
    param1.add(83L);
    param1.add(61L);
    param1.add(8L);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FIND_VALUE_OF_Y_MOD_2_RAISED_TO_POWER_X," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FIND_VALUE_OF_Y_MOD_2_RAISED_TO_POWER_X," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

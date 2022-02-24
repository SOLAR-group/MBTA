public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(37);
    param0.add(70);
    param0.add(26);
    param0.add(9);
    param0.add(82);
    param0.add(95);
    param0.add(43);
    param0.add(7);
    param0.add(19);
    param0.add(49);
    List<Integer> param1 = new ArrayList<>();
    param1.add(17);
    param1.add(52);
    param1.add(23);
    param1.add(96);
    param1.add(71);
    param1.add(36);
    param1.add(40);
    param1.add(27);
    param1.add(56);
    param1.add(28);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FIND_UNIT_DIGIT_X_RAISED_POWER_Y_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FIND_UNIT_DIGIT_X_RAISED_POWER_Y_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

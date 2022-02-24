public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(46);
    param0.add(99);
    param0.add(30);
    param0.add(1);
    param0.add(26);
    param0.add(1);
    param0.add(27);
    param0.add(10);
    param0.add(26);
    param0.add(29);
    List<Integer> param1 = new ArrayList<>();
    param1.add(92);
    param1.add(87);
    param1.add(32);
    param1.add(86);
    param1.add(81);
    param1.add(49);
    param1.add(46);
    param1.add(52);
    param1.add(38);
    param1.add(80);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("WRITE_A_C_PROGRAM_TO_CALCULATE_POWXN," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("WRITE_A_C_PROGRAM_TO_CALCULATE_POWXN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

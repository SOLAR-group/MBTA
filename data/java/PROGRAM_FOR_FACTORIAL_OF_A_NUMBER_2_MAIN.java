public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(24);
    param0.add(46);
    param0.add(47);
    param0.add(41);
    param0.add(98);
    param0.add(69);
    param0.add(83);
    param0.add(2);
    param0.add(12);
    param0.add(11);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PROGRAM_FOR_FACTORIAL_OF_A_NUMBER_2," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PROGRAM_FOR_FACTORIAL_OF_A_NUMBER_2," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

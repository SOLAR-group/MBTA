public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(41);
    param0.add(72);
    param0.add(54);
    param0.add(75);
    param0.add(87);
    param0.add(41);
    param0.add(78);
    param0.add(80);
    param0.add(46);
    param0.add(9);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

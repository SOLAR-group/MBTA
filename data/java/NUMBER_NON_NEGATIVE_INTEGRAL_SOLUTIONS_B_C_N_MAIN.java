public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(62);
    param0.add(44);
    param0.add(37);
    param0.add(81);
    param0.add(14);
    param0.add(20);
    param0.add(76);
    param0.add(72);
    param0.add(96);
    param0.add(52);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

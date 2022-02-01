public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(1);
    param0.add(2);
    param0.add(8);
    param0.add(1024);
    param0.add(24);
    param0.add(7);
    param0.add(46);
    param0.add(61);
    param0.add(73);
    param0.add(66);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("WRITE_ONE_LINE_C_FUNCTION_TO_FIND_WHETHER_A_NO_IS_POWER_OF_TWO_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("WRITE_ONE_LINE_C_FUNCTION_TO_FIND_WHETHER_A_NO_IS_POWER_OF_TWO_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("WRITE_ONE_LINE_C_FUNCTION_TO_FIND_WHETHER_A_NO_IS_POWER_OF_TWO_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

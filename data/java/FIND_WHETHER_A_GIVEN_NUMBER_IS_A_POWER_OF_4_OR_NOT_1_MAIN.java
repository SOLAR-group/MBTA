public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(1);
    param0.add(4);
    param0.add(64);
    param0.add(-64);
    param0.add(128);
    param0.add(1024);
    param0.add(45);
    param0.add(33);
    param0.add(66);
    param0.add(74);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("FIND_WHETHER_A_GIVEN_NUMBER_IS_A_POWER_OF_4_OR_NOT_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_WHETHER_A_GIVEN_NUMBER_IS_A_POWER_OF_4_OR_NOT_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_WHETHER_A_GIVEN_NUMBER_IS_A_POWER_OF_4_OR_NOT_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

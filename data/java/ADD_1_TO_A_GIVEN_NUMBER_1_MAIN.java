public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(20);
    param0.add(68);
    param0.add(52);
    param0.add(61);
    param0.add(3);
    param0.add(88);
    param0.add(41);
    param0.add(78);
    param0.add(94);
    param0.add(18);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("ADD_1_TO_A_GIVEN_NUMBER_1," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("ADD_1_TO_A_GIVEN_NUMBER_1," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("ADD_1_TO_A_GIVEN_NUMBER_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

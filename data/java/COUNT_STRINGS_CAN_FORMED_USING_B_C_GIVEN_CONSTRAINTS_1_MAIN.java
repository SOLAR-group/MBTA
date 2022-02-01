public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(55);
    param0.add(36);
    param0.add(69);
    param0.add(92);
    param0.add(73);
    param0.add(16);
    param0.add(88);
    param0.add(19);
    param0.add(66);
    param0.add(68);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("COUNT_STRINGS_CAN_FORMED_USING_B_C_GIVEN_CONSTRAINTS_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_STRINGS_CAN_FORMED_USING_B_C_GIVEN_CONSTRAINTS_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_STRINGS_CAN_FORMED_USING_B_C_GIVEN_CONSTRAINTS_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

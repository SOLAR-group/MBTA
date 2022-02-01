public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(41);
    param0.add(94);
    param0.add(80);
    param0.add(40);
    param0.add(76);
    param0.add(5);
    param0.add(43);
    param0.add(67);
    param0.add(24);
    param0.add(90);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("HOW_TO_PRINT_MAXIMUM_NUMBER_OF_A_USING_GIVEN_FOUR_KEYS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("HOW_TO_PRINT_MAXIMUM_NUMBER_OF_A_USING_GIVEN_FOUR_KEYS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("HOW_TO_PRINT_MAXIMUM_NUMBER_OF_A_USING_GIVEN_FOUR_KEYS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

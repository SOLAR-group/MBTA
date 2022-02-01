public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("7");
    param0.add("305745689");
    param0.add("444");
    param0.add("4");
    param0.add("2074");
    param0.add("27");
    param0.add("447");
    param0.add("255");
    param0.add("10000111111011");
    param0.add("fAKcSDRTNz");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("FIND_POSITION_GIVEN_NUMBER_AMONG_NUMBERS_MADE_4_7_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_POSITION_GIVEN_NUMBER_AMONG_NUMBERS_MADE_4_7_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_POSITION_GIVEN_NUMBER_AMONG_NUMBERS_MADE_4_7_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

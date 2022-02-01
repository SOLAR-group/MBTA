public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(21);
    param0.add(40);
    param0.add(83);
    param0.add(93);
    param0.add(43);
    param0.add(98);
    param0.add(35);
    param0.add(86);
    param0.add(76);
    param0.add(88);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

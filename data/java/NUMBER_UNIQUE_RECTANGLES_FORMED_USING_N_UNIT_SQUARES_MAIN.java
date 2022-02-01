public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(34);
    param0.add(49);
    param0.add(41);
    param0.add(17);
    param0.add(67);
    param0.add(38);
    param0.add(59);
    param0.add(64);
    param0.add(61);
    param0.add(58);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("NUMBER_UNIQUE_RECTANGLES_FORMED_USING_N_UNIT_SQUARES_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("NUMBER_UNIQUE_RECTANGLES_FORMED_USING_N_UNIT_SQUARES_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("NUMBER_UNIQUE_RECTANGLES_FORMED_USING_N_UNIT_SQUARES_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

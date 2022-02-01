public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(50);
    param0.add(83);
    param0.add(18);
    param0.add(24);
    param0.add(31);
    param0.add(38);
    param0.add(94);
    param0.add(24);
    param0.add(13);
    param0.add(53);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("RECURSIVELY_BREAK_NUMBER_3_PARTS_GET_MAXIMUM_SUM_1," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("RECURSIVELY_BREAK_NUMBER_3_PARTS_GET_MAXIMUM_SUM_1," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("RECURSIVELY_BREAK_NUMBER_3_PARTS_GET_MAXIMUM_SUM_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

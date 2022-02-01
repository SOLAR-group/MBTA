public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(45);
    param0.add(26);
    param0.add(74);
    param0.add(80);
    param0.add(46);
    param0.add(67);
    param0.add(16);
    param0.add(87);
    param0.add(27);
    param0.add(17);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("POSITION_OF_RIGHTMOST_SET_BIT," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("POSITION_OF_RIGHTMOST_SET_BIT," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("POSITION_OF_RIGHTMOST_SET_BIT," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

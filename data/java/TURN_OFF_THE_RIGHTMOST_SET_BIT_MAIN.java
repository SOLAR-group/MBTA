public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(9);
    param0.add(54);
    param0.add(60);
    param0.add(32);
    param0.add(41);
    param0.add(64);
    param0.add(4);
    param0.add(51);
    param0.add(57);
    param0.add(92);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("TURN_OFF_THE_RIGHTMOST_SET_BIT_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("TURN_OFF_THE_RIGHTMOST_SET_BIT_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("TURN_OFF_THE_RIGHTMOST_SET_BIT_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
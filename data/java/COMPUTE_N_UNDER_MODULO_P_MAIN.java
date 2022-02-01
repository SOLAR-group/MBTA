public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(85);
    param0.add(14);
    param0.add(83);
    param0.add(30);
    param0.add(96);
    param0.add(55);
    param0.add(82);
    param0.add(12);
    param0.add(38);
    param0.add(46);
    List<Integer> param1 = new ArrayList<>();
    param1.add(18);
    param1.add(13);
    param1.add(21);
    param1.add(35);
    param1.add(51);
    param1.add(58);
    param1.add(71);
    param1.add(74);
    param1.add(3);
    param1.add(73);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("COMPUTE_N_UNDER_MODULO_P_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COMPUTE_N_UNDER_MODULO_P_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COMPUTE_N_UNDER_MODULO_P_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
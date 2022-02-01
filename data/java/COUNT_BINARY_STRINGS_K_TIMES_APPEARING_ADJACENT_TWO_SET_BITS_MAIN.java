public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(29);
    param0.add(47);
    param0.add(77);
    param0.add(9);
    param0.add(29);
    param0.add(94);
    param0.add(51);
    param0.add(46);
    param0.add(18);
    param0.add(86);
    List<Integer> param1 = new ArrayList<>();
    param1.add(85);
    param1.add(29);
    param1.add(96);
    param1.add(91);
    param1.add(80);
    param1.add(85);
    param1.add(87);
    param1.add(62);
    param1.add(96);
    param1.add(86);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("COUNT_BINARY_STRINGS_K_TIMES_APPEARING_ADJACENT_TWO_SET_BITS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_BINARY_STRINGS_K_TIMES_APPEARING_ADJACENT_TWO_SET_BITS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_BINARY_STRINGS_K_TIMES_APPEARING_ADJACENT_TWO_SET_BITS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

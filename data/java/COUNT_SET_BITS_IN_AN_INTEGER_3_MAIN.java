public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(6);
    param0.add(58);
    param0.add(90);
    param0.add(69);
    param0.add(15);
    param0.add(54);
    param0.add(60);
    param0.add(51);
    param0.add(46);
    param0.add(91);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("COUNT_SET_BITS_IN_AN_INTEGER_3_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_SET_BITS_IN_AN_INTEGER_3_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_SET_BITS_IN_AN_INTEGER_3_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

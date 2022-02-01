public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(96);
    param0.add(85);
    param0.add(54);
    param0.add(14);
    param0.add(47);
    param0.add(11);
    param0.add(49);
    param0.add(99);
    param0.add(28);
    param0.add(82);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("DIVISIBILITY_9_USING_BITWISE_OPERATORS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("DIVISIBILITY_9_USING_BITWISE_OPERATORS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("DIVISIBILITY_9_USING_BITWISE_OPERATORS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

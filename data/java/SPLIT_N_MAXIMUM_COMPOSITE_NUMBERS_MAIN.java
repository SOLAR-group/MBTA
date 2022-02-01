public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(55);
    param0.add(35);
    param0.add(24);
    param0.add(75);
    param0.add(5);
    param0.add(7);
    param0.add(50);
    param0.add(28);
    param0.add(67);
    param0.add(59);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("SPLIT_N_MAXIMUM_COMPOSITE_NUMBERS," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SPLIT_N_MAXIMUM_COMPOSITE_NUMBERS," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SPLIT_N_MAXIMUM_COMPOSITE_NUMBERS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

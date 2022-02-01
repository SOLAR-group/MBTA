public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(45);
    param0.add(80);
    param0.add(54);
    param0.add(48);
    param0.add(83);
    param0.add(68);
    param0.add(32);
    param0.add(20);
    param0.add(68);
    param0.add(66);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("MINIMUM_PERIMETER_N_BLOCKS," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MINIMUM_PERIMETER_N_BLOCKS," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MINIMUM_PERIMETER_N_BLOCKS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

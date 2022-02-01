public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(55);
    param0.add(74);
    param0.add(76);
    param0.add(6);
    param0.add(2);
    param0.add(36);
    param0.add(40);
    param0.add(14);
    param0.add(42);
    param0.add(62);
    List<Integer> param1 = new ArrayList<>();
    param1.add(30);
    param1.add(15);
    param1.add(57);
    param1.add(90);
    param1.add(64);
    param1.add(1);
    param1.add(71);
    param1.add(56);
    param1.add(4);
    param1.add(12);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("COUNTS_PATHS_POINT_REACH_ORIGIN_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNTS_PATHS_POINT_REACH_ORIGIN_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNTS_PATHS_POINT_REACH_ORIGIN_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

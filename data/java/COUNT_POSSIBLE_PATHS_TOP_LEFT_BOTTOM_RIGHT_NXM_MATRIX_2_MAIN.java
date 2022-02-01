public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(73);
    param0.add(70);
    param0.add(53);
    param0.add(80);
    param0.add(9);
    param0.add(38);
    param0.add(41);
    param0.add(80);
    param0.add(42);
    param0.add(54);
    List<Integer> param1 = new ArrayList<>();
    param1.add(75);
    param1.add(5);
    param1.add(62);
    param1.add(70);
    param1.add(59);
    param1.add(48);
    param1.add(49);
    param1.add(72);
    param1.add(52);
    param1.add(1);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("COUNT_POSSIBLE_PATHS_TOP_LEFT_BOTTOM_RIGHT_NXM_MATRIX_2," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_POSSIBLE_PATHS_TOP_LEFT_BOTTOM_RIGHT_NXM_MATRIX_2," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_POSSIBLE_PATHS_TOP_LEFT_BOTTOM_RIGHT_NXM_MATRIX_2," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

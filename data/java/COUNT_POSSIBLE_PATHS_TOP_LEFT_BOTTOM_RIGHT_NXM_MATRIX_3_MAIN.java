public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(10);
    param0.add(52);
    param0.add(5);
    param0.add(84);
    param0.add(27);
    param0.add(77);
    param0.add(52);
    param0.add(3);
    param0.add(5);
    param0.add(14);
    List<Integer> param1 = new ArrayList<>();
    param1.add(3);
    param1.add(8);
    param1.add(23);
    param1.add(56);
    param1.add(30);
    param1.add(90);
    param1.add(50);
    param1.add(25);
    param1.add(75);
    param1.add(18);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("COUNT_POSSIBLE_PATHS_TOP_LEFT_BOTTOM_RIGHT_NXM_MATRIX_3," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_POSSIBLE_PATHS_TOP_LEFT_BOTTOM_RIGHT_NXM_MATRIX_3," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_POSSIBLE_PATHS_TOP_LEFT_BOTTOM_RIGHT_NXM_MATRIX_3," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

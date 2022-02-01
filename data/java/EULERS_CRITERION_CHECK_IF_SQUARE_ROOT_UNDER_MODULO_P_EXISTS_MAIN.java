public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(71);
    param0.add(85);
    param0.add(4);
    param0.add(20);
    param0.add(71);
    param0.add(72);
    param0.add(36);
    param0.add(95);
    param0.add(83);
    param0.add(72);
    List<Integer> param1 = new ArrayList<>();
    param1.add(78);
    param1.add(75);
    param1.add(35);
    param1.add(99);
    param1.add(29);
    param1.add(88);
    param1.add(54);
    param1.add(52);
    param1.add(33);
    param1.add(13);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("EULERS_CRITERION_CHECK_IF_SQUARE_ROOT_UNDER_MODULO_P_EXISTS," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("EULERS_CRITERION_CHECK_IF_SQUARE_ROOT_UNDER_MODULO_P_EXISTS," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("EULERS_CRITERION_CHECK_IF_SQUARE_ROOT_UNDER_MODULO_P_EXISTS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

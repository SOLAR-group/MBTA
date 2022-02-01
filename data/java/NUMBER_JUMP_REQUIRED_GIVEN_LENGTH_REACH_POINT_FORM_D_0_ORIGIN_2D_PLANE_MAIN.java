public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(35);
    param0.add(85);
    param0.add(22);
    param0.add(8);
    param0.add(12);
    param0.add(58);
    param0.add(65);
    param0.add(10);
    param0.add(23);
    param0.add(5);
    List<Integer> param1 = new ArrayList<>();
    param1.add(8);
    param1.add(55);
    param1.add(23);
    param1.add(43);
    param1.add(64);
    param1.add(25);
    param1.add(4);
    param1.add(95);
    param1.add(13);
    param1.add(50);
    List<Integer> param2 = new ArrayList<>();
    param2.add(77);
    param2.add(33);
    param2.add(64);
    param2.add(29);
    param2.add(11);
    param2.add(26);
    param2.add(28);
    param2.add(55);
    param2.add(54);
    param2.add(71);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("NUMBER_JUMP_REQUIRED_GIVEN_LENGTH_REACH_POINT_FORM_D_0_ORIGIN_2D_PLANE," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("NUMBER_JUMP_REQUIRED_GIVEN_LENGTH_REACH_POINT_FORM_D_0_ORIGIN_2D_PLANE," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("NUMBER_JUMP_REQUIRED_GIVEN_LENGTH_REACH_POINT_FORM_D_0_ORIGIN_2D_PLANE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

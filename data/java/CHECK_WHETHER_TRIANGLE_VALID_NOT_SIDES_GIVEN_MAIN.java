public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(29);
    param0.add(83);
    param0.add(48);
    param0.add(59);
    param0.add(56);
    param0.add(68);
    param0.add(63);
    param0.add(95);
    param0.add(2);
    param0.add(11);
    List<Integer> param1 = new ArrayList<>();
    param1.add(19);
    param1.add(34);
    param1.add(14);
    param1.add(12);
    param1.add(39);
    param1.add(85);
    param1.add(36);
    param1.add(34);
    param1.add(90);
    param1.add(16);
    List<Integer> param2 = new ArrayList<>();
    param2.add(52);
    param2.add(49);
    param2.add(65);
    param2.add(94);
    param2.add(22);
    param2.add(9);
    param2.add(41);
    param2.add(37);
    param2.add(27);
    param2.add(1);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("CHECK_WHETHER_TRIANGLE_VALID_NOT_SIDES_GIVEN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_WHETHER_TRIANGLE_VALID_NOT_SIDES_GIVEN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_WHETHER_TRIANGLE_VALID_NOT_SIDES_GIVEN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

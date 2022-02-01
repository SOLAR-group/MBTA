public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(33);
    param0.add(95);
    param0.add(21);
    param0.add(3);
    param0.add(40);
    param0.add(64);
    param0.add(17);
    param0.add(58);
    param0.add(44);
    param0.add(27);
    List<Integer> param1 = new ArrayList<>();
    param1.add(55);
    param1.add(7);
    param1.add(63);
    param1.add(62);
    param1.add(53);
    param1.add(24);
    param1.add(23);
    param1.add(74);
    param1.add(13);
    param1.add(54);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("FIND_UNIT_DIGIT_X_RAISED_POWER_Y_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_UNIT_DIGIT_X_RAISED_POWER_Y_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_UNIT_DIGIT_X_RAISED_POWER_Y_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(94);
    param0.add(7);
    param0.add(20);
    param0.add(90);
    param0.add(50);
    param0.add(32);
    param0.add(46);
    param0.add(82);
    param0.add(43);
    param0.add(6);
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
    param1.add(12);
    param1.add(44);
    param1.add(94);
    param1.add(58);
    param1.add(90);
    param1.add(25);
    param1.add(50);
    param1.add(82);
    param1.add(83);
    List<Integer> param2 = new ArrayList<>();
    param2.add(69);
    param2.add(33);
    param2.add(24);
    param2.add(88);
    param2.add(27);
    param2.add(29);
    param2.add(6);
    param2.add(87);
    param2.add(70);
    param2.add(19);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("DICE_THROW_PROBLEM_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("DICE_THROW_PROBLEM_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("DICE_THROW_PROBLEM_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

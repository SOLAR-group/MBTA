public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(46);
    param0.add(68);
    param0.add(4);
    param0.add(12);
    param0.add(56);
    param0.add(14);
    param0.add(81);
    param0.add(29);
    param0.add(26);
    param0.add(40);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("PIZZA_CUT_PROBLEM_CIRCLE_DIVISION_LINES," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PIZZA_CUT_PROBLEM_CIRCLE_DIVISION_LINES," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PIZZA_CUT_PROBLEM_CIRCLE_DIVISION_LINES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

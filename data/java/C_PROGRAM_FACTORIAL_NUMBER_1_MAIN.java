public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(15);
    param0.add(7);
    param0.add(16);
    param0.add(67);
    param0.add(71);
    param0.add(16);
    param0.add(77);
    param0.add(27);
    param0.add(37);
    param0.add(73);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("C_PROGRAM_FACTORIAL_NUMBER_1," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("C_PROGRAM_FACTORIAL_NUMBER_1," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("C_PROGRAM_FACTORIAL_NUMBER_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

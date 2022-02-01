public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(66);
    param0.add(93);
    param0.add(39);
    param0.add(93);
    param0.add(68);
    param0.add(20);
    param0.add(37);
    param0.add(52);
    param0.add(52);
    param0.add(19);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("C_PROGRAM_FACTORIAL_NUMBER_2_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("C_PROGRAM_FACTORIAL_NUMBER_2_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("C_PROGRAM_FACTORIAL_NUMBER_2_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

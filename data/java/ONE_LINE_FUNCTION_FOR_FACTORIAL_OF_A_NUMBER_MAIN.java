public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(58);
    param0.add(42);
    param0.add(76);
    param0.add(16);
    param0.add(49);
    param0.add(60);
    param0.add(99);
    param0.add(45);
    param0.add(6);
    param0.add(70);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("ONE_LINE_FUNCTION_FOR_FACTORIAL_OF_A_NUMBER_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("ONE_LINE_FUNCTION_FOR_FACTORIAL_OF_A_NUMBER_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("ONE_LINE_FUNCTION_FOR_FACTORIAL_OF_A_NUMBER_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

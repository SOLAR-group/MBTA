public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(94);
    param0.add(94);
    param0.add(79);
    param0.add(39);
    param0.add(16);
    param0.add(90);
    param0.add(64);
    param0.add(76);
    param0.add(83);
    param0.add(47);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("WRITE_AN_EFFICIENT_METHOD_TO_CHECK_IF_A_NUMBER_IS_MULTIPLE_OF_3_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("WRITE_AN_EFFICIENT_METHOD_TO_CHECK_IF_A_NUMBER_IS_MULTIPLE_OF_3_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("WRITE_AN_EFFICIENT_METHOD_TO_CHECK_IF_A_NUMBER_IS_MULTIPLE_OF_3_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(5);
    param0.add(19);
    param0.add(7);
    param0.add(94);
    param0.add(58);
    param0.add(65);
    param0.add(69);
    param0.add(96);
    param0.add(80);
    param0.add(14);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

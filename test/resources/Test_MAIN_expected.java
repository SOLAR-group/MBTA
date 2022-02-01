public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{19});
    TEST_PARAMS_0
    List<Integer> param1 = new ArrayList<>();
    param1.add(0);
    TEST_PARAMS_1

    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        TEST_FOR_0
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
	            TEST_FOR_1
                builder.append("Test," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("Test," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("Test," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

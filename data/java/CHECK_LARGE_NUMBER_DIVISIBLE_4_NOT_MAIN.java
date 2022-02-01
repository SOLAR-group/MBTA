public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("PjAFZXQgN");
    param0.add("12325195609714");
    param0.add("00101111101");
    param0.add("xOtbXZiA");
    param0.add("980");
    param0.add("000000100");
    param0.add("zFacc W");
    param0.add("8");
    param0.add("110011");
    param0.add("afiutekeSfYrX");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("CHECK_LARGE_NUMBER_DIVISIBLE_4_NOT," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_LARGE_NUMBER_DIVISIBLE_4_NOT," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_LARGE_NUMBER_DIVISIBLE_4_NOT," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

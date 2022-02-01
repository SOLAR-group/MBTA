public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("69354");
    param0.add("43347276812854");
    param0.add("0111111111");
    param0.add("9999918");
    param0.add("333");
    param0.add("1011011101");
    param0.add("1");
    param0.add("2284737");
    param0.add("011001");
    param0.add("cc");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("CHECK_LARGE_NUMBER_DIVISIBLE_9_NOT," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_LARGE_NUMBER_DIVISIBLE_9_NOT," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_LARGE_NUMBER_DIVISIBLE_9_NOT," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

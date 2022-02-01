public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("2112");
    param0.add("1124");
    param0.add("1110");
    param0.add("O");
    param0.add("65530186");
    param0.add("132");
    param0.add("UqOE");
    param0.add("587");
    param0.add("1010");
    param0.add("QETUfLQ");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("CHECK_LARGE_NUMBER_DIVISIBLE_6_NOT," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_LARGE_NUMBER_DIVISIBLE_6_NOT," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_LARGE_NUMBER_DIVISIBLE_6_NOT," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

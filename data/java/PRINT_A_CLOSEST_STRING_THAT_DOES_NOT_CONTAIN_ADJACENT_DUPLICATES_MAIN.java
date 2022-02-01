public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("cHcZCdkbIMGUYe");
    param0.add("2292016725711");
    param0.add("10110111100010");
    param0.add("wHso xGbBY");
    param0.add("21884");
    param0.add("0");
    param0.add("I");
    param0.add("716213436");
    param0.add("101");
    param0.add("HXdDbjcyPc");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)).equals(f_gold(param0.get(i))))
	        {
                builder.append("PRINT_A_CLOSEST_STRING_THAT_DOES_NOT_CONTAIN_ADJACENT_DUPLICATES_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PRINT_A_CLOSEST_STRING_THAT_DOES_NOT_CONTAIN_ADJACENT_DUPLICATES_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PRINT_A_CLOSEST_STRING_THAT_DOES_NOT_CONTAIN_ADJACENT_DUPLICATES_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("fbfHTjE");
    param0.add("09285256323");
    param0.add("0011000101110");
    param0.add("ue JkVZTt");
    param0.add("48387612426300");
    param0.add("010");
    param0.add("ddRrUz");
    param0.add("1049162633793");
    param0.add("100011");
    param0.add("iJfadiVaQqv");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)).equals(f_gold(param0.get(i))))
	        {
                builder.append("LONGEST_REPEATING_AND_NON_OVERLAPPING_SUBSTRING_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("LONGEST_REPEATING_AND_NON_OVERLAPPING_SUBSTRING_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("LONGEST_REPEATING_AND_NON_OVERLAPPING_SUBSTRING_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
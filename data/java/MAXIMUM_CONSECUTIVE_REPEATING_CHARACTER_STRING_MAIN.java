public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("geeekk");
    param0.add("3786868");
    param0.add("110");
    param0.add("aaaabbcbbb");
    param0.add("11");
    param0.add("011101");
    param0.add("WoHNyJYLC");
    param0.add("3141711779");
    param0.add("10111101101");
    param0.add("aabbabababcc");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("MAXIMUM_CONSECUTIVE_REPEATING_CHARACTER_STRING," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MAXIMUM_CONSECUTIVE_REPEATING_CHARACTER_STRING," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MAXIMUM_CONSECUTIVE_REPEATING_CHARACTER_STRING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

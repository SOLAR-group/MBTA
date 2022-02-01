public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("ba");
    param0.add("aabb");
    param0.add("abab");
    param0.add("aaabb");
    param0.add("aabbb");
    param0.add("abaabbaa");
    param0.add("abaababb");
    param0.add("bbaa");
    param0.add("11001000");
    param0.add("ZWXv te");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("CHECK_STRING_FOLLOWS_ANBN_PATTERN_NOT_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_STRING_FOLLOWS_ANBN_PATTERN_NOT_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_STRING_FOLLOWS_ANBN_PATTERN_NOT_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

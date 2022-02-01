public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("g*ks");
    param0.add("ge?ks*");
    param0.add("g*k");
    param0.add("*pqrs");
    param0.add("abc*bcd");
    param0.add("abc*c?d");
    param0.add("*c*d");
    param0.add("*?c*d");
    param0.add("?*1");
    param0.add("a*");
    List<String> param1 = new ArrayList<>();
    param1.add("geeks");
    param1.add("geeksforgeeks");
    param1.add("gee");
    param1.add("pqrst");
    param1.add("abcdhghgbcd");
    param1.add("abcd");
    param1.add("abcd");
    param1.add("abcd");
    param1.add("010111111001");
    param1.add("CBzHMjUGCUJD");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("WILDCARD_CHARACTER_MATCHING_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("WILDCARD_CHARACTER_MATCHING_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("WILDCARD_CHARACTER_MATCHING_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

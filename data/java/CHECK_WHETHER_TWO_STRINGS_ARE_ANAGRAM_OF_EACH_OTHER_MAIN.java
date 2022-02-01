public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("LISTEN");
    param0.add("TRIANGLE");
    param0.add("test");
    param0.add("night");
    param0.add("Inch");
    param0.add("Dusty");
    param0.add("GJLMOOSTTXaabceefgllpwz");
    param0.add("41658699122772743330");
    param0.add("0000000000000000000000001111111111111111111");
    param0.add("ERioPYDqgTSz bVCW");
    List<String> param1 = new ArrayList<>();
    param1.add("SILENT");
    param1.add("INTEGRAL");
    param1.add("ttew");
    param1.add("thing");
    param1.add("Study");
    param1.add("1");
    param1.add("EJRXYajoy");
    param1.add("9931020");
    param1.add("0000000000000000000001111111111111111111111");
    param1.add("GLajZE");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i).toCharArray(),param1.get(i).toCharArray()) == f_gold(param0.get(i).toCharArray(),param1.get(i).toCharArray()))
	        {
                builder.append("CHECK_WHETHER_TWO_STRINGS_ARE_ANAGRAM_OF_EACH_OTHER," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_WHETHER_TWO_STRINGS_ARE_ANAGRAM_OF_EACH_OTHER," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_WHETHER_TWO_STRINGS_ARE_ANAGRAM_OF_EACH_OTHER," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

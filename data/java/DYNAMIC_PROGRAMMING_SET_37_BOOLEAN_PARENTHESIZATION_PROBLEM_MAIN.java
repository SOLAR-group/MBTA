public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<char [ ]> param0 = new ArrayList<>();
    param0.add("TTFT".toCharArray());
    param0.add("TFT".toCharArray());
    param0.add("TFF".toCharArray());
    param0.add("TTFT".toCharArray());
    param0.add("TTFT".toCharArray());
    param0.add("TTFT".toCharArray());
    param0.add("TTFT".toCharArray());
    param0.add("TTFT".toCharArray());
    param0.add("TTFT".toCharArray());
    param0.add("TTFT".toCharArray());
    List<char [ ]> param1 = new ArrayList<>();
    param1.add("|&^".toCharArray());
    param1.add("^&".toCharArray());
    param1.add("^|".toCharArray());
    param1.add("|||".toCharArray());
    param1.add("&&&".toCharArray());
    param1.add("&&^".toCharArray());
    param1.add("^&|".toCharArray());
    param1.add("^^^".toCharArray());
    param1.add("^||".toCharArray());
    param1.add("|^|".toCharArray());
    param1.add("&^|".toCharArray());
    List<Integer> param2 = new ArrayList<>();
    param2.add(4);
    param2.add(3);
    param2.add(3);
    param2.add(4);
    param2.add(4);
    param2.add(4);
    param2.add(4);
    param2.add(4);
    param2.add(4);
    param2.add(4);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("DYNAMIC_PROGRAMMING_SET_37_BOOLEAN_PARENTHESIZATION_PROBLEM_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("DYNAMIC_PROGRAMMING_SET_37_BOOLEAN_PARENTHESIZATION_PROBLEM_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("DYNAMIC_PROGRAMMING_SET_37_BOOLEAN_PARENTHESIZATION_PROBLEM_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

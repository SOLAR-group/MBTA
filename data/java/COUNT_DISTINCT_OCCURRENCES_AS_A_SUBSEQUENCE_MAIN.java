public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("banana");
    param0.add("49597223");
    param0.add("1000010000011");
    param0.add("BTlzufK");
    param0.add("3474007");
    param0.add("0010");
    param0.add("dKHhoTD");
    param0.add("9123259723");
    param0.add("11001000111110");
    param0.add("iY WJlIZ");
    List<String> param1 = new ArrayList<>();
    param1.add("ban");
    param1.add("42");
    param1.add("010");
    param1.add("lf RS");
    param1.add("370");
    param1.add("00000");
    param1.add("doT");
    param1.add("123");
    param1.add("0");
    param1.add("iI");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

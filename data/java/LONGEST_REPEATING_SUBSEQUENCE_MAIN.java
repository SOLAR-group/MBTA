public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("JxZFz");
    param0.add("7648992235770");
    param0.add("11100000");
    param0.add("cRN  SgYjPsctJ");
    param0.add("434");
    param0.add("1");
    param0.add("JRfZIAsbrPBZ");
    param0.add("03779368305592");
    param0.add("1111000");
    param0.add("BkULuIi");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("LONGEST_REPEATING_SUBSEQUENCE_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("LONGEST_REPEATING_SUBSEQUENCE_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("LONGEST_REPEATING_SUBSEQUENCE_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

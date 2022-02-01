public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("");
    param0.add("abbc");
    param0.add("abcabc");
    param0.add("agsdbkfdc ");
    param0.add("ababab");
    param0.add("aaaaaaa");
    param0.add("aabaaabcc");
    param0.add("19");
    param0.add("1001100");
    param0.add("DtAnuQbU");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("NUMBER_SUBSEQUENCES_FORM_AI_BJ_CK_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("NUMBER_SUBSEQUENCES_FORM_AI_BJ_CK_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("NUMBER_SUBSEQUENCES_FORM_AI_BJ_CK_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

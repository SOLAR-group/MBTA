public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add(" E");
    param0.add("0845591950");
    param0.add("00101011");
    param0.add("pLSvlwrACvFaoT");
    param0.add("7246");
    param0.add("1010101100000");
    param0.add("obPkcLSFp");
    param0.add("914757557818");
    param0.add("1");
    param0.add("PKvUWIQ");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("LONGEST_PALINDROME_SUBSEQUENCE_SPACE," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("LONGEST_PALINDROME_SUBSEQUENCE_SPACE," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("LONGEST_PALINDROME_SUBSEQUENCE_SPACE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

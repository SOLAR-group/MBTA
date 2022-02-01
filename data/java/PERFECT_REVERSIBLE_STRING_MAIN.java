public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("ab");
    param0.add("303");
    param0.add("11110000");
    param0.add("aba");
    param0.add("404");
    param0.add("10101");
    param0.add("abab");
    param0.add("6366");
    param0.add("001");
    param0.add("");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("PERFECT_REVERSIBLE_STRING_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PERFECT_REVERSIBLE_STRING_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PERFECT_REVERSIBLE_STRING_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

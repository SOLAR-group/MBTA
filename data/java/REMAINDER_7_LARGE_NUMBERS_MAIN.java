public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("K");
    param0.add("850076");
    param0.add("00111");
    param0.add("X");
    param0.add("1");
    param0.add("10010001100");
    param0.add(" pgPeLz");
    param0.add("53212456821275");
    param0.add("101");
    param0.add("V");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("REMAINDER_7_LARGE_NUMBERS," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("REMAINDER_7_LARGE_NUMBERS," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("REMAINDER_7_LARGE_NUMBERS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

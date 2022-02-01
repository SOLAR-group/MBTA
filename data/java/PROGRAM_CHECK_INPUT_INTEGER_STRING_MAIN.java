public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("MgTOyHo NT");
    param0.add("033675175");
    param0.add("011001");
    param0.add("XLlccG");
    param0.add("8223900094410");
    param0.add("000");
    param0.add("aupp");
    param0.add("90202721499");
    param0.add("110000100011");
    param0.add("MhYHsMQeLhG");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("PROGRAM_CHECK_INPUT_INTEGER_STRING_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PROGRAM_CHECK_INPUT_INTEGER_STRING_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PROGRAM_CHECK_INPUT_INTEGER_STRING_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

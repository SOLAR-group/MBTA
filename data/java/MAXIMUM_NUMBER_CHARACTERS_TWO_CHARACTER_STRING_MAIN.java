public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("cI");
    param0.add("76478");
    param0.add("1");
    param0.add("tr");
    param0.add("10");
    param0.add("01");
    param0.add("Rmhzp");
    param0.add("5784080133917");
    param0.add("1100");
    param0.add("OK");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("MAXIMUM_NUMBER_CHARACTERS_TWO_CHARACTER_STRING," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MAXIMUM_NUMBER_CHARACTERS_TWO_CHARACTER_STRING," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MAXIMUM_NUMBER_CHARACTERS_TWO_CHARACTER_STRING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("iwLT");
    param0.add("225168787");
    param0.add("00100111");
    param0.add("ktdzbGbqsvQ");
    param0.add("5574573212164");
    param0.add("01000110101101");
    param0.add("ftiv");
    param0.add("48956");
    param0.add("10100111001101");
    param0.add("YvhEOhhz");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("FIND_REPEATED_CHARACTER_PRESENT_FIRST_STRING_1," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_REPEATED_CHARACTER_PRESENT_FIRST_STRING_1," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_REPEATED_CHARACTER_PRESENT_FIRST_STRING_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("LZIKA");
    param0.add("0556979952");
    param0.add("110010");
    param0.add("kGaYfd");
    param0.add("413567670657");
    param0.add("01001");
    param0.add("EQPuFa");
    param0.add("48848378");
    param0.add("110");
    param0.add("PLehNeP");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("COUNT_SUBSTRINGS_WITH_SAME_FIRST_AND_LAST_CHARACTERS," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_SUBSTRINGS_WITH_SAME_FIRST_AND_LAST_CHARACTERS," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_SUBSTRINGS_WITH_SAME_FIRST_AND_LAST_CHARACTERS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

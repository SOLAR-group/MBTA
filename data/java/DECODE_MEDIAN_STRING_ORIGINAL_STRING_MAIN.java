public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add(" EgvQCeqYpZtv");
    param0.add("488540");
    param0.add("0000101010111");
    param0.add("syw");
    param0.add("402355");
    param0.add("0");
    param0.add("wmHMlAtq");
    param0.add("7962");
    param0.add("111111");
    param0.add("UbgRGDquop");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)).equals(f_gold(param0.get(i))))
	        {
                builder.append("DECODE_MEDIAN_STRING_ORIGINAL_STRING," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("DECODE_MEDIAN_STRING_ORIGINAL_STRING," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("DECODE_MEDIAN_STRING_ORIGINAL_STRING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

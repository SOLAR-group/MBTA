public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("lLkhFeZGcb");
    param0.add("ABcED");
    param0.add("geeksforgeeks");
    param0.add("Alphabetical");
    param0.add("abababab");
    param0.add("bcdefgxyz");
    param0.add("cBzaqx L");
    param0.add(" bcd");
    param0.add("11");
    param0.add("MqqKY");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("COUNT_CHARACTERS_POSITION_ENGLISH_ALPHABETS," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_CHARACTERS_POSITION_ENGLISH_ALPHABETS," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_CHARACTERS_POSITION_ENGLISH_ALPHABETS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

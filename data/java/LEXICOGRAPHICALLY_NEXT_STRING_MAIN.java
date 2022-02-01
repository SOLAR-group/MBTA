public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("amKIRzPiqLTIy");
    param0.add("68");
    param0.add("100");
    param0.add("f");
    param0.add("802205375");
    param0.add("0111");
    param0.add("GRjRYIvYwgua");
    param0.add("8139910006809");
    param0.add("100101");
    param0.add("rw");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)).equals(f_gold(param0.get(i))))
	        {
                builder.append("LEXICOGRAPHICALLY_NEXT_STRING_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("LEXICOGRAPHICALLY_NEXT_STRING_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("LEXICOGRAPHICALLY_NEXT_STRING_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
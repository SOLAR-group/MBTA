public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("sqGOi");
    param0.add("848580");
    param0.add("01001110011001");
    param0.add("ZhWXUKmeiI");
    param0.add("0917296541285");
    param0.add("01101001111100");
    param0.add("tjP kR");
    param0.add("999907");
    param0.add("011100");
    param0.add("qJPHNSJOUj");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("LEXICOGRAPHICAL_CONCATENATION_SUBSTRINGS_STRING," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("LEXICOGRAPHICAL_CONCATENATION_SUBSTRINGS_STRING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

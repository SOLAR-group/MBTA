public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("ORXMflacQFBv");
    param0.add("39977638567848");
    param0.add("011110011011");
    param0.add("fYjfNy");
    param0.add("222280492");
    param0.add("11");
    param0.add("UjntBg");
    param0.add("6866190138212");
    param0.add("0000");
    param0.add("FWz PWEQgVlRZ");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FIND_REPEATED_CHARACTER_PRESENT_FIRST_STRING," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FIND_REPEATED_CHARACTER_PRESENT_FIRST_STRING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

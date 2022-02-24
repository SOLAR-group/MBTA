public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("TEYndweqZA");
    param0.add("01865");
    param0.add("11001100");
    param0.add("CzwznJmQet");
    param0.add("318305446");
    param0.add("0000001111110");
    param0.add("yzT");
    param0.add("38630230");
    param0.add("01101");
    param0.add("zoizI");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("GOOGLE_CASE_GIVEN_SENTENCE," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("GOOGLE_CASE_GIVEN_SENTENCE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("D");
    param0.add("I");
    param0.add("DD");
    param0.add("II");
    param0.add("DIDI");
    param0.add("IIDDD");
    param0.add("DDIDDIID");
    param0.add("176297");
    param0.add("1");
    param0.add("XHkhZq");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FORM_MINIMUM_NUMBER_FROM_GIVEN_SEQUENCE_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FORM_MINIMUM_NUMBER_FROM_GIVEN_SEQUENCE_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

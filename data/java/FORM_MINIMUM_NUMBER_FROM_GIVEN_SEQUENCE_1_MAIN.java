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
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)).equals(f_gold(param0.get(i))))
	        {
                builder.append("FORM_MINIMUM_NUMBER_FROM_GIVEN_SEQUENCE_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FORM_MINIMUM_NUMBER_FROM_GIVEN_SEQUENCE_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FORM_MINIMUM_NUMBER_FROM_GIVEN_SEQUENCE_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
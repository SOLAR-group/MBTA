public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("OaITtzE");
    param0.add("88111031");
    param0.add("1100111");
    param0.add("eiWPbMrFx");
    param0.add("43701248");
    param0.add("100001111110");
    param0.add("jVgOapMp");
    param0.add("68337672");
    param0.add("00110101");
    param0.add("JqSh");
    List<String> param1 = new ArrayList<>();
    param1.add("RnYlJUqzk");
    param1.add("558471");
    param1.add("11111110111101");
    param1.add("tBAJaI");
    param1.add("4027");
    param1.add("11");
    param1.add("Xm");
    param1.add("56939");
    param1.add("1");
    param1.add("iAfjQRwuVyost");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)).equals(f_gold(param0.get(i),param1.get(i))))
	        {
                builder.append("MULTIPLY_LARGE_NUMBERS_REPRESENTED_AS_STRINGS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MULTIPLY_LARGE_NUMBERS_REPRESENTED_AS_STRINGS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MULTIPLY_LARGE_NUMBERS_REPRESENTED_AS_STRINGS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

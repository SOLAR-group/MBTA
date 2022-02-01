public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("wVVe");
    param0.add("850390909067");
    param0.add("1110");
    param0.add("NRSAazejUS");
    param0.add("297975");
    param0.add("1");
    param0.add("ThYMuVOm");
    param0.add("1874418087476");
    param0.add("11011001001");
    param0.add("YJ");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("NUMBER_DIGITS_REMOVED_MAKE_NUMBER_DIVISIBLE_3_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("NUMBER_DIGITS_REMOVED_MAKE_NUMBER_DIVISIBLE_3_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("NUMBER_DIGITS_REMOVED_MAKE_NUMBER_DIVISIBLE_3_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

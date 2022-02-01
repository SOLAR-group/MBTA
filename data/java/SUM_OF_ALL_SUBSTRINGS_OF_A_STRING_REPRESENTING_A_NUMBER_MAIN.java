public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("rA");
    param0.add("552541909988");
    param0.add("000110001");
    param0.add("s wXTz");
    param0.add("4");
    param0.add("0001");
    param0.add("EdZPQyLD F");
    param0.add("926277661");
    param0.add("1010110");
    param0.add("RfLyITyEE");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("SUM_OF_ALL_SUBSTRINGS_OF_A_STRING_REPRESENTING_A_NUMBER_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SUM_OF_ALL_SUBSTRINGS_OF_A_STRING_REPRESENTING_A_NUMBER_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SUM_OF_ALL_SUBSTRINGS_OF_A_STRING_REPRESENTING_A_NUMBER_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

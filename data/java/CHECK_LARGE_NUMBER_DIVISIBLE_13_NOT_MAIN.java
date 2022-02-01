public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("vzTUaItpCpLnjY");
    param0.add("33855");
    param0.add("0011110101011");
    param0.add("MMQ");
    param0.add("439340517954");
    param0.add("000000000");
    param0.add("UugAuRRJbjEgl");
    param0.add("6406553695441");
    param0.add("011001");
    param0.add("yjFqEEvgiNjEX");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("CHECK_LARGE_NUMBER_DIVISIBLE_13_NOT_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_LARGE_NUMBER_DIVISIBLE_13_NOT_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_LARGE_NUMBER_DIVISIBLE_13_NOT_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

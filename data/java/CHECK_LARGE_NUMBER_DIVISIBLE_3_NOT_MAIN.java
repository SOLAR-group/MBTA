public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("Xy");
    param0.add("4827182");
    param0.add("110011");
    param0.add("GdOXZk");
    param0.add("8970294");
    param0.add("000110");
    param0.add("xMRGdAgsGlH");
    param0.add("34643260819239");
    param0.add("00");
    param0.add("DcCK");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("CHECK_LARGE_NUMBER_DIVISIBLE_3_NOT_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_LARGE_NUMBER_DIVISIBLE_3_NOT_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_LARGE_NUMBER_DIVISIBLE_3_NOT_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

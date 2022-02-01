public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("h");
    param0.add("1391212");
    param0.add("010");
    param0.add("ksRFLRVL");
    param0.add("5809836998");
    param0.add("1111000");
    param0.add("hJoDzrrBaF");
    param0.add("6076");
    param0.add("001010010");
    param0.add("lU DBBVF");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("REQUIRED_MINIMUM_DIGITS_REMOVE_NUMBER_MAKE_PERFECT_SQUARE_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("REQUIRED_MINIMUM_DIGITS_REMOVE_NUMBER_MAKE_PERFECT_SQUARE_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("REQUIRED_MINIMUM_DIGITS_REMOVE_NUMBER_MAKE_PERFECT_SQUARE_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

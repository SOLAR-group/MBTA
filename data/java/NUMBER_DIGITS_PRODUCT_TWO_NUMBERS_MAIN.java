public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(86);
    param0.add(81);
    param0.add(48);
    param0.add(64);
    param0.add(56);
    param0.add(5);
    param0.add(25);
    param0.add(94);
    param0.add(5);
    param0.add(46);
    List<Integer> param1 = new ArrayList<>();
    param1.add(39);
    param1.add(87);
    param1.add(84);
    param1.add(80);
    param1.add(20);
    param1.add(70);
    param1.add(13);
    param1.add(83);
    param1.add(55);
    param1.add(46);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("NUMBER_DIGITS_PRODUCT_TWO_NUMBERS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("NUMBER_DIGITS_PRODUCT_TWO_NUMBERS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("NUMBER_DIGITS_PRODUCT_TWO_NUMBERS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

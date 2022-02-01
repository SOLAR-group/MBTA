public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(35);
    param0.add(17);
    param0.add(8);
    param0.add(99);
    param0.add(57);
    param0.add(39);
    param0.add(99);
    param0.add(14);
    param0.add(22);
    param0.add(7);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)).equals(f_gold(param0.get(i))))
	        {
                builder.append("DECIMAL_BINARY_CONVERSION_WITHOUT_USING_ARITHMETIC_OPERATORS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("DECIMAL_BINARY_CONVERSION_WITHOUT_USING_ARITHMETIC_OPERATORS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("DECIMAL_BINARY_CONVERSION_WITHOUT_USING_ARITHMETIC_OPERATORS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
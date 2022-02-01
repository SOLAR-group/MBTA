public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(56);
    param0.add(17);
    param0.add(73);
    param0.add(75);
    param0.add(27);
    param0.add(61);
    param0.add(65);
    param0.add(22);
    param0.add(61);
    param0.add(97);
    List<Integer> param1 = new ArrayList<>();
    param1.add(60);
    param1.add(44);
    param1.add(96);
    param1.add(3);
    param1.add(54);
    param1.add(1);
    param1.add(63);
    param1.add(19);
    param1.add(9);
    param1.add(23);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("ADD_TWO_NUMBERS_WITHOUT_USING_ARITHMETIC_OPERATORS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("ADD_TWO_NUMBERS_WITHOUT_USING_ARITHMETIC_OPERATORS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("ADD_TWO_NUMBERS_WITHOUT_USING_ARITHMETIC_OPERATORS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

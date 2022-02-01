public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(48);
    param0.add(11);
    param0.add(50);
    param0.add(21);
    param0.add(94);
    param0.add(22);
    param0.add(3);
    param0.add(67);
    param0.add(59);
    param0.add(50);
    List<Integer> param1 = new ArrayList<>();
    param1.add(63);
    param1.add(55);
    param1.add(89);
    param1.add(71);
    param1.add(39);
    param1.add(44);
    param1.add(41);
    param1.add(62);
    param1.add(2);
    param1.add(11);
    List<Integer> param2 = new ArrayList<>();
    param2.add(56);
    param2.add(84);
    param2.add(96);
    param2.add(74);
    param2.add(42);
    param2.add(86);
    param2.add(68);
    param2.add(94);
    param2.add(83);
    param2.add(1);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

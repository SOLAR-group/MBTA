public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(23);
    param0.add(87);
    param0.add(35);
    param0.add(25);
    param0.add(93);
    param0.add(52);
    param0.add(95);
    param0.add(91);
    param0.add(75);
    param0.add(96);
    List<Integer> param1 = new ArrayList<>();
    param1.add(98);
    param1.add(55);
    param1.add(90);
    param1.add(9);
    param1.add(22);
    param1.add(42);
    param1.add(88);
    param1.add(64);
    param1.add(1);
    param1.add(44);
    List<Integer> param2 = new ArrayList<>();
    param2.add(25);
    param2.add(94);
    param2.add(29);
    param2.add(41);
    param2.add(39);
    param2.add(96);
    param2.add(26);
    param2.add(51);
    param2.add(6);
    param2.add(76);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

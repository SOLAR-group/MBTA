public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(23);
    param0.add(56);
    param0.add(30);
    param0.add(51);
    param0.add(21);
    param0.add(69);
    param0.add(12);
    param0.add(44);
    param0.add(99);
    param0.add(46);
    List<Integer> param1 = new ArrayList<>();
    param1.add(16);
    param1.add(95);
    param1.add(63);
    param1.add(89);
    param1.add(99);
    param1.add(63);
    param1.add(69);
    param1.add(52);
    param1.add(65);
    param1.add(58);
    List<Integer> param2 = new ArrayList<>();
    param2.add(16);
    param2.add(6);
    param2.add(1);
    param2.add(46);
    param2.add(38);
    param2.add(50);
    param2.add(73);
    param2.add(9);
    param2.add(10);
    param2.add(37);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(9);
    param0.add(97);
    param0.add(16);
    param0.add(16);
    param0.add(6);
    param0.add(58);
    param0.add(6);
    param0.add(22);
    param0.add(51);
    param0.add(58);
    List<Integer> param1 = new ArrayList<>();
    param1.add(40);
    param1.add(47);
    param1.add(28);
    param1.add(82);
    param1.add(81);
    param1.add(10);
    param1.add(47);
    param1.add(4);
    param1.add(46);
    param1.add(25);
    List<Integer> param2 = new ArrayList<>();
    param2.add(38);
    param2.add(30);
    param2.add(13);
    param2.add(70);
    param2.add(29);
    param2.add(55);
    param2.add(20);
    param2.add(64);
    param2.add(66);
    param2.add(53);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("COUNT_ARRAYS_CONSECUTIVE_ELEMENT_DIFFERENT_VALUES," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_ARRAYS_CONSECUTIVE_ELEMENT_DIFFERENT_VALUES," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_ARRAYS_CONSECUTIVE_ELEMENT_DIFFERENT_VALUES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

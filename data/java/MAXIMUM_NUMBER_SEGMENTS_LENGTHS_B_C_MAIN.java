public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(23);
    param0.add(62);
    param0.add(32);
    param0.add(82);
    param0.add(94);
    param0.add(44);
    param0.add(4);
    param0.add(53);
    param0.add(9);
    param0.add(23);
    List<Integer> param1 = new ArrayList<>();
    param1.add(16);
    param1.add(76);
    param1.add(46);
    param1.add(48);
    param1.add(99);
    param1.add(21);
    param1.add(57);
    param1.add(23);
    param1.add(55);
    param1.add(15);
    List<Integer> param2 = new ArrayList<>();
    param2.add(23);
    param2.add(81);
    param2.add(1);
    param2.add(72);
    param2.add(62);
    param2.add(46);
    param2.add(2);
    param2.add(80);
    param2.add(26);
    param2.add(73);
    List<Integer> param3 = new ArrayList<>();
    param3.add(18);
    param3.add(97);
    param3.add(78);
    param3.add(58);
    param3.add(38);
    param3.add(60);
    param3.add(77);
    param3.add(5);
    param3.add(85);
    param3.add(42);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)))
	        {
                builder.append("MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

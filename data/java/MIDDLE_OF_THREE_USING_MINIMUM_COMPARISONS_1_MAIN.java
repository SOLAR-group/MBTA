public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(43);
    param0.add(76);
    param0.add(57);
    param0.add(10);
    param0.add(59);
    param0.add(92);
    param0.add(49);
    param0.add(16);
    param0.add(33);
    param0.add(66);
    List<Integer> param1 = new ArrayList<>();
    param1.add(24);
    param1.add(54);
    param1.add(5);
    param1.add(13);
    param1.add(47);
    param1.add(14);
    param1.add(62);
    param1.add(95);
    param1.add(41);
    param1.add(63);
    List<Integer> param2 = new ArrayList<>();
    param2.add(7);
    param2.add(66);
    param2.add(40);
    param2.add(4);
    param2.add(56);
    param2.add(50);
    param2.add(65);
    param2.add(12);
    param2.add(90);
    param2.add(46);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(46);
    param0.add(26);
    param0.add(40);
    param0.add(58);
    param0.add(25);
    param0.add(2);
    param0.add(8);
    param0.add(21);
    param0.add(82);
    param0.add(17);
    List<Integer> param1 = new ArrayList<>();
    param1.add(89);
    param1.add(82);
    param1.add(12);
    param1.add(4);
    param1.add(44);
    param1.add(87);
    param1.add(65);
    param1.add(87);
    param1.add(10);
    param1.add(61);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("BASIC_AND_EXTENDED_EUCLIDEAN_ALGORITHMS," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("BASIC_AND_EXTENDED_EUCLIDEAN_ALGORITHMS," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("BASIC_AND_EXTENDED_EUCLIDEAN_ALGORITHMS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

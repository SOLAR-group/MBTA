public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(50);
    param0.add(52);
    param0.add(42);
    param0.add(2);
    param0.add(37);
    param0.add(48);
    param0.add(31);
    param0.add(9);
    param0.add(78);
    param0.add(64);
    List<Integer> param1 = new ArrayList<>();
    param1.add(60);
    param1.add(45);
    param1.add(17);
    param1.add(68);
    param1.add(43);
    param1.add(46);
    param1.add(4);
    param1.add(64);
    param1.add(14);
    param1.add(80);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("NTH_MULTIPLE_NUMBER_FIBONACCI_SERIES," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("NTH_MULTIPLE_NUMBER_FIBONACCI_SERIES," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("NTH_MULTIPLE_NUMBER_FIBONACCI_SERIES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

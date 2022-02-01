public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(57);
    param0.add(3);
    param0.add(10);
    param0.add(10);
    param0.add(6);
    param0.add(2);
    param0.add(1);
    param0.add(20);
    param0.add(96);
    param0.add(25);
    List<Integer> param1 = new ArrayList<>();
    param1.add(1);
    param1.add(9);
    param1.add(101);
    param1.add(10000);
    param1.add(46656);
    param1.add(2048);
    param1.add(40);
    param1.add(79);
    param1.add(98);
    param1.add(5);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

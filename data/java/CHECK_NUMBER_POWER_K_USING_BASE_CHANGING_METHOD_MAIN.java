public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(64);
    param0.add(16);
    param0.add(27);
    param0.add(81);
    param0.add(1);
    param0.add(69);
    param0.add(8);
    param0.add(31);
    param0.add(43);
    param0.add(54);
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
    param1.add(2);
    param1.add(3);
    param1.add(72);
    param1.add(9);
    param1.add(17);
    param1.add(20);
    param1.add(79);
    param1.add(81);
    param1.add(89);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("CHECK_NUMBER_POWER_K_USING_BASE_CHANGING_METHOD," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_NUMBER_POWER_K_USING_BASE_CHANGING_METHOD," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_NUMBER_POWER_K_USING_BASE_CHANGING_METHOD," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(1);
    param0.add(6);
    param0.add(75);
    param0.add(51);
    param0.add(19);
    param0.add(82);
    param0.add(72);
    param0.add(48);
    param0.add(12);
    param0.add(41);
    List<Integer> param1 = new ArrayList<>();
    param1.add(44);
    param1.add(61);
    param1.add(20);
    param1.add(17);
    param1.add(25);
    param1.add(98);
    param1.add(21);
    param1.add(41);
    param1.add(17);
    param1.add(80);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("COMPUTE_AVERAGE_TWO_NUMBERS_WITHOUT_OVERFLOW," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COMPUTE_AVERAGE_TWO_NUMBERS_WITHOUT_OVERFLOW," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COMPUTE_AVERAGE_TWO_NUMBERS_WITHOUT_OVERFLOW," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

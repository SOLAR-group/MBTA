public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(49);
    param0.add(80);
    param0.add(10);
    param0.add(81);
    param0.add(11);
    param0.add(45);
    param0.add(86);
    param0.add(27);
    param0.add(80);
    param0.add(97);
    List<Integer> param1 = new ArrayList<>();
    param1.add(30);
    param1.add(25);
    param1.add(9);
    param1.add(57);
    param1.add(4);
    param1.add(34);
    param1.add(90);
    param1.add(78);
    param1.add(60);
    param1.add(31);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("FINDING_POWER_PRIME_NUMBER_P_N," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FINDING_POWER_PRIME_NUMBER_P_N," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FINDING_POWER_PRIME_NUMBER_P_N," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

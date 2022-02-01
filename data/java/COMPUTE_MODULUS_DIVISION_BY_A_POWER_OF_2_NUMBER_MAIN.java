public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(54);
    param0.add(39);
    param0.add(35);
    param0.add(9);
    param0.add(62);
    param0.add(16);
    param0.add(93);
    param0.add(32);
    param0.add(39);
    param0.add(63);
    List<Integer> param1 = new ArrayList<>();
    param1.add(59);
    param1.add(84);
    param1.add(81);
    param1.add(60);
    param1.add(68);
    param1.add(16);
    param1.add(96);
    param1.add(38);
    param1.add(62);
    param1.add(16);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("COMPUTE_MODULUS_DIVISION_BY_A_POWER_OF_2_NUMBER," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COMPUTE_MODULUS_DIVISION_BY_A_POWER_OF_2_NUMBER," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COMPUTE_MODULUS_DIVISION_BY_A_POWER_OF_2_NUMBER," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

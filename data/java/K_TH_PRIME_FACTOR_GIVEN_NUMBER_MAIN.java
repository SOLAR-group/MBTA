public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(94);
    param0.add(99);
    param0.add(64);
    param0.add(27);
    param0.add(24);
    param0.add(84);
    param0.add(69);
    param0.add(69);
    param0.add(22);
    param0.add(39);
    List<Integer> param1 = new ArrayList<>();
    param1.add(0);
    param1.add(1);
    param1.add(3);
    param1.add(3);
    param1.add(4);
    param1.add(6);
    param1.add(98);
    param1.add(39);
    param1.add(60);
    param1.add(57);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("K_TH_PRIME_FACTOR_GIVEN_NUMBER," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("K_TH_PRIME_FACTOR_GIVEN_NUMBER," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("K_TH_PRIME_FACTOR_GIVEN_NUMBER," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(2);
    param0.add(57);
    param0.add(28);
    param0.add(43);
    param0.add(38);
    param0.add(29);
    param0.add(45);
    param0.add(47);
    param0.add(44);
    param0.add(3);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("SUM_OF_ALL_PROPER_DIVISORS_OF_A_NATURAL_NUMBER_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SUM_OF_ALL_PROPER_DIVISORS_OF_A_NATURAL_NUMBER_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SUM_OF_ALL_PROPER_DIVISORS_OF_A_NATURAL_NUMBER_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

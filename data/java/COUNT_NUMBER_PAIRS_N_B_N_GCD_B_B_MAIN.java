public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(17);
    param0.add(72);
    param0.add(43);
    param0.add(55);
    param0.add(62);
    param0.add(22);
    param0.add(17);
    param0.add(68);
    param0.add(20);
    param0.add(29);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("COUNT_NUMBER_PAIRS_N_B_N_GCD_B_B," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_NUMBER_PAIRS_N_B_N_GCD_B_B," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_NUMBER_PAIRS_N_B_N_GCD_B_B," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

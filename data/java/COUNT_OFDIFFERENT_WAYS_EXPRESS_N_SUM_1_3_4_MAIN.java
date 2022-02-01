public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(44);
    param0.add(9);
    param0.add(19);
    param0.add(10);
    param0.add(78);
    param0.add(94);
    param0.add(70);
    param0.add(81);
    param0.add(81);
    param0.add(49);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("COUNT_OFDIFFERENT_WAYS_EXPRESS_N_SUM_1_3_4_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_OFDIFFERENT_WAYS_EXPRESS_N_SUM_1_3_4_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_OFDIFFERENT_WAYS_EXPRESS_N_SUM_1_3_4_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

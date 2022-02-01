public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(37);
    param0.add(13);
    param0.add(51);
    param0.add(69);
    param0.add(76);
    param0.add(10);
    param0.add(97);
    param0.add(40);
    param0.add(69);
    param0.add(4);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

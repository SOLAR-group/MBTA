public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(90);
    param0.add(95);
    param0.add(22);
    param0.add(29);
    param0.add(62);
    param0.add(40);
    param0.add(52);
    param0.add(21);
    param0.add(33);
    param0.add(11);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("N_TH_TERM_SERIES_2_12_36_80_150_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("N_TH_TERM_SERIES_2_12_36_80_150_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("N_TH_TERM_SERIES_2_12_36_80_150_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

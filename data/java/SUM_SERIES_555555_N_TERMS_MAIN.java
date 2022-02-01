public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(18);
    param0.add(81);
    param0.add(77);
    param0.add(84);
    param0.add(87);
    param0.add(14);
    param0.add(15);
    param0.add(3);
    param0.add(21);
    param0.add(60);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("SUM_SERIES_555555_N_TERMS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SUM_SERIES_555555_N_TERMS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SUM_SERIES_555555_N_TERMS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

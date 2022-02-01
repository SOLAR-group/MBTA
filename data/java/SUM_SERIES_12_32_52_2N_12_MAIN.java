public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(14);
    param0.add(61);
    param0.add(37);
    param0.add(86);
    param0.add(47);
    param0.add(98);
    param0.add(70);
    param0.add(24);
    param0.add(76);
    param0.add(24);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("SUM_SERIES_12_32_52_2N_12," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SUM_SERIES_12_32_52_2N_12," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SUM_SERIES_12_32_52_2N_12," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

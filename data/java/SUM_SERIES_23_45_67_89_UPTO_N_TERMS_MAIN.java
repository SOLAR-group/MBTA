public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(49);
    param0.add(4);
    param0.add(60);
    param0.add(90);
    param0.add(96);
    param0.add(29);
    param0.add(86);
    param0.add(47);
    param0.add(77);
    param0.add(87);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i))) )/ (Math.abs(f_filled(param0.get(i))) + 0.0000001)) < 0.001)
	        {
                builder.append("SUM_SERIES_23_45_67_89_UPTO_N_TERMS," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SUM_SERIES_23_45_67_89_UPTO_N_TERMS," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SUM_SERIES_23_45_67_89_UPTO_N_TERMS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

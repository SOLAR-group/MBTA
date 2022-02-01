public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Double> param0 = new ArrayList<>();
    param0.add(1.0);
    param0.add(5.0);
    param0.add(10.0);
    param0.add(20.0);
    param0.add(40.0);
    param0.add(2.0);
    param0.add(3.0);
    param0.add(-1.0);
    param0.add(4663.43115050185);
    param0.add(-3722.039522409859);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("CALCULATING_FACTORIALS_USING_STIRLING_APPROXIMATION," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CALCULATING_FACTORIALS_USING_STIRLING_APPROXIMATION," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CALCULATING_FACTORIALS_USING_STIRLING_APPROXIMATION," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

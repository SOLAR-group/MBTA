public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(56);
    param0.add(28);
    param0.add(4);
    param0.add(24);
    param0.add(72);
    param0.add(30);
    param0.add(48);
    param0.add(32);
    param0.add(13);
    param0.add(19);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

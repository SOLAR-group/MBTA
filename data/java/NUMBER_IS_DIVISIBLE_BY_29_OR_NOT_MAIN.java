public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(29L);
param0.add(0L);
param0.add(65L);
param0.add(1419L);
param0.add(54L);
param0.add(7L);
param0.add(44L);
param0.add(34L);
param0.add(1160L);
param0.add(292929002929L);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("NUMBER_IS_DIVISIBLE_BY_29_OR_NOT_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("NUMBER_IS_DIVISIBLE_BY_29_OR_NOT_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("NUMBER_IS_DIVISIBLE_BY_29_OR_NOT_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

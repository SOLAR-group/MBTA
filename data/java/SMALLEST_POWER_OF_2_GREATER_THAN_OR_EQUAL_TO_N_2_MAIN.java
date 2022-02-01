public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(60);
    param0.add(20);
    param0.add(33);
    param0.add(34);
    param0.add(68);
    param0.add(79);
    param0.add(20);
    param0.add(41);
    param0.add(36);
    param0.add(17);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N_2_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N_2_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N_2_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
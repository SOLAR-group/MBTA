public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(42L);
    param0.add(40L);
    param0.add(67L);
    param0.add(73L);
    param0.add(18L);
    param0.add(16L);
    param0.add(74L);
    param0.add(33L);
    param0.add(92L);
    param0.add(22L);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("PROGRAM_PRINT_SUM_GIVEN_NTH_TERM_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PROGRAM_PRINT_SUM_GIVEN_NTH_TERM_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PROGRAM_PRINT_SUM_GIVEN_NTH_TERM_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

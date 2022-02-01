public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(371);
    param0.add(9474);
    param0.add(85);
    param0.add(35);
    param0.add(54);
    param0.add(17);
    param0.add(97);
    param0.add(63);
    param0.add(12);
    param0.add(43);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("PROGRAM_CHECK_PLUS_PERFECT_NUMBER_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PROGRAM_CHECK_PLUS_PERFECT_NUMBER_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PROGRAM_CHECK_PLUS_PERFECT_NUMBER_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

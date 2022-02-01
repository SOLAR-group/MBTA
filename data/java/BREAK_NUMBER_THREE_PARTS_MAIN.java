public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(52L);
    param0.add(47L);
    param0.add(75L);
    param0.add(36L);
    param0.add(68L);
    param0.add(16L);
    param0.add(99L);
    param0.add(38L);
    param0.add(84L);
    param0.add(45L);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("BREAK_NUMBER_THREE_PARTS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("BREAK_NUMBER_THREE_PARTS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("BREAK_NUMBER_THREE_PARTS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(27);
    param0.add(64);
    param0.add(93);
    param0.add(90);
    param0.add(85);
    param0.add(86);
    param0.add(72);
    param0.add(86);
    param0.add(32);
    param0.add(1);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("UGLY_NUMBERS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("UGLY_NUMBERS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("UGLY_NUMBERS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(73);
    param0.add(28);
    param0.add(33);
    param0.add(23);
    param0.add(84);
    param0.add(31);
    param0.add(48);
    param0.add(46);
    param0.add(45);
    param0.add(90);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("MAXIMUM_GAMES_PLAYED_WINNER," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MAXIMUM_GAMES_PLAYED_WINNER," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MAXIMUM_GAMES_PLAYED_WINNER," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

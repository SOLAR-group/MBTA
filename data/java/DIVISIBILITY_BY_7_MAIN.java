public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(0);
    param0.add(-21);
    param0.add(7);
    param0.add(63);
    param0.add(84);
    param0.add(73);
    param0.add(81);
    param0.add(-10);
    param0.add(47);
    param0.add(23);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("DIVISIBILITY_BY_7_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("DIVISIBILITY_BY_7_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("DIVISIBILITY_BY_7_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

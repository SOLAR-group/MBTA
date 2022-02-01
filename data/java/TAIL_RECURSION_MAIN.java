public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(77);
    param0.add(62);
    param0.add(42);
    param0.add(16);
    param0.add(82);
    param0.add(37);
    param0.add(29);
    param0.add(32);
    param0.add(82);
    param0.add(91);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("TAIL_RECURSION," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("TAIL_RECURSION," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("TAIL_RECURSION," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

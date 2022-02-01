public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(88);
    param0.add(24);
    param0.add(3);
    param0.add(22);
    param0.add(53);
    param0.add(2);
    param0.add(88);
    param0.add(30);
    param0.add(38);
    param0.add(2);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("DOUBLE_FACTORIAL_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("DOUBLE_FACTORIAL_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("DOUBLE_FACTORIAL_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

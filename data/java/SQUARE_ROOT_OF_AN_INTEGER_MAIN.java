public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(89);
    param0.add(11);
    param0.add(14);
    param0.add(92);
    param0.add(76);
    param0.add(63);
    param0.add(51);
    param0.add(16);
    param0.add(83);
    param0.add(66);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("SQUARE_ROOT_OF_AN_INTEGER," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SQUARE_ROOT_OF_AN_INTEGER," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SQUARE_ROOT_OF_AN_INTEGER," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

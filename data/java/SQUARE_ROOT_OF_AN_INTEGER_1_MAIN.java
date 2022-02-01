public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(40);
    param0.add(10);
    param0.add(46);
    param0.add(54);
    param0.add(1);
    param0.add(67);
    param0.add(64);
    param0.add(10);
    param0.add(75);
    param0.add(11);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("SQUARE_ROOT_OF_AN_INTEGER_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SQUARE_ROOT_OF_AN_INTEGER_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SQUARE_ROOT_OF_AN_INTEGER_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

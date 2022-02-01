public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(1);
    param0.add(5);
    param0.add(14);
    param0.add(140);
    param0.add(204);
    param0.add(3);
    param0.add(506);
    param0.add(42);
    param0.add(4);
    param0.add(87);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("SQUARE_PYRAMIDAL_NUMBER_SUM_SQUARES_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SQUARE_PYRAMIDAL_NUMBER_SUM_SQUARES_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SQUARE_PYRAMIDAL_NUMBER_SUM_SQUARES_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(67);
    param0.add(90);
    param0.add(55);
    param0.add(90);
    param0.add(83);
    param0.add(32);
    param0.add(58);
    param0.add(38);
    param0.add(87);
    param0.add(87);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

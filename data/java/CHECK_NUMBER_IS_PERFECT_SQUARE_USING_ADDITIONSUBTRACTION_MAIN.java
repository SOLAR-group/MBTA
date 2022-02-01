public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(1);
    param0.add(4);
    param0.add(9);
    param0.add(25);
    param0.add(36);
    param0.add(3);
    param0.add(121);
    param0.add(14);
    param0.add(17);
    param0.add(80);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("CHECK_NUMBER_IS_PERFECT_SQUARE_USING_ADDITIONSUBTRACTION," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_NUMBER_IS_PERFECT_SQUARE_USING_ADDITIONSUBTRACTION," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_NUMBER_IS_PERFECT_SQUARE_USING_ADDITIONSUBTRACTION," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

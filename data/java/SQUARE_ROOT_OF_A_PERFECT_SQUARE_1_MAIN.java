public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(58);
    param0.add(55);
    param0.add(51);
    param0.add(42);
    param0.add(2);
    param0.add(30);
    param0.add(77);
    param0.add(82);
    param0.add(31);
    param0.add(9);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("SQUARE_ROOT_OF_A_PERFECT_SQUARE_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SQUARE_ROOT_OF_A_PERFECT_SQUARE_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SQUARE_ROOT_OF_A_PERFECT_SQUARE_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

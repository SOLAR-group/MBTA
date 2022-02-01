public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(42);
    param0.add(75);
    param0.add(94);
    param0.add(5);
    param0.add(52);
    param0.add(22);
    param0.add(77);
    param0.add(44);
    param0.add(85);
    param0.add(59);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

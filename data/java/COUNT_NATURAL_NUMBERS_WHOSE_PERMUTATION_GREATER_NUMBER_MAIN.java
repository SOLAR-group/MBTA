public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(69);
    param0.add(72);
    param0.add(88);
    param0.add(7);
    param0.add(66);
    param0.add(34);
    param0.add(23);
    param0.add(37);
    param0.add(33);
    param0.add(21);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("COUNT_NATURAL_NUMBERS_WHOSE_PERMUTATION_GREATER_NUMBER_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_NATURAL_NUMBERS_WHOSE_PERMUTATION_GREATER_NUMBER_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_NATURAL_NUMBERS_WHOSE_PERMUTATION_GREATER_NUMBER_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

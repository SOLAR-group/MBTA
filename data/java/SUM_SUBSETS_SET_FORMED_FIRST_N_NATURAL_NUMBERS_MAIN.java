public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(76);
    param0.add(26);
    param0.add(45);
    param0.add(35);
    param0.add(34);
    param0.add(22);
    param0.add(3);
    param0.add(25);
    param0.add(22);
    param0.add(78);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("SUM_SUBSETS_SET_FORMED_FIRST_N_NATURAL_NUMBERS," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SUM_SUBSETS_SET_FORMED_FIRST_N_NATURAL_NUMBERS," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SUM_SUBSETS_SET_FORMED_FIRST_N_NATURAL_NUMBERS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

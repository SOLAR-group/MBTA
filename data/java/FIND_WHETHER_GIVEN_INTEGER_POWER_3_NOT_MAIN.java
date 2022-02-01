public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(1);
    param0.add(3);
    param0.add(27);
    param0.add(9);
    param0.add(-9);
    param0.add(11);
    param0.add(57);
    param0.add(21);
    param0.add(60);
    param0.add(44);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("FIND_WHETHER_GIVEN_INTEGER_POWER_3_NOT," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_WHETHER_GIVEN_INTEGER_POWER_3_NOT," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_WHETHER_GIVEN_INTEGER_POWER_3_NOT," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

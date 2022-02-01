public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(86);
    param0.add(75);
    param0.add(14);
    param0.add(5);
    param0.add(41);
    param0.add(35);
    param0.add(30);
    param0.add(89);
    param0.add(84);
    param0.add(53);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("COUNT_NUMBER_BINARY_STRINGS_WITHOUT_CONSECUTIVE_1S_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_NUMBER_BINARY_STRINGS_WITHOUT_CONSECUTIVE_1S_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_NUMBER_BINARY_STRINGS_WITHOUT_CONSECUTIVE_1S_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
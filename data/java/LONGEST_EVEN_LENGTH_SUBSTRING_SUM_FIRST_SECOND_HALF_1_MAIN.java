public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("jNkTf");
    param0.add("7");
    param0.add("100001101001");
    param0.add("fRXyQrTUjEk");
    param0.add("908404");
    param0.add("0101010010");
    param0.add("svq");
    param0.add("19");
    param0.add("11100010001");
    param0.add("O HgwJyOVfnV");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("LONGEST_EVEN_LENGTH_SUBSTRING_SUM_FIRST_SECOND_HALF_1," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("LONGEST_EVEN_LENGTH_SUBSTRING_SUM_FIRST_SECOND_HALF_1," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("LONGEST_EVEN_LENGTH_SUBSTRING_SUM_FIRST_SECOND_HALF_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

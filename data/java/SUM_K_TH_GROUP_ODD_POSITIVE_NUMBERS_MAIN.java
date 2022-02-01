public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(91);
    param0.add(52);
    param0.add(78);
    param0.add(51);
    param0.add(65);
    param0.add(39);
    param0.add(42);
    param0.add(12);
    param0.add(56);
    param0.add(98);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("SUM_K_TH_GROUP_ODD_POSITIVE_NUMBERS," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SUM_K_TH_GROUP_ODD_POSITIVE_NUMBERS," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SUM_K_TH_GROUP_ODD_POSITIVE_NUMBERS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

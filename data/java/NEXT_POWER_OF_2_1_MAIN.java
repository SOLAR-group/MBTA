public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(8);
    param0.add(79);
    param0.add(31);
    param0.add(63);
    param0.add(18);
    param0.add(2);
    param0.add(6);
    param0.add(85);
    param0.add(29);
    param0.add(8);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("NEXT_POWER_OF_2_1," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("NEXT_POWER_OF_2_1," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("NEXT_POWER_OF_2_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(75);
    param0.add(76);
    param0.add(55);
    param0.add(14);
    param0.add(43);
    param0.add(10);
    param0.add(16);
    param0.add(30);
    param0.add(44);
    param0.add(65);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("LEONARDO_NUMBER_1," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("LEONARDO_NUMBER_1," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("LEONARDO_NUMBER_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

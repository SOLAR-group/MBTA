public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(79);
    param0.add(95);
    param0.add(84);
    param0.add(12);
    param0.add(72);
    param0.add(67);
    param0.add(82);
    param0.add(14);
    param0.add(2);
    param0.add(69);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("PROGRAM_FOR_FACTORIAL_OF_A_NUMBER," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PROGRAM_FOR_FACTORIAL_OF_A_NUMBER," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PROGRAM_FOR_FACTORIAL_OF_A_NUMBER," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

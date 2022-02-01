public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(84);
    param0.add(41);
    param0.add(5);
    param0.add(38);
    param0.add(79);
    param0.add(80);
    param0.add(64);
    param0.add(62);
    param0.add(24);
    param0.add(12);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("C_PROGRAM_FACTORIAL_NUMBER," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("C_PROGRAM_FACTORIAL_NUMBER," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("C_PROGRAM_FACTORIAL_NUMBER," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

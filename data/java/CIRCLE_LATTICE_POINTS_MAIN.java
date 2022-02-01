public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(34);
    param0.add(56);
    param0.add(90);
    param0.add(47);
    param0.add(36);
    param0.add(63);
    param0.add(21);
    param0.add(76);
    param0.add(18);
    param0.add(75);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("CIRCLE_LATTICE_POINTS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CIRCLE_LATTICE_POINTS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CIRCLE_LATTICE_POINTS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

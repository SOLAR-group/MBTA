public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(56);
    param0.add(73);
    param0.add(22);
    param0.add(10);
    param0.add(84);
    param0.add(20);
    param0.add(51);
    param0.add(91);
    param0.add(10);
    param0.add(83);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i))) )/ (Math.abs(f_filled(param0.get(i))) + 0.0000001)) < 0.001)
	        {
                builder.append("CALCULATE_VOLUME_DODECAHEDRON_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CALCULATE_VOLUME_DODECAHEDRON_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CALCULATE_VOLUME_DODECAHEDRON_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

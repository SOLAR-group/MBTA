public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(58);
    param0.add(56);
    param0.add(35);
    param0.add(99);
    param0.add(13);
    param0.add(45);
    param0.add(40);
    param0.add(92);
    param0.add(7);
    param0.add(13);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i))) )/ (Math.abs(f_filled(param0.get(i))) + 0.0000001)) < 0.001)
	        {
                builder.append("CALCULATE_AREA_TETRAHEDRON," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CALCULATE_AREA_TETRAHEDRON," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CALCULATE_AREA_TETRAHEDRON," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

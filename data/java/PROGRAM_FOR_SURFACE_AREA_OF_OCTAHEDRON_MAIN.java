public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Double> param0 = new ArrayList<>();
    param0.add(1449.255716877097);
    param0.add(-8772.104874265995);
    param0.add(2948.419328234334);
    param0.add(-1184.220109553511);
    param0.add(7422.825800698956);
    param0.add(-5808.280006171851);
    param0.add(829.8963781665169);
    param0.add(-7368.438572511732);
    param0.add(5572.033890611617);
    param0.add(-3998.9441642787706);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i))) )/ (Math.abs(f_filled(param0.get(i))) + 0.0000001)) < 0.001)
	        {
                builder.append("PROGRAM_FOR_SURFACE_AREA_OF_OCTAHEDRON_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PROGRAM_FOR_SURFACE_AREA_OF_OCTAHEDRON_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PROGRAM_FOR_SURFACE_AREA_OF_OCTAHEDRON_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

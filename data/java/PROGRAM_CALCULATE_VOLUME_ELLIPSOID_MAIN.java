public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Float> param0 = new ArrayList<>();
    param0.add(3287.4842316041018F);
    param0.add(-3707.427510963942F);
    param0.add(8980.643174783816F);
    param0.add(-2698.0187368852694F);
    param0.add(8627.156664162168F);
    param0.add(-7316.329924623669F);
    param0.add(7857.3846206400485F);
    param0.add(-6502.657905007728F);
    param0.add(4468.400513325576F);
    param0.add(-7231.864791620428F);
    List<Float> param1 = new ArrayList<>();
    param1.add(4503.332888443404F);
    param1.add(-6671.335781753231F);
    param1.add(3584.781688607942F);
    param1.add(-1004.7289573934537F);
    param1.add(9572.27618966978F);
    param1.add(-6591.043206581106F);
    param1.add(3671.761679299217F);
    param1.add(-1412.2240121470609F);
    param1.add(2272.1999139470304F);
    param1.add(-8036.087711033032F);
    List<Float> param2 = new ArrayList<>();
    param2.add(8590.24729914204F);
    param2.add(-2780.4954870801926F);
    param2.add(2818.469507143102F);
    param2.add(-9602.530725071243F);
    param2.add(4783.930377855004F);
    param2.add(-9760.465488363216F);
    param2.add(2534.5825334137794F);
    param2.add(-6135.238350044512F);
    param2.add(4753.075799180736F);
    param2.add(-6456.263512521035F);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i),param1.get(i),param2.get(i))) )/ (Math.abs(f_filled(param0.get(i),param1.get(i),param2.get(i))) + 0.0000001)) < 0.001F)
	        {
                builder.append("PROGRAM_CALCULATE_VOLUME_ELLIPSOID," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PROGRAM_CALCULATE_VOLUME_ELLIPSOID," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PROGRAM_CALCULATE_VOLUME_ELLIPSOID," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

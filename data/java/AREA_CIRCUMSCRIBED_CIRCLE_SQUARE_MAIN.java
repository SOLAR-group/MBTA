public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Float> param0 = new ArrayList<>();
    param0.add(3296.590241413969F);
    param0.add(-1688.6061770081972F);
    param0.add(1571.9067680023313F);
    param0.add(-3117.129927920369F);
    param0.add(8561.027934208052F);
    param0.add(-5052.211066243729F);
    param0.add(3601.752337206948F);
    param0.add(-651.9008970363393F);
    param0.add(4415.044414999076F);
    param0.add(-1453.219956352866F);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i))) )/ (Math.abs(f_filled(param0.get(i))) + 0.0000001)) < 0.001F)
	        {
                builder.append("AREA_CIRCUMSCRIBED_CIRCLE_SQUARE," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("AREA_CIRCUMSCRIBED_CIRCLE_SQUARE," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("AREA_CIRCUMSCRIBED_CIRCLE_SQUARE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

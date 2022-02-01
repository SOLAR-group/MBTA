public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Double> param0 = new ArrayList<>();
    param0.add(7322.337365895532);
    param0.add(-0.5025472034247969);
    param0.add(8735.336068205026);
    param0.add(-5478.862697905712);
    param0.add(8264.126919165505);
    param0.add(-9671.311773842834);
    param0.add(9995.328351000411);
    param0.add(-5274.574323066984);
    param0.add(1310.8711644223736);
    param0.add(-2829.678131972794);
    List<Double> param1 = new ArrayList<>();
    param1.add(6996.326968156217);
    param1.add(-2910.070017192333);
    param1.add(1910.3752934680874);
    param1.add(-9470.18148108585);
    param1.add(7058.937313484608);
    param1.add(-3867.070379361206);
    param1.add(2145.339179488316);
    param1.add(-3583.7503371694124);
    param1.add(5214.059687285893);
    param1.add(-9371.556600288217);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("CALCULATE_ANGLE_HOUR_HAND_MINUTE_HAND," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CALCULATE_ANGLE_HOUR_HAND_MINUTE_HAND," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CALCULATE_ANGLE_HOUR_HAND_MINUTE_HAND," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

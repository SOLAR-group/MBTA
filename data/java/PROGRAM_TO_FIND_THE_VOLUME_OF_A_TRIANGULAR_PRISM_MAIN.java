public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Float> param0 = new ArrayList<>();
    param0.add(8448.900678262902F);
    param0.add(-1849.728957491451F);
    param0.add(412.667844022232F);
    param0.add(-5954.835911765373F);
    param0.add(8437.913444665008F);
    param0.add(-7183.181663518317F);
    param0.add(2340.7905920227954F);
    param0.add(-7281.157547371143F);
    param0.add(471.3930826982504F);
    param0.add(-7550.426360065503F);
    List<Float> param1 = new ArrayList<>();
    param1.add(8135.461799983198F);
    param1.add(-4240.89241631363F);
    param1.add(9798.083992381831F);
    param1.add(-661.8872499003203F);
    param1.add(8182.675681595904F);
    param1.add(-6846.746446198541F);
    param1.add(5479.00956987109F);
    param1.add(-615.8705455524116F);
    param1.add(1357.3753126091392F);
    param1.add(-2693.2262997056355F);
    List<Float> param2 = new ArrayList<>();
    param2.add(6577.239053611328F);
    param2.add(-9953.518310747193F);
    param2.add(1449.9204200270522F);
    param2.add(-8049.6051526695055F);
    param2.add(9863.296545513396F);
    param2.add(-971.2199894221352F);
    param2.add(7073.449591910562F);
    param2.add(-3343.0245192607968F);
    param2.add(1907.815700915636F);
    param2.add(-9110.64755244532F);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i),param1.get(i),param2.get(i))) )/ (Math.abs(f_filled(param0.get(i),param1.get(i),param2.get(i))) + 0.0000001)) < 0.001F)
	        {
                builder.append("PROGRAM_TO_FIND_THE_VOLUME_OF_A_TRIANGULAR_PRISM," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PROGRAM_TO_FIND_THE_VOLUME_OF_A_TRIANGULAR_PRISM," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PROGRAM_TO_FIND_THE_VOLUME_OF_A_TRIANGULAR_PRISM," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

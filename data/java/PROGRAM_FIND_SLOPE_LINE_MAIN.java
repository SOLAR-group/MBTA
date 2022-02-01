public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Float> param0 = new ArrayList<>();
    param0.add(236.27324548309292F);
    param0.add(-9201.144918204123F);
    param0.add(3480.4716834445326F);
    param0.add(-6915.538971485092F);
    param0.add(8887.97173657486F);
    param0.add(-3785.5177159369946F);
    param0.add(3037.6696554256832F);
    param0.add(-7925.458496016523F);
    param0.add(1404.2919985268031F);
    param0.add(-4748.744241168378F);
    List<Float> param1 = new ArrayList<>();
    param1.add(5792.493225762838F);
    param1.add(-2716.3347716140406F);
    param1.add(3577.9608612055613F);
    param1.add(-4113.601103381095F);
    param1.add(1678.4080012662428F);
    param1.add(-3084.67461899163F);
    param1.add(4432.445827549F);
    param1.add(-3350.27411882042F);
    param1.add(8971.636233373416F);
    param1.add(-675.557388148954F);
    List<Float> param2 = new ArrayList<>();
    param2.add(7177.837879115863F);
    param2.add(-5161.142121227645F);
    param2.add(8611.515262945342F);
    param2.add(-748.3462104020822F);
    param2.add(8709.574949883017F);
    param2.add(-7415.76208254121F);
    param2.add(8387.304165588026F);
    param2.add(-5619.767086756504F);
    param2.add(3039.112051378511F);
    param2.add(-5998.241086029875F);
    List<Float> param3 = new ArrayList<>();
    param3.add(1289.5700425822731F);
    param3.add(-3205.784279961129F);
    param3.add(6744.864707668983F);
    param3.add(-9245.271700539257F);
    param3.add(8548.492675510739F);
    param3.add(-887.5389305564152F);
    param3.add(611.3373507518394F);
    param3.add(-1185.7423219907591F);
    param3.add(1947.6756252708972F);
    param3.add(-4236.658178504375F);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i))) )/ (Math.abs(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i))) + 0.0000001)) < 0.001F)
	        {
                builder.append("PROGRAM_FIND_SLOPE_LINE_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PROGRAM_FIND_SLOPE_LINE_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PROGRAM_FIND_SLOPE_LINE_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
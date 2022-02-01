public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("nObYIOjEQZ");
    param0.add("84574");
    param0.add("1010001010010");
    param0.add("DjZtAfUudk");
    param0.add("550");
    param0.add("1110");
    param0.add("GywyxwH");
    param0.add("67318370914755");
    param0.add("11011000000101");
    param0.add("G");
    List<String> param1 = new ArrayList<>();
    param1.add("uARTDTQbmGI");
    param1.add("8538229");
    param1.add("11");
    param1.add("OewGm");
    param1.add("132744553919");
    param1.add("0101");
    param1.add("LPQqEqrDZiwY");
    param1.add("9928");
    param1.add("00000");
    param1.add("V");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("MAXIMUM_LENGTH_PREFIX_ONE_STRING_OCCURS_SUBSEQUENCE_ANOTHER," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MAXIMUM_LENGTH_PREFIX_ONE_STRING_OCCURS_SUBSEQUENCE_ANOTHER," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MAXIMUM_LENGTH_PREFIX_ONE_STRING_OCCURS_SUBSEQUENCE_ANOTHER," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

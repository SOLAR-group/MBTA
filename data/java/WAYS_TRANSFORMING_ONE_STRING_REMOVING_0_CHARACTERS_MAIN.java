public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("abcccdf");
    param0.add("aabba");
    param0.add("aabsdfljk");
    param0.add("IONiqV");
    param0.add("9667771256770");
    param0.add("10001011");
    param0.add("fczbDtMDT");
    param0.add("298746088");
    param0.add("01100011000");
    param0.add("Qk");
    List<String> param1 = new ArrayList<>();
    param1.add("abccdf");
    param1.add("ab");
    param1.add("aa");
    param1.add("XKbBiGZ");
    param1.add("50915176");
    param1.add("01");
    param1.add("FbX");
    param1.add("29888");
    param1.add("0");
    param1.add("");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("WAYS_TRANSFORMING_ONE_STRING_REMOVING_0_CHARACTERS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("WAYS_TRANSFORMING_ONE_STRING_REMOVING_0_CHARACTERS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("WAYS_TRANSFORMING_ONE_STRING_REMOVING_0_CHARACTERS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("daBcd");
    param0.add("417514");
    param0.add("010000");
    param0.add("ZcKYguiMrdyn");
    param0.add("argaju");
    param0.add("1110101101");
    param0.add("ySOCoSaygi");
    param0.add("204");
    param0.add("10011100000010");
    param0.add("nMAioozPmY");
    List<String> param1 = new ArrayList<>();
    param1.add("ABC");
    param1.add("9");
    param1.add("1111011010");
    param1.add("iz");
    param1.add("RAJ");
    param1.add("110101001");
    param1.add("aRhxkYqh");
    param1.add("6986871066");
    param1.add("0");
    param1.add("WZFdDKw");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("CHECK_POSSIBLE_TRANSFORM_ONE_STRING_ANOTHER_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_POSSIBLE_TRANSFORM_ONE_STRING_ANOTHER_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_POSSIBLE_TRANSFORM_ONE_STRING_ANOTHER_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

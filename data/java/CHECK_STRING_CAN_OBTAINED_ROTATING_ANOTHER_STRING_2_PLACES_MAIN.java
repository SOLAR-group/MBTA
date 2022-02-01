public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("amazon");
    param0.add("onamaz");
    param0.add("amazon");
    param0.add("ab");
    param0.add("737009");
    param0.add("000110");
    param0.add("l");
    param0.add("4420318628");
    param0.add("11011111000000");
    param0.add(" pvFHANc");
    List<String> param1 = new ArrayList<>();
    param1.add("azonam");
    param1.add("amazon");
    param1.add("azoman");
    param1.add("ab");
    param1.add("239119");
    param1.add("01111");
    param1.add("YVo hqvnGxow");
    param1.add("52856");
    param1.add("10");
    param1.add("xBIDFbiGb");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("CHECK_STRING_CAN_OBTAINED_ROTATING_ANOTHER_STRING_2_PLACES_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_STRING_CAN_OBTAINED_ROTATING_ANOTHER_STRING_2_PLACES_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_STRING_CAN_OBTAINED_ROTATING_ANOTHER_STRING_2_PLACES_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

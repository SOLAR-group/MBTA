public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("VkfzrPG");
    param0.add("0526110506447");
    param0.add("011010010");
    param0.add("sPAwZACc ");
    param0.add("3");
    param0.add("0101");
    param0.add("VTtNu");
    param0.add("2317170");
    param0.add("111111000010");
    param0.add("Ktt");
    List<String> param1 = new ArrayList<>();
    param1.add("rKZ");
    param1.add("903");
    param1.add("110100000");
    param1.add("liYMsojPiinOV");
    param1.add("611");
    param1.add("01110101011");
    param1.add("Wsmc");
    param1.add("898421173423");
    param1.add("01100001110111");
    param1.add("CTbbVX wGBkE");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)).equals(f_gold(param0.get(i),param1.get(i))))
	        {
                builder.append("SUM_TWO_LARGE_NUMBERS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SUM_TWO_LARGE_NUMBERS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SUM_TWO_LARGE_NUMBERS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
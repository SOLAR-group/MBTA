public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("pR");
    param0.add("9518");
    param0.add("1");
    param0.add("nNMCIXUCpRMmvO");
    param0.add("3170487");
    param0.add("0100101010");
    param0.add("Z rONcUqWb");
    param0.add("00419297");
    param0.add("00");
    param0.add("r");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CALCULATE_MAXIMUM_VALUE_USING_SIGN_TWO_NUMBERS_STRING," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CALCULATE_MAXIMUM_VALUE_USING_SIGN_TWO_NUMBERS_STRING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

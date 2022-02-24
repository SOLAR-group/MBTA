public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("HLlQWSphZcIC");
    param0.add("080287724");
    param0.add("0000100000");
    param0.add(" Q");
    param0.add("4247040983");
    param0.add("00001011101");
    param0.add("LbNsnYTHmLbCf");
    param0.add("24");
    param0.add("110");
    param0.add("ie");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CHECK_WHETHER_NUMBER_DUCK_NUMBER_NOT," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CHECK_WHETHER_NUMBER_DUCK_NUMBER_NOT," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("235764");
    param0.add("321308924");
    param0.add("101111");
    param0.add("1998");
    param0.add("339589");
    param0.add("0000101");
    param0.add("264735");
    param0.add("19570453184");
    param0.add("000");
    param0.add("SsHh");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CHECK_DIVISIBILITY_LARGE_NUMBER_999," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CHECK_DIVISIBILITY_LARGE_NUMBER_999," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

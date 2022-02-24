public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("G");
    param0.add("48578");
    param0.add("010");
    param0.add("KkGp");
    param0.add("48928969618416");
    param0.add("0101011010");
    param0.add("X");
    param0.add("10073867");
    param0.add("01110000000");
    param0.add("k ");
    List<String> param1 = new ArrayList<>();
    param1.add("FcAiuKhw");
    param1.add("5117561223135");
    param1.add("00000");
    param1.add("nSE");
    param1.add("88497275");
    param1.add("11");
    param1.add("MomtbuxLRR");
    param1.add("28");
    param1.add("0110");
    param1.add("aSSlhOYp");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("SUM_TWO_LARGE_NUMBERS_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("SUM_TWO_LARGE_NUMBERS_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("fZOKCdZ Lav");
    param0.add("2");
    param0.add("1000001110");
    param0.add("IAOyBzgIWHo");
    param0.add("211806");
    param0.add("1");
    param0.add("CVaQTG");
    param0.add("6265187228");
    param0.add("10111101101000");
    param0.add("vEi");
    List<String> param1 = new ArrayList<>();
    param1.add("fKA");
    param1.add("187012");
    param1.add("0");
    param1.add("oA");
    param1.add("10");
    param1.add("001011100");
    param1.add("CT");
    param1.add("628");
    param1.add("01111");
    param1.add("bigsvkQG");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FIND_NUMBER_TIMES_STRING_OCCURS_GIVEN_STRING_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FIND_NUMBER_TIMES_STRING_OCCURS_GIVEN_STRING_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

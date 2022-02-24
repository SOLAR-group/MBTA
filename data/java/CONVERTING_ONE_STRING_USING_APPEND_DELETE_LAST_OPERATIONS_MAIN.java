public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("ZNHGro");
    param0.add("382880806774");
    param0.add("0");
    param0.add("lxHTRFCTSQ");
    param0.add("6399914758");
    param0.add("01100011100000");
    param0.add("WkGqlob");
    param0.add("46974006151");
    param0.add("1001001");
    param0.add("IJQ");
    List<String> param1 = new ArrayList<>();
    param1.add("jAdbtDUYQu");
    param1.add("65565");
    param1.add("00100010100");
    param1.add("sViXYE");
    param1.add("780990121");
    param1.add("0100");
    param1.add("NpQVdXzEtUZy");
    param1.add("74438");
    param1.add("1000010");
    param1.add("nFOHAeYEAp");
    List<Integer> param2 = new ArrayList<>();
    param2.add(3);
    param2.add(10);
    param2.add(2);
    param2.add(89);
    param2.add(9);
    param2.add(0);
    param2.add(6);
    param2.add(11);
    param2.add(15);
    param2.add(42);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CONVERTING_ONE_STRING_USING_APPEND_DELETE_LAST_OPERATIONS," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CONVERTING_ONE_STRING_USING_APPEND_DELETE_LAST_OPERATIONS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

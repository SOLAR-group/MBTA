public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("RElCP");
    param0.add("0139035510");
    param0.add("00011110");
    param0.add("TwanZWwLNXhFN");
    param0.add("6247009752778");
    param0.add("0100001011011");
    param0.add("NCh");
    param0.add("00714746542");
    param0.add("101000100");
    param0.add("MSTkXmlbPkV");
    List<Integer> param1 = new ArrayList<>();
    param1.add(13);
    param1.add(44);
    param1.add(86);
    param1.add(66);
    param1.add(55);
    param1.add(33);
    param1.add(75);
    param1.add(54);
    param1.add(93);
    param1.add(78);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("HOW_TO_COMPUTE_MOD_OF_A_BIG_NUMBER," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("HOW_TO_COMPUTE_MOD_OF_A_BIG_NUMBER," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

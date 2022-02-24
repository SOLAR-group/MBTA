public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("fYqkPLSWBgFy");
    param0.add("151587");
    param0.add("111111110");
    param0.add("JQJHaUkkTrt");
    param0.add("736592575580");
    param0.add("10");
    param0.add("L");
    param0.add("3476601");
    param0.add("0110001001");
    param0.add("YimayLFU");
    List<Integer> param1 = new ArrayList<>();
    param1.add(55);
    param1.add(84);
    param1.add(9);
    param1.add(97);
    param1.add(68);
    param1.add(3);
    param1.add(74);
    param1.add(2);
    param1.add(53);
    param1.add(45);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("NUMBER_SUBSEQUENCES_STRING_DIVISIBLE_N," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("NUMBER_SUBSEQUENCES_STRING_DIVISIBLE_N," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

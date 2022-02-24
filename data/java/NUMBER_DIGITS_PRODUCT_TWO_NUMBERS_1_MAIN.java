public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(97);
    param0.add(52);
    param0.add(95);
    param0.add(35);
    param0.add(40);
    param0.add(18);
    param0.add(92);
    param0.add(73);
    param0.add(10);
    param0.add(82);
    List<Integer> param1 = new ArrayList<>();
    param1.add(91);
    param1.add(49);
    param1.add(34);
    param1.add(40);
    param1.add(85);
    param1.add(97);
    param1.add(15);
    param1.add(98);
    param1.add(62);
    param1.add(22);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("NUMBER_DIGITS_PRODUCT_TWO_NUMBERS_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("NUMBER_DIGITS_PRODUCT_TWO_NUMBERS_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

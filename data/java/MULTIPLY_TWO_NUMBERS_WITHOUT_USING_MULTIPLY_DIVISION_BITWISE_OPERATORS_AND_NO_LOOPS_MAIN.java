public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(18);
    param0.add(23);
    param0.add(24);
    param0.add(75);
    param0.add(25);
    param0.add(57);
    param0.add(31);
    param0.add(8);
    param0.add(12);
    param0.add(74);
    List<Integer> param1 = new ArrayList<>();
    param1.add(94);
    param1.add(36);
    param1.add(22);
    param1.add(92);
    param1.add(43);
    param1.add(32);
    param1.add(57);
    param1.add(17);
    param1.add(76);
    param1.add(70);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MULTIPLY_TWO_NUMBERS_WITHOUT_USING_MULTIPLY_DIVISION_BITWISE_OPERATORS_AND_NO_LOOPS," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MULTIPLY_TWO_NUMBERS_WITHOUT_USING_MULTIPLY_DIVISION_BITWISE_OPERATORS_AND_NO_LOOPS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

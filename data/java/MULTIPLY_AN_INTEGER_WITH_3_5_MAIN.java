public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(58);
    param0.add(16);
    param0.add(82);
    param0.add(33);
    param0.add(88);
    param0.add(51);
    param0.add(81);
    param0.add(38);
    param0.add(79);
    param0.add(89);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MULTIPLY_AN_INTEGER_WITH_3_5," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MULTIPLY_AN_INTEGER_WITH_3_5," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

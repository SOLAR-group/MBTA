public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(57);
    param0.add(73);
    param0.add(79);
    param0.add(36);
    param0.add(71);
    param0.add(23);
    param0.add(41);
    param0.add(66);
    param0.add(46);
    param0.add(50);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

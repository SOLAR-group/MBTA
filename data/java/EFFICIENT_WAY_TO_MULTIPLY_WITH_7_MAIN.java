public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(41);
    param0.add(42);
    param0.add(62);
    param0.add(4);
    param0.add(31);
    param0.add(75);
    param0.add(5);
    param0.add(75);
    param0.add(85);
    param0.add(19);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("EFFICIENT_WAY_TO_MULTIPLY_WITH_7," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("EFFICIENT_WAY_TO_MULTIPLY_WITH_7," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

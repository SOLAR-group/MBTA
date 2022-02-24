public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(67);
    param0.add(89);
    param0.add(12);
    param0.add(94);
    param0.add(96);
    param0.add(25);
    param0.add(49);
    param0.add(8);
    param0.add(33);
    param0.add(59);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("EVEN_FIBONACCI_NUMBERS_SUM," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("EVEN_FIBONACCI_NUMBERS_SUM," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

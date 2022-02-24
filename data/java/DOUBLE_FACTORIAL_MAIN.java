public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(52L);
    param0.add(93L);
    param0.add(15L);
    param0.add(72L);
    param0.add(61L);
    param0.add(21L);
    param0.add(83L);
    param0.add(87L);
    param0.add(75L);
    param0.add(75L);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("DOUBLE_FACTORIAL," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("DOUBLE_FACTORIAL," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

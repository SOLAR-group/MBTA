public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(88);
    param0.add(79);
    param0.add(7);
    param0.add(36);
    param0.add(23);
    param0.add(10);
    param0.add(27);
    param0.add(30);
    param0.add(71);
    param0.add(6);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("SUM_SEQUENCE_2_22_222," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("SUM_SEQUENCE_2_22_222," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

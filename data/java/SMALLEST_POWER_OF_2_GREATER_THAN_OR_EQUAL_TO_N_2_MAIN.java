public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(60);
    param0.add(20);
    param0.add(33);
    param0.add(34);
    param0.add(68);
    param0.add(79);
    param0.add(20);
    param0.add(41);
    param0.add(36);
    param0.add(17);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N_2," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N_2," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

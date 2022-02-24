public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(68);
    param0.add(91);
    param0.add(99);
    param0.add(79);
    param0.add(61);
    param0.add(48);
    param0.add(89);
    param0.add(20);
    param0.add(83);
    param0.add(1);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_WAYS_BUILD_STREET_GIVEN_CONSTRAINTS," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_WAYS_BUILD_STREET_GIVEN_CONSTRAINTS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

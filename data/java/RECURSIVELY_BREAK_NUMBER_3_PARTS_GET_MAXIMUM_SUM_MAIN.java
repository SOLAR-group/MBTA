public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(39);
    param0.add(79);
    param0.add(7);
    param0.add(76);
    param0.add(48);
    param0.add(18);
    param0.add(58);
    param0.add(17);
    param0.add(36);
    param0.add(5);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("RECURSIVELY_BREAK_NUMBER_3_PARTS_GET_MAXIMUM_SUM," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("RECURSIVELY_BREAK_NUMBER_3_PARTS_GET_MAXIMUM_SUM," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

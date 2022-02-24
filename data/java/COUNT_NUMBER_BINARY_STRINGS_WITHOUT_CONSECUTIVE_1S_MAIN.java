public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(86);
    param0.add(75);
    param0.add(14);
    param0.add(5);
    param0.add(41);
    param0.add(35);
    param0.add(30);
    param0.add(89);
    param0.add(84);
    param0.add(53);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_NUMBER_BINARY_STRINGS_WITHOUT_CONSECUTIVE_1S," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_NUMBER_BINARY_STRINGS_WITHOUT_CONSECUTIVE_1S," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(15);
    param0.add(36);
    param0.add(39);
    param0.add(43);
    param0.add(75);
    param0.add(49);
    param0.add(56);
    param0.add(14);
    param0.add(62);
    param0.add(97);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("SQUARED_TRIANGULAR_NUMBER_SUM_CUBES," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("SQUARED_TRIANGULAR_NUMBER_SUM_CUBES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

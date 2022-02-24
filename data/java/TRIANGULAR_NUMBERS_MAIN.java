public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(97);
    param0.add(97);
    param0.add(32);
    param0.add(40);
    param0.add(18);
    param0.add(14);
    param0.add(90);
    param0.add(39);
    param0.add(1);
    param0.add(57);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("TRIANGULAR_NUMBERS," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("TRIANGULAR_NUMBERS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

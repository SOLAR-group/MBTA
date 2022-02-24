public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(54);
    param0.add(42);
    param0.add(63);
    param0.add(19);
    param0.add(41);
    param0.add(7);
    param0.add(39);
    param0.add(11);
    param0.add(96);
    param0.add(15);
    List<Integer> param1 = new ArrayList<>();
    param1.add(83);
    param1.add(56);
    param1.add(12);
    param1.add(76);
    param1.add(50);
    param1.add(26);
    param1.add(42);
    param1.add(64);
    param1.add(81);
    param1.add(54);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FIND_HARMONIC_MEAN_USING_ARITHMETIC_MEAN_GEOMETRIC_MEAN," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FIND_HARMONIC_MEAN_USING_ARITHMETIC_MEAN_GEOMETRIC_MEAN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

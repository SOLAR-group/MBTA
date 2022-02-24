public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(52);
    param0.add(36);
    param0.add(12);
    param0.add(69);
    param0.add(45);
    param0.add(7);
    param0.add(45);
    param0.add(62);
    param0.add(96);
    param0.add(89);
    List<Integer> param1 = new ArrayList<>();
    param1.add(29);
    param1.add(94);
    param1.add(6);
    param1.add(7);
    param1.add(11);
    param1.add(51);
    param1.add(55);
    param1.add(86);
    param1.add(63);
    param1.add(12);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("STEINS_ALGORITHM_FOR_FINDING_GCD_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("STEINS_ALGORITHM_FOR_FINDING_GCD_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

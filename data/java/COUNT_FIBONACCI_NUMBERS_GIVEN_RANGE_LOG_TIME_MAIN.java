public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(76);
    param0.add(96);
    param0.add(19);
    param0.add(36);
    param0.add(60);
    param0.add(20);
    param0.add(76);
    param0.add(63);
    param0.add(2);
    param0.add(41);
    List<Integer> param1 = new ArrayList<>();
    param1.add(43);
    param1.add(52);
    param1.add(79);
    param1.add(2);
    param1.add(11);
    param1.add(15);
    param1.add(4);
    param1.add(93);
    param1.add(25);
    param1.add(39);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_FIBONACCI_NUMBERS_GIVEN_RANGE_LOG_TIME," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_FIBONACCI_NUMBERS_GIVEN_RANGE_LOG_TIME," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

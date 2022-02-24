public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(99L);
    param0.add(11L);
    param0.add(51L);
    param0.add(49L);
    param0.add(9L);
    param0.add(90L);
    param0.add(19L);
    param0.add(17L);
    param0.add(54L);
    param0.add(5L);
    List<Long> param1 = new ArrayList<>();
    param1.add(75L);
    param1.add(4L);
    param1.add(37L);
    param1.add(51L);
    param1.add(34L);
    param1.add(85L);
    param1.add(96L);
    param1.add(96L);
    param1.add(3L);
    param1.add(69L);
    List<Long> param2 = new ArrayList<>();
    param2.add(40L);
    param2.add(41L);
    param2.add(23L);
    param2.add(88L);
    param2.add(30L);
    param2.add(55L);
    param2.add(41L);
    param2.add(37L);
    param2.add(51L);
    param2.add(60L);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("HOW_TO_AVOID_OVERFLOW_IN_MODULAR_MULTIPLICATION," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("HOW_TO_AVOID_OVERFLOW_IN_MODULAR_MULTIPLICATION," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

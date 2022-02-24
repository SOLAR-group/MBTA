public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(8);
    param0.add(96);
    param0.add(96);
    param0.add(96);
    param0.add(12);
    param0.add(95);
    param0.add(72);
    param0.add(81);
    param0.add(42);
    param0.add(13);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

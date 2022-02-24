public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(91);
    param0.add(99);
    param0.add(11);
    param0.add(23);
    param0.add(12);
    param0.add(1);
    param0.add(18);
    param0.add(14);
    param0.add(13);
    param0.add(36);
    List<Integer> param1 = new ArrayList<>();
    param1.add(29);
    param1.add(55);
    param1.add(56);
    param1.add(56);
    param1.add(97);
    param1.add(64);
    param1.add(5);
    param1.add(37);
    param1.add(55);
    param1.add(99);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("NUMBER_DAYS_TANK_WILL_BECOME_EMPTY," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("NUMBER_DAYS_TANK_WILL_BECOME_EMPTY," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

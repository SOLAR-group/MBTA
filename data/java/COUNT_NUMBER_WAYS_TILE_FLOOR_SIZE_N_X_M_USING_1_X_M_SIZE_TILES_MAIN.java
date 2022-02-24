public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(93);
    param0.add(17);
    param0.add(38);
    param0.add(33);
    param0.add(78);
    param0.add(40);
    param0.add(95);
    param0.add(12);
    param0.add(69);
    param0.add(78);
    List<Integer> param1 = new ArrayList<>();
    param1.add(54);
    param1.add(4);
    param1.add(39);
    param1.add(64);
    param1.add(35);
    param1.add(61);
    param1.add(6);
    param1.add(8);
    param1.add(60);
    param1.add(21);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_NUMBER_WAYS_TILE_FLOOR_SIZE_N_X_M_USING_1_X_M_SIZE_TILES," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_NUMBER_WAYS_TILE_FLOOR_SIZE_N_X_M_USING_1_X_M_SIZE_TILES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,6,7,8,12,13,14,15,18,18,19,19,26,26,32,32,33,34,34,36,41,43,47,47,51,51,52,53,55,56,57,60,61,71,74,75,76,77,79,87,87,87,90,95,98,99});
    param0.add(new int[]{-64,-72,6,-62,54,14,28,60,-96,14,-32,-2,80,8,-56,68,86,64,86,-12,82});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{99,7,14,50,94,24,79,13,19,29,22,2,77,36,38,18,51,15,99,52,17,77,22,54});
    param0.add(new int[]{-96,-92,-86,-84,-84,-80,-70,-70,-68,-64,-64,-48,-46,-24,-22,-20,-8,-8,0,0,4,8,8,22,28,36,46,50,52,54,60,62,66,70,80,84,86,94,96,96});
    param0.add(new int[]{1,0,1,0,1,1,0,0,1,1,0,1,0,0,0,1,1,0,0,1,1});
    param0.add(new int[]{98});
    param0.add(new int[]{-88,-24,8,20,-46,60,24,26,98,82,-30,16,22,-28,84,12,34,14,-18,-38,-94,-24,6,4,-52,-48,84});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{6,30,47,97,20,16,68,34,1,77,48,8,22,68});
    List<Integer> param1 = new ArrayList<>();
    param1.add(37);
    param1.add(12);
    param1.add(27);
    param1.add(15);
    param1.add(25);
    param1.add(12);
    param1.add(0);
    param1.add(21);
    param1.add(21);
    param1.add(8);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MAXIMUM_AREA_RECTANGLE_PICKING_FOUR_SIDES_ARRAY_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MAXIMUM_AREA_RECTANGLE_PICKING_FOUR_SIDES_ARRAY_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

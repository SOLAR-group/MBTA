public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer [ ]> param0 = new ArrayList<>();
    param0.add(new Integer[]{1,5,6,8,9,11,12,14,16,17,24,25,36,40,44,47,49,51,51,52,67,68,72,74,81,82,83,84,92,95,95,96,99});
    param0.add(new Integer[]{-54,-82,-92,-32});
    param0.add(new Integer[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1});
    param0.add(new Integer[]{16,62,17,15,26,45,2,17,65,94,96,30,68,44,96,60,99});
    param0.add(new Integer[]{-88,-82,-78,-52,-50,-42,-34,-28,16,46,54,56,66,66,74,82,82,94,98});
    param0.add(new Integer[]{0,1,0,0,1,0,0,1,0,1,0,0,1,0,1,0,0,1,0,1,0,1,1,1,1,0});
    param0.add(new Integer[]{1,6,8,8,8,10,13,14,14,23,24,25,27,28,29,30,33,38,43,44,49,52,56,58,62,63,64,65,65,68,75,85,85,87,93,96,97});
    param0.add(new Integer[]{-90,-56,16,32,78,-20,76,-90,-68,-70,54,50,60,-64,78,-6,-92,6,16,70});
    param0.add(new Integer[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new Integer[]{55,51,90,10,14,5,57,22,75,29,7,18,31,43,84,35,71,94,4,51,94,30,94,53,82});
    List<Integer> param1 = new ArrayList<>();
    param1.add(27);
    param1.add(2);
    param1.add(15);
    param1.add(8);
    param1.add(15);
    param1.add(18);
    param1.add(20);
    param1.add(19);
    param1.add(30);
    param1.add(22);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MAXIMUM_AREA_RECTANGLE_PICKING_FOUR_SIDES_ARRAY," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MAXIMUM_AREA_RECTANGLE_PICKING_FOUR_SIDES_ARRAY," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,4,12,16,37,44,47,51,55,57,57,62,62,62,64,69,69,70,72,81,81,88,89,97});
    param0.add(new int[]{-86,0,14,-16,-12,-72,62,-34,-72,30,84,-60,84,-64,50,74,18,-82,-64,-64,-74,-56,86,84,-32,-10,20,4,8,96,82,26,42});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{48,66,83,12,77,98,18,33,21,16,28,24,46,43});
    param0.add(new int[]{-92,-58,-36,-28,-6,2,4,26,48,58,60,62,62,98});
    param0.add(new int[]{1,0,0,0,0,1});
    param0.add(new int[]{22,38,41,41,42,51,54,58,68,76,80,85});
    param0.add(new int[]{84,-38,52,-72,-24,82,54,74,0});
    param0.add(new int[]{0,1,1});
    param0.add(new int[]{63,31,14,19,77,64,62,23,22,19,39,9,79,1,87,29,58,3,3,39,1,39,35,64,64});
    List<Integer> param1 = new ArrayList<>();
    param1.add(15);
    param1.add(18);
    param1.add(31);
    param1.add(13);
    param1.add(10);
    param1.add(4);
    param1.add(9);
    param1.add(8);
    param1.add(2);
    param1.add(13);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CHECK_POSSIBLE_SORT_ARRAY_CONDITIONAL_SWAPPING_ADJACENT_ALLOWED," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CHECK_POSSIBLE_SORT_ARRAY_CONDITIONAL_SWAPPING_ADJACENT_ALLOWED," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

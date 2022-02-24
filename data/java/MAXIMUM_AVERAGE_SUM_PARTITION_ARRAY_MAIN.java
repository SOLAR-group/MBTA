public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,11,14,27,32,37,39,49,52,53,57,62,67,67,68,69,76,77,78,81,85,85,87,91,91,91,99,99,99});
    param0.add(new int[]{80,12,32,44,24,82,-40,42,26,36,58,52,-34,44,12,-18,-72,52,2,-8,22,-18,98,-60,62,92,-46,20,20,-46,52,94,0,-28,-22,80,26,-92,-50,48,-80});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{32,16,67,53,99,56,80,92,84,21,36,46,94,31,63,67,59,88,41,17,74,47,95,12,27,99,32,4,82,31,65,40,93,72,23,33,93,9,62,47});
    param0.add(new int[]{-92,-86,-80,-78,-72,-70,-70,-68,-66,-62,-60,-54,-54,-52,-52,-40,-36,-32,-28,-26,-22,-22,-20,-16,-16,-8,0,6,8,10,14,18,20,42,46,52,60,66,68,70,74,86,88,88,92,94,98});
    param0.add(new int[]{1,0,0,0,1,0,1,1,0,1,0,1,1,1,1,0,1,0,0});
    param0.add(new int[]{1,1,3,3,6,7,10,11,12,13,16,16,22,23,24,27,28,30,30,30,31,33,35,35,39,40,41,52,52,58,59,60,61,61,66,66,71,73,74,75,75,76,80,83,85,95,96,97,97});
    param0.add(new int[]{28,-52,48,96,54,94,60,18});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{26,80,12,87,90,98,46,91,38,46,20,64,53,4,60,87,44,88,22,30});
    List<Integer> param1 = new ArrayList<>();
    param1.add(24);
    param1.add(26);
    param1.add(15);
    param1.add(36);
    param1.add(36);
    param1.add(16);
    param1.add(34);
    param1.add(7);
    param1.add(31);
    param1.add(19);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MAXIMUM_AVERAGE_SUM_PARTITION_ARRAY," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MAXIMUM_AVERAGE_SUM_PARTITION_ARRAY," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

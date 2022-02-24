public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,8,12,19,23,23,26,39,54,56,57,57,73,78,83,83,89,91});
    param0.add(new int[]{62,-34,10,-28,-42,-12,4,20,-20,-84,-76,-16,-44,26,-78,-40,50,-10,-56,76,-88,24,64,10,64,-8,-68,-42,26,24,62,36,-68,8,-68,-2,8,38,-18});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{23,14,44,29,93,56,22,29,97,71,43,72,74,8,92,40,18,34,78,79,93,63,79,44,35,72,88,83,40,89,66,66,54,56,44,62,72,94,79,79,24,55,72,37,27,55,16,58,83});
    param0.add(new int[]{-96,-94,-90,-90,-86,-82,-80,-80,-58,-48,-40,-32,-32,-20,-20,-20,-12,-12,-6,-6,-2,0,4,16,16,16,42,48,58,64,68,76,76,76,78,80,82,88,88,88,92,94,96,98});
    param0.add(new int[]{1,1,1,1,0,0,0,1,1,0,0,1,0,0,1,1,0,0,0,0,1,1,0,0,1,1,1,0,1,0,0,0,1,1,1,0,0,1,1,1,1});
    param0.add(new int[]{3,4,4,8,10,10,11,15,19,19,20,24,25,25,27,30,41,43,44,45,47,55,59,59,61,63,63,67,67,69,72,73,75,77,77,78,81,81,83,84,92,94,99});
    param0.add(new int[]{94,-86,94,54,-52,86,68,64,98,54,-14,-60,-60,-92,80,-16,28,16,-74,68,32,-54,58,-16,-2,-52,-92,-36,96,-18,14,76,16});
    param0.add(new int[]{0,0,0,0,1,1,1,1});
    param0.add(new int[]{10,28,63,2,78,12,51,82,89,65,99});
    List<Integer> param1 = new ArrayList<>();
    param1.add(15);
    param1.add(20);
    param1.add(18);
    param1.add(25);
    param1.add(27);
    param1.add(34);
    param1.add(31);
    param1.add(26);
    param1.add(7);
    param1.add(8);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("SUM_FAI_AJ_PAIRS_ARRAY_N_INTEGERS," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("SUM_FAI_AJ_PAIRS_ARRAY_N_INTEGERS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

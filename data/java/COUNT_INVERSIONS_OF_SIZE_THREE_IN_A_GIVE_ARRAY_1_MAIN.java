public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,75,89});
    param0.add(new int[]{84,-66,-52,34,-28,-6,20,22,-78,-26,14,24,-92,-18,32,-94,-64,-38,56,4,-10,58,-66,-58,-10,-8,-62,-60,-26});
    param0.add(new int[]{0,0,0,1,1,1,1,1});
    param0.add(new int[]{18,7,43,57,94,37,38,41,59,64,97,29,51,37,64,91,42,83,13,22,68});
    param0.add(new int[]{-94,-86,-84,-84,-82,-66,-62,-58,-52,-48,-44,-40,-38,-32,-22,-22,-22,-14,-8,-6,-6,0,2,20,20,26,32,32,52,56,66,74,76,80,80,86,88,94});
    param0.add(new int[]{0,1,1,0,0,0,0,0,1,0,0});
    param0.add(new int[]{4,8,15,19,24,31,33,36,38,45,45,52,54,65,73,75,83,84,90,92,93});
    param0.add(new int[]{80,-30,-44,76,-96,2,22,-30,36,-6,88,-60,-90,-52,78,90,-52});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{74,71,28,45,14,31,17,10,82,27,45,73,93,87,57,58});
    List<Integer> param1 = new ArrayList<>();
    param1.add(1);
    param1.add(26);
    param1.add(7);
    param1.add(17);
    param1.add(34);
    param1.add(9);
    param1.add(19);
    param1.add(10);
    param1.add(7);
    param1.add(10);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_INVERSIONS_OF_SIZE_THREE_IN_A_GIVE_ARRAY_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_INVERSIONS_OF_SIZE_THREE_IN_A_GIVE_ARRAY_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,8,10,15,18,19,20,20,21,22,26,30,32,34,43,45,50,50,51,52,53,56,57,58,62,63,65,82,86,91,91,92,92,93,97});
    param0.add(new int[]{30,-34,86,-30,-26,2,90,8,26,-8,-8,0,-86,68,22,72,-76,48,-24,90,-22,-58,-54,90,-12,-12,88,72,-58,68,84,22,60,66,-52,-38,-90,62,30,-26,88,-36,92,32,-32,-42,-90,-40,-10});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{20,68,40,19,74,69});
    param0.add(new int[]{-98,-94,-94,-94,-90,-88,-88,-78,-74,-70,-68,-66,-64,-62,-54,-50,-40,-40,-40,-40,-28,-22,-22,-18,-14,-12,0,6,6,8,12,20,22,26,28,36,42,44,48,52,56,60,68,84});
    param0.add(new int[]{1,1,0});
    param0.add(new int[]{12,22,38,76,80,86});
    param0.add(new int[]{-36,-10,-26,34,-50,66,-2,-14,-62,60,-48,94,-70,6,-60,-90,28,-4,-20,-52,40,-76,-92,-14,54,4,-58,38,-74,-96,-88,86,-54,98,48,68,78,-28,-80,-46});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{69,99,25,52,41,51,7,33,42,91,85,57,91,89,86,11,70,67,30,92,81,23,51,98,85,5,50,44});
    List<Integer> param1 = new ArrayList<>();
    param1.add(17);
    param1.add(41);
    param1.add(26);
    param1.add(4);
    param1.add(28);
    param1.add(2);
    param1.add(4);
    param1.add(26);
    param1.add(17);
    param1.add(21);
    List<Integer> param2 = new ArrayList<>();
    param2.add(30);
    param2.add(10);
    param2.add(1);
    param2.add(88);
    param2.add(94);
    param2.add(60);
    param2.add(3);
    param2.add(37);
    param2.add(20);
    param2.add(27);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("GIVEN_A_SORTED_AND_ROTATED_ARRAY_FIND_IF_THERE_IS_A_PAIR_WITH_A_GIVEN_SUM," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("GIVEN_A_SORTED_AND_ROTATED_ARRAY_FIND_IF_THERE_IS_A_PAIR_WITH_A_GIVEN_SUM," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

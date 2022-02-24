public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{14,17,27,28,36,38,40,49,51,57,58,61,62,71,91,94,99});
    param0.add(new int[]{-48,54,98,68,24,-46,4,-28,-34,40});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{94,74,27,59,3,71,67,91,91,87,1,79,42,33,85,37,76,86,80,84,62,8,31,54,17,48,4,12,88,63,12,51,36,20,73,48,41,88,21,98,57,3,54});
    param0.add(new int[]{-96,-94,-90,-88,-86,-82,-76,-74,-68,-54,-54,-50,-50,-46,-46,-40,-36,-34,-34,-32,-30,-26,-26,-20,-16,-6,-4,2,10,14,22,26,26,28,28,30,30,36,54,64,68,74,78,80,84,90,92,94});
    param0.add(new int[]{0,0,0,0,1,0,1,0,0,1,0,1,0,1,0,1,1,0,1,1,0,1,0,1,1,0,0,0,0,0,1,0,0,1,1,0,0,1,1,1,0,1,1,0,0,1,0,0});
    param0.add(new int[]{6,12,18,34,37,37,37,40,45,60,64,66,73,78,79,80,92});
    param0.add(new int[]{64,-18,-22,96,-92,6,-46,-54,76,0,46,74,-8,22,-46,-44,-94,-88,-52,-54,2,98,-22,46,26,2,-64,-84,20,22,12,-32,-16,-96,46,-4,-8,46,-64,-58,58,92,0,-26,-58,82});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{57,34,3,67,21,69,31,49,7,70,27,53,94,23,74,24,44,53,78,46,6,29,5,41,38,22,40,38,40,59,9});
    List<Integer> param1 = new ArrayList<>();
    param1.add(14);
    param1.add(8);
    param1.add(17);
    param1.add(24);
    param1.add(36);
    param1.add(34);
    param1.add(11);
    param1.add(24);
    param1.add(33);
    param1.add(16);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("LONGEST_INCREASING_SUBSEQUENCE_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("LONGEST_INCREASING_SUBSEQUENCE_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

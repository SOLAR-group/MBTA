public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,3,5,7,8,29,29,44,47,52,60,65,73,83,87,92,92,95});
    param0.add(new int[]{44,-98,-10,14,-6,-46,6,-74,-4,36,10,-2,30,28,96,-84,-36,-76,64,-74,-20,94,-4,14,78,52,-56,98,-68,-76,-10,20,88,-98,96,80,96,-32,-40,-30,82});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{58,21,97,78,78,57,29,33,57,81,66,32,11,82,28,72,46,67,42,15,60,45,16,37});
    param0.add(new int[]{-92,-90,-88,-84,-68,-66,-62,-58,-52,-44,-22,-16,-4,-4,2,12,14,14,24,26,44,56,80,90,92,94,98});
    param0.add(new int[]{1,1,1,1,1,1,1,1,0,0,0});
    param0.add(new int[]{3,4,8,12,13,14,17,19,23,24,28,29,30,35,35,38,44,47,47,53,55,56,56,58,66,67,70,71,72,73,74,75,77,78,82,84,87,87,87,88,88,93,94,96});
    param0.add(new int[]{20,-58,94,-70,18,16,-46,38,-44,-92,-20,-70,-30,50});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{90,77,82,38,96,62,66,4,93,30,75,22,26,61,40,11,38,55,88,24,66,47,40,71,21,5,18,31,26,56,19,47,71,34});
    List<Integer> param1 = new ArrayList<>();
    param1.add(10);
    param1.add(34);
    param1.add(16);
    param1.add(14);
    param1.add(15);
    param1.add(5);
    param1.add(26);
    param1.add(11);
    param1.add(19);
    param1.add(28);
    List<Integer> param2 = new ArrayList<>();
    param2.add(12);
    param2.add(37);
    param2.add(15);
    param2.add(20);
    param2.add(25);
    param2.add(5);
    param2.add(25);
    param2.add(7);
    param2.add(23);
    param2.add(32);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("K_TH_LARGEST_SUM_CONTIGUOUS_SUBARRAY," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("K_TH_LARGEST_SUM_CONTIGUOUS_SUBARRAY," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

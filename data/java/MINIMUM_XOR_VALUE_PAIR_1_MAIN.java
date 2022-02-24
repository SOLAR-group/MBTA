public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{8,11,12,27,32,32,36,56,57,66,68,70,74,78,82,83,96});
    param0.add(new int[]{40,48,66,4,-60,42,-8,38});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{98,6,82,95,87,20,11,63,78,70,37,12,57,67,10,49,38,28,86,7,61,50,32,68,91,66,57,29,2,64,65,15,16,4,7,76,44,52,81,89,3,36,57,95,48,24});
    param0.add(new int[]{-88,-84,-76,-58,-40,-38,-28,-24,-20,-14,-12,16,20,28,28,30,40,44,56,58,60,92,92});
    param0.add(new int[]{0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,1,1,1,0,1,1,0,1,0});
    param0.add(new int[]{6,6,19,31,41,45,49,56,78,96,98});
    param0.add(new int[]{62,-90,22,-84,-4});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{83,13,43,99,34,74,56,20,93,65,92,58,91,72,37,10,39,7,29,69,42,28});
    List<Integer> param1 = new ArrayList<>();
    param1.add(10);
    param1.add(7);
    param1.add(19);
    param1.add(36);
    param1.add(13);
    param1.add(20);
    param1.add(6);
    param1.add(3);
    param1.add(21);
    param1.add(14);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MINIMUM_XOR_VALUE_PAIR_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MINIMUM_XOR_VALUE_PAIR_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

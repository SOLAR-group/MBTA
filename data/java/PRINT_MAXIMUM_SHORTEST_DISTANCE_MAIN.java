public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,27,66,89,96,96});
    param0.add(new int[]{84,-38,-56,-20,-98,-40,-16,22,20,98,-56,-32,-44,30,-58,26,-44,-32,50,46,92});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{20,71,66,58,74,2,63,13,1,36,28,83,24,20,85,30,59,56,8,97,58,28,28,42});
    param0.add(new int[]{-94,-88,-86,-68,-66,-64,-28,-12,4,18,22,28,32,34,34,40,44,46,60,68,72,78,80,84,88,96});
    param0.add(new int[]{0,0,0,0,0,1,1,1,1,0,0,0,1,1,1});
    param0.add(new int[]{8,13,54,59,61,69,89,90,92});
    param0.add(new int[]{-58,50,-74,-8,-50,90,90,-2,-22,8,-76,16,4,56,94,36,28,-42,80,-88,88,52,74,40,12,-72,-50,50,88,-54,32,-24,-48,-66,-86,40,-6,14,10,-88,56,80,-34});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{2,60,66,39,18,60,37,75,3,64,24,16,72,95,96,44,23,58,58,33,24,96});
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
    param1.add(13);
    param1.add(23);
    param1.add(23);
    param1.add(16);
    param1.add(8);
    param1.add(4);
    param1.add(27);
    param1.add(9);
    param1.add(21);
    List<Integer> param2 = new ArrayList<>();
    param2.add(4);
    param2.add(11);
    param2.add(13);
    param2.add(17);
    param2.add(15);
    param2.add(13);
    param2.add(8);
    param2.add(42);
    param2.add(12);
    param2.add(17);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PRINT_MAXIMUM_SHORTEST_DISTANCE," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PRINT_MAXIMUM_SHORTEST_DISTANCE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

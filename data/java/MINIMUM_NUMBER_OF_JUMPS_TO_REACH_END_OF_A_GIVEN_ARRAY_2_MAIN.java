public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,6,7,14,22,32,42,42,43,48,54,57,59,69,84,92,98});
    param0.add(new int[]{98,-66,-70,-64,-88,-76,-90,16,58,68,-10,-42,-28,10,72,68,-30,60,92,-56,80,-4,-82,30,58,98,-56,98,-14,-38,-20,-74,-46,-22,78,36,-54,-64,80,-10,-26,82,96,-72,-36,-36,-32,-88,0});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{64,25,63,54,7,43,79,27,34,13,84,80,34,48,5,56,67,2});
    param0.add(new int[]{2,28,68});
    param0.add(new int[]{1,0,0,0,0,1,1,1,1,0,1,0,0});
    param0.add(new int[]{1,1,9,16,17,18,19,20,21,22,25,28,29,29,36,37,40,40,42,48,49,49,55,63,65,66,69,70,72,73,76,77,77,79,79,81,81,93,95,99});
    param0.add(new int[]{38,-42,-8,98,-90,38,88,-8,70,-28,-50,-22,28,24,88,-26,58,48,6,0,68,-6,8,54,-2,46,-44,96,-82,-14,-48,-18,-16,-48,-44,-16,-58,-64});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{98,46,12,55,57,11,25,64,92,35,90,72,95,30,75,67,64,12,31,84,70,96,71,80,62,34,70,10,54});
    List<Integer> param1 = new ArrayList<>();
    param1.add(11);
    param1.add(26);
    param1.add(41);
    param1.add(10);
    param1.add(2);
    param1.add(11);
    param1.add(24);
    param1.add(34);
    param1.add(14);
    param1.add(25);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MINIMUM_NUMBER_OF_JUMPS_TO_REACH_END_OF_A_GIVEN_ARRAY_2," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MINIMUM_NUMBER_OF_JUMPS_TO_REACH_END_OF_A_GIVEN_ARRAY_2," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

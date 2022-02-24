public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer [ ]> param0 = new ArrayList<>();
    param0.add(new Integer[]{1,9,9,16,18,20,22,22,23,25,25,26,28,32,33,33,33,34,37,40,44,46,46,52,53,56,58,58,59,60,61,67,67,69,70,70,73,75,77,83,87,87,87,90,90,93,97,98});
    param0.add(new Integer[]{-52,66,66,-4,-74,78,52,-72});
    param0.add(new Integer[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new Integer[]{58,78,48,44,63,37,89,76,66,83,52,97,19,28,67,38,54,77,2,96,28,87});
    param0.add(new Integer[]{-84,-78,-76,-72,-68,-62,-62,-60,-58,-44,-34,-10,-8,-4,-2,-2,14,16,20,26,26,32,70,78,86,90,96});
    param0.add(new Integer[]{0,1,1,0,0,1,1,0,1,0,1,0,1,1,1,1,1,0,0,1,1,1,1,0,0,0,1,1,0});
    param0.add(new Integer[]{30,75});
    param0.add(new Integer[]{70,78,-60,-10,-8,46,38,60,-54,-68,16,10,36,-10,38,-96,-52,-82,-56,22,-56,0,96,-60,24,70,40,62,-20,-36,74,32,44,14,-18,50,58});
    param0.add(new Integer[]{0,0,0,1});
    param0.add(new Integer[]{81,40,29,74,13,67,10,25,24,81,90});
    List<Integer [ ]> param1 = new ArrayList<>();
    param1.add(new Integer[]{2,3,9,10,13,16,17,19,20,23,25,27,29,30,30,35,37,39,39,45,47,50,55,55,55,56,59,60,62,63,67,70,70,71,72,73,73,74,77,86,87,88,91,92,95,96,97,99});
    param1.add(new Integer[]{-40,30,-34,-76,84,88,-78,72});
    param1.add(new Integer[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param1.add(new Integer[]{37,36,26,5,83,75,33,33,72,63,91,94,75,92,9,19,79,29,40,47,63,36});
    param1.add(new Integer[]{-98,-98,-86,-82,-76,-62,-60,-48,-32,-32,-24,-18,-10,-4,0,16,16,26,36,42,48,50,64,66,78,92,98});
    param1.add(new Integer[]{1,0,1,1,1,0,1,1,1,0,1,0,1,1,0,0,0,1,1,1,1,0,1,1,1,0,0,1,0});
    param1.add(new Integer[]{10,39});
    param1.add(new Integer[]{64,-42,-50,-76,46,32,-66,86,-6,46,94,70,-62,90,78,4,6,-20,92,-18,-34,-96,92,-24,-90,-94,62,40,-14,-28,80,-86,-86,-56,40,-92,-22});
    param1.add(new Integer[]{0,1,1,1});
    param1.add(new Integer[]{51,45,23,7,53,14,49,58,25,75,74});
    List<Integer> param2 = new ArrayList<>();
    param2.add(25);
    param2.add(6);
    param2.add(15);
    param2.add(13);
    param2.add(15);
    param2.add(25);
    param2.add(1);
    param2.add(19);
    param2.add(2);
    param2.add(8);
    List<Integer> param3 = new ArrayList<>();
    param3.add(27);
    param3.add(7);
    param3.add(19);
    param3.add(14);
    param3.add(24);
    param3.add(26);
    param3.add(1);
    param3.add(19);
    param3.add(2);
    param3.add(10);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MINIMUM_COST_CUT_BOARD_SQUARES," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MINIMUM_COST_CUT_BOARD_SQUARES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

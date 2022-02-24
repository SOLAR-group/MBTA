public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{10,18,22,22,22,29,30,32,33,34,37,39,40,41,44,47,49,50,50,51,53,67,69,70,71,71,73,75,78,80,81,82,91,91,93,97,97,99});
    param0.add(new int[]{-42,62,6,98,38,-4,-38,72,42,4,-22,-94,78,-90,14});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{89,92,96,71,24,27,18,19,41,1,45,8});
    param0.add(new int[]{-98,-94,-92,-90,-82,-80,-76,-76,-72,-62,-60,-58,-56,-52,-42,-36,-32,-32,-24,-22,-20,-10,-10,-10,-8,-2,-2,0,2,4,6,6,8,10,14,18,22,26,30,46,46,62,68,74,78,82,86,86});
    param0.add(new int[]{1,0,0,0,0,1,0,1,0,0,1,0,0,0,0,1,1,1,1,1,1,0,0,0,0,1,0,1,1,1,1,1,0,1,0,1,1,1,0,0,0,0,1,0,1,0,0,0,1});
    param0.add(new int[]{4,8,10,10,11,17,18,25,32,33,34,37,40,41,44,47,47,52,63,77,85,87,89,89,91,95,96,98});
    param0.add(new int[]{-86,52,-48,70,10,-94,16,14,38,62});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{95,32,87,37,86,71,30,88,96,52,88,92,79,86,19,5,74,67});
    List<Integer> param1 = new ArrayList<>();
    param1.add(35);
    param1.add(10);
    param1.add(23);
    param1.add(7);
    param1.add(40);
    param1.add(41);
    param1.add(23);
    param1.add(9);
    param1.add(30);
    param1.add(13);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("LARGEST_SUBSEQUENCE_GCD_GREATER_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("LARGEST_SUBSEQUENCE_GCD_GREATER_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

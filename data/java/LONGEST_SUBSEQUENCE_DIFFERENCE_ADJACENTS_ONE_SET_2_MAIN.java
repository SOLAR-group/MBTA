public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{20,48,58});
    param0.add(new int[]{-36,94,-20,-90,-80,88,46,-8,-36,22,70,-16,-48,-54,-82,38,10,-84,12,10,-14,50,12,-28,-64,-38,-84,-62,-56,32,-78,34,-34,48});
    param0.add(new int[]{0,0,0});
    param0.add(new int[]{50,28,14,52,92,30,30,27,66,77,39,42,28,84,63,55,18,34,57,45,81,38,23,31,9,35,25,39,30,5,28,7,42,42});
    param0.add(new int[]{-96,-70,-64,-60,-56,-44,-40,-32,-30,-22,-10,14,26,28,28,38,58,78,80});
    param0.add(new int[]{1,0,0,0,1,0,0,1,0,1});
    param0.add(new int[]{8,19,30,37,44,46,49,50,51,57,65,67,70,70,76,83,91,92});
    param0.add(new int[]{40,62,-6,88,58,66,-40,46,-32,80,22,-30,32,-74,20,-82,-58,-18,30,68,-2,38,-76,-58,22,-22,74});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1});
    param0.add(new int[]{46,6,71,56,21,97,80,67,26,25,79,86,64,84,53,50,29,19,95,58,14,15,63,1,76,64,11,47,9,97,54,27});
    List<Integer> param1 = new ArrayList<>();
    param1.add(2);
    param1.add(29);
    param1.add(1);
    param1.add(22);
    param1.add(11);
    param1.add(8);
    param1.add(13);
    param1.add(20);
    param1.add(12);
    param1.add(17);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("LONGEST_SUBSEQUENCE_DIFFERENCE_ADJACENTS_ONE_SET_2," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("LONGEST_SUBSEQUENCE_DIFFERENCE_ADJACENTS_ONE_SET_2," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

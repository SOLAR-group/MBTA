public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{7,8,9,16,16,27,32,33,35,35,39,39,41,42,44,47,48,50,56,59,66,69,70,73,74,76,78,87,87,89,94,96,96,98,98});
    param0.add(new int[]{40,76,-54,-92,-28,-96,8,60,28,-38,-62,-40,-16,16,52,28,70,-56,-50,46,68,-16,-56,46,42,70,52,-34,86,-32,-50,64,36,54,20,82,84});
    param0.add(new int[]{0,0,0,0,1,1,1});
    param0.add(new int[]{15,19,87,44,15,48,21,85,90,30,88,95,48,92,29,52,46,46,7,23,96,97,43});
    param0.add(new int[]{-98,-96,-94,-94,-94,-80,-80,-78,-64,-62,-62,-46,-42,-38,-36,-36,-34,-32,-20,-18,-16,-12,-8,-4,-4,-2,-2,2,6,12,34,40,42,44,46,46,50,54,58,58,70,72,72,76,78,86});
    param0.add(new int[]{0,0,1,1,0,1,0,1,0,1,1,0,1,0,0,1,0,1,0,1,0,0,0,1,0,0,1});
    param0.add(new int[]{6,7,19,36,44,63,68,72,83});
    param0.add(new int[]{-64,12,56,50,94,6,0,70,-70,46,-84,-64,4,76,28,94,-8,24,76,64,-62,-34});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{71,57,20,8,90,69,15,62,45,14,65,20,48,9});
    List<Integer> param1 = new ArrayList<>();
    param1.add(32);
    param1.add(25);
    param1.add(4);
    param1.add(19);
    param1.add(33);
    param1.add(13);
    param1.add(8);
    param1.add(15);
    param1.add(21);
    param1.add(10);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("LONGEST_INCREASING_ODD_EVEN_SUBSEQUENCE," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("LONGEST_INCREASING_ODD_EVEN_SUBSEQUENCE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

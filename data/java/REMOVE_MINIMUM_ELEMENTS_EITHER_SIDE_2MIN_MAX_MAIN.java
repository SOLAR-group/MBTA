public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{32,50,66,73,76,87});
    param0.add(new int[]{68,74,16,40,6,-44,-36,94,6,-24,-4,-58,-16,24});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{91,22});
    param0.add(new int[]{-84,-80,-78,-76,-58,-54,-52,-48,-42,-42,-40,-38,-34,-32,-28,-24,-6,2,2,4,10,14,16,18,26,26,36,40,50,52,62,64,72,74,84,90,94,96,98});
    param0.add(new int[]{1,0,1,1,1,0,1,1,1,0,1,0,0,1,0,1,1,1,1,0,1});
    param0.add(new int[]{10,19,25,29,32,37,40,43,43,44,46,51,51,54,56,58,63,79,83,86,87,97,97});
    param0.add(new int[]{-48,-28,10,30,78,-72,78,52,-52,-68,56,42,8,-42,16,-56,2,-90,-26,-28,-56,-2,80,-50,98,-64,-96,10,-10,44,98,-48,-88,42,30,24,38,-26,-52,-12,0,34,-82,-80,0,-84,-20});
    param0.add(new int[]{0,0,1,1,1,1,1,1});
    param0.add(new int[]{25,82});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(11);
    param1.add(11);
    param1.add(1);
    param1.add(35);
    param1.add(13);
    param1.add(11);
    param1.add(25);
    param1.add(6);
    param1.add(1);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("REMOVE_MINIMUM_ELEMENTS_EITHER_SIDE_2MIN_MAX," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("REMOVE_MINIMUM_ELEMENTS_EITHER_SIDE_2MIN_MAX," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,8,14,15,17,17,19,21,22,23,29,32,36,37,43,45,46,47,47,53,57,57,70,71,72,76,81,82,90,95,96,98,99});
    param0.add(new int[]{94,-18,50,94,-74,-50,-44,-92,-58,14,-66,-78});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{15,18,64,28});
    param0.add(new int[]{-96,-88,-88,-84,-82,-78,-78,-60,-58,-56,-54,-52,-48,-44,-28,-26,-14,-12,6,10,10,14,14,50,52,54,60,62,62,64,66,70,72,72,78,80,84});
    param0.add(new int[]{0,1,1,0,1,1,1,1});
    param0.add(new int[]{3,10,14,14,15,16,18,20,21,30,31,33,35,39,46,48,59,59,61,77,78,79,81,83,85,92,97,97,99});
    param0.add(new int[]{4,-32,68,-48,54,24,78,98,-70,44,-82,-92,-16,-92,-70,52,-58,-62,-58,32,14,-4,80,-78,-26,-24,-8});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{82,74,53,91,81,88,42,62,38,43,29,60,43,44,19,28,20,1,5,94,18,77,52,38,55,1,10,29,34,91,64,80,81,39,4,47,30,62,58,66,73,52,62,9,36,49});
    List<Integer> param1 = new ArrayList<>();
    param1.add(32);
    param1.add(10);
    param1.add(24);
    param1.add(2);
    param1.add(31);
    param1.add(6);
    param1.add(23);
    param1.add(18);
    param1.add(35);
    param1.add(38);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("MINIMUM_COST_CONNECT_WEIGHTED_NODES_REPRESENTED_ARRAY_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MINIMUM_COST_CONNECT_WEIGHTED_NODES_REPRESENTED_ARRAY_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MINIMUM_COST_CONNECT_WEIGHTED_NODES_REPRESENTED_ARRAY_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

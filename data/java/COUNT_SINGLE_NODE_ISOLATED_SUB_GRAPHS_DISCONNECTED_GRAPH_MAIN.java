public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{18,26,39,43,46,57,63,76,84,88});
    param0.add(new int[]{76,-92,-40,48,84,8,28,64,84,-58,40,48,-8,22,84,-14,-32,-66,84,-74,10,50,96,92,-60,70,0,2,16,-26});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{15,76,11,70,34,54,4,33,20,93,51,9,58,50,23,97,42,28,98,3,21,39,20,11,38});
    param0.add(new int[]{-96,-84,-74,-58,-52,-52,-28,-24,-22,-12,-12,-8,-6,-2,-2,8,10,20,24,32,36,36,46,54,66,88,94});
    param0.add(new int[]{0,1,1,1,1,0,0,0,0,0,0,1,1,0,1,1,0,1,1,1,0,1,1,1,0,1,0,1,0,0,0,1,0,0,0,0,0,0,1,1,0,1,1,1,0,1});
    param0.add(new int[]{1,1,4,9,13,18,18,21,22,32,33,39,41,44,51,55,56,59,60,61,63,68,69,71,72,73,74,74,75,81,83,87,88,92,94,97});
    param0.add(new int[]{10,54,-64,30,-50,-4,14,-96,-22,80,-36,-36,-92,58,28,10,32,-82,-6,-40,0,-46,-68,-18,-16,-38,-22,-68,-82,76,70,-48,10,50,82,98,-22,-74,22,-60,-70,46,84,88,-34,-30,88,26});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{25,39,1,6,86,45,19,76,65,29,9});
    List<Integer> param1 = new ArrayList<>();
    param1.add(8);
    param1.add(15);
    param1.add(31);
    param1.add(12);
    param1.add(20);
    param1.add(24);
    param1.add(22);
    param1.add(35);
    param1.add(41);
    param1.add(7);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("COUNT_SINGLE_NODE_ISOLATED_SUB_GRAPHS_DISCONNECTED_GRAPH," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_SINGLE_NODE_ISOLATED_SUB_GRAPHS_DISCONNECTED_GRAPH," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_SINGLE_NODE_ISOLATED_SUB_GRAPHS_DISCONNECTED_GRAPH," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

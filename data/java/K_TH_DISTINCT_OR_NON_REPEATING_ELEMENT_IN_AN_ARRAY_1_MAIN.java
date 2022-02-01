public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{17,25,27,27,73,91});
    param0.add(new int[]{-86,-74,-88,28,-32,20,-34,32});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{5,11,36,27,6,24,58,44,14,68});
    param0.add(new int[]{-98,-98,-94,-92,-86,-86,-70,-66,-64,-64,-58,-52,-46,-44,-44,-38,-38,-28,-24,-12,-10,-4,-2,2,8,10,12,20,22,26,26,36,42,52,54,60,60,68,82,82,92,98});
    param0.add(new int[]{0,1,0,0,1,1,1,0,0,0,1,1,1,0,0,1,1,1,0,0,0,1,0,0,1,0,1,1,1,1});
    param0.add(new int[]{3,8,9,10,10,13,14,16,18,23,24,25,27,28,30,33,36,39,42,42,44,45,45,48,52,52,55,55,59,59,59,60,61,61,66,66,67,68,71,72,75,76,79,80,94,94});
    param0.add(new int[]{-12,56,-48,52,-96,-84,32,-12,-6,82,70,18,66,-6,-22,-46,-54,18,-14,-32,68,82,-44,-42,10,56,8,-56,24,20,-38,30,-52,-66,82,-64,68,-82,52,-88,-34,-26,94,58,-4,-84,-60});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{1,23,75,84,28,34,15,13,51,69,94,45,38,38});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(5);
    param1.add(33);
    param1.add(7);
    param1.add(27);
    param1.add(27);
    param1.add(44);
    param1.add(37);
    param1.add(22);
    param1.add(13);
    List<Integer> param2 = new ArrayList<>();
    param2.add(3);
    param2.add(6);
    param2.add(32);
    param2.add(5);
    param2.add(27);
    param2.add(20);
    param2.add(26);
    param2.add(46);
    param2.add(21);
    param2.add(12);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("K_TH_DISTINCT_OR_NON_REPEATING_ELEMENT_IN_AN_ARRAY_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("K_TH_DISTINCT_OR_NON_REPEATING_ELEMENT_IN_AN_ARRAY_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("K_TH_DISTINCT_OR_NON_REPEATING_ELEMENT_IN_AN_ARRAY_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
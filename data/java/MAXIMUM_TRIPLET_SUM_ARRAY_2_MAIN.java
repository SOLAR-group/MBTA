public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,7,12,21,22,25,27,28,28,31,32,32,41,45,47,51,53,60,61,61,63,71,74,82,83,85,88,92,96,96});
    param0.add(new int[]{-52,26,74,-62,-76});
    param0.add(new int[]{0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{63,71,15,28,31,84,8,17,24,42,66,95,30});
    param0.add(new int[]{-94,-92,-92,-90,-88,-88,-86,-82,-80,-78,-66,-54,-52,-52,-46,-46,-42,-36,-32,-24,-24,-14,-14,-14,-12,-10,0,6,8,20,24,24,28,38,38,52,54,56,64,74,74,76,82,94,94});
    param0.add(new int[]{0,0,0,1,1,0,1,0,1,1,0,1,0,1,0,0,0,1,0,1,1,1,0,1,0,0,0,0,1,1,0,0,0,0,1,0,1,1,0,1,0,0,0,1,0});
    param0.add(new int[]{15,19,80});
    param0.add(new int[]{4,80,18,74,36,-30,-72,-28,-32,-16,-8,38,78,-48,98,-64,86,-60,-44,84,-98,40,14,30,44,90,-30,-42,24,-28,24,40,-96,98,90,-68,-54,-52,62,34,-98,68,-56,-94,-78,-12,28});
    param0.add(new int[]{0,1,1,1,1,1});
    param0.add(new int[]{2,18,96,7,99,83,3,88,23,77,6,28,55,49,69,55,48,76,43,11,43,44,17,74,27,64,76,77,53,26,73,12,19,62,18,34,13,31,97,96,85,27,30,97,89,25});
    List<Integer> param1 = new ArrayList<>();
    param1.add(28);
    param1.add(2);
    param1.add(11);
    param1.add(6);
    param1.add(31);
    param1.add(30);
    param1.add(2);
    param1.add(41);
    param1.add(3);
    param1.add(41);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("MAXIMUM_TRIPLET_SUM_ARRAY_2_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MAXIMUM_TRIPLET_SUM_ARRAY_2_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MAXIMUM_TRIPLET_SUM_ARRAY_2_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

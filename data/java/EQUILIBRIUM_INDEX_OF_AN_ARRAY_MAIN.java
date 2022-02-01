public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,6,7,8,15,15,19,23,27,28,29,31,37,40,41,42,50,51,57,58,63,63,64,70,71,72,78,83,85,90,90});
    param0.add(new int[]{-68,-92});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{80,74,45,81,62,88,90,54});
    param0.add(new int[]{-92,-84,-84,-66,-64,-50,-50,-48,-46,-44,-36,-36,-30,-24,-22,-16,-6,-2,24,48,54,62,66,74,74,80,82,88,98,98});
    param0.add(new int[]{0,0,1,1,0,0,1,0,1,0,1,1,0,1,0,0,1,1,0,0,1,1,1,1,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,1,1,1});
    param0.add(new int[]{2,6,11,12,14,36,45,49,52,52,58,63,70,73,74,80,82,89,89});
    param0.add(new int[]{16,-58,-14,-58,-36,-70,36,-8,-14,-78,-26,42,16,18,0,-44,32,50,-78,58,78,16,-34,-54,50,0,46,-12,52,-74,78,-82,-26,-72,-86,-14,86,40,-8});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{58,82,79,77,84,79,39,98,53,84,19,9,93,30,6,82,8,43,17,44,62,21,34,86,98,44,81,14,82,54,44,53,36,33,2,68,19,37});
    List<Integer> param1 = new ArrayList<>();
    param1.add(25);
    param1.add(1);
    param1.add(26);
    param1.add(4);
    param1.add(27);
    param1.add(43);
    param1.add(17);
    param1.add(26);
    param1.add(33);
    param1.add(22);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("EQUILIBRIUM_INDEX_OF_AN_ARRAY_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("EQUILIBRIUM_INDEX_OF_AN_ARRAY_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("EQUILIBRIUM_INDEX_OF_AN_ARRAY_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

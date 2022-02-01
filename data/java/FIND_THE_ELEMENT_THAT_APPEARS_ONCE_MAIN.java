public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{7,26,26,48,59,62,66,70,72,75,76,81,97,98});
    param0.add(new int[]{-42,-48,-64,-74,56,-34,20,16,34,-84,86,38,56,-86,30,-74,-96,96,12,10,-46,10,-36,38,34,-46,-20,14,12,62,-54,20,-82,24,96});
    param0.add(new int[]{0,0,1,1});
    param0.add(new int[]{68,91,61,6,32,47,76,69,44,71,29,79,74,33,44,33,45,75,43,82,83,81,95,16,86,33,69,61,73,21,54,17,98,62,14,72,80,31,56,82,14,48,76});
    param0.add(new int[]{-98,-96,-92,-62,-52,-42,-42,-26,4,10,14,38,64,66,72,74,82});
    param0.add(new int[]{0,1,1,1,0,0,0,1,0,1});
    param0.add(new int[]{53,63,63});
    param0.add(new int[]{-96,-38,-26,-46,68,-36,20,-18,-10,52,40,94,-8,-64,82,-22});
    param0.add(new int[]{0,0,0,0,0,1,1});
    param0.add(new int[]{99,46,48,81,27,97,26,50,77,32,45,99,46});
    List<Integer> param1 = new ArrayList<>();
    param1.add(7);
    param1.add(27);
    param1.add(3);
    param1.add(38);
    param1.add(14);
    param1.add(5);
    param1.add(2);
    param1.add(15);
    param1.add(3);
    param1.add(12);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("FIND_THE_ELEMENT_THAT_APPEARS_ONCE_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_THE_ELEMENT_THAT_APPEARS_ONCE_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_THE_ELEMENT_THAT_APPEARS_ONCE_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

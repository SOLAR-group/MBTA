public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{15,18,38,47,75,88});
    param0.add(new int[]{28,-2,62,38,86,-86,56,58,96,6,-28,8,68,-16,-80,-4,98,-92,4,-4,58,-62,46,64});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{19,77,17,91,6,35,22,4,30,23,97,56,78,16,22,23,95,57,43,27,47,44,23,10,3,94,55,22,93,32,89,28,64,22,13,24,38,44,6,1,80});
    param0.add(new int[]{-98,-98,-94,-88,-80,-74,-68,-68,-64,-44,-36,-24,-10,-8,-8,0,4,6,8,8,12,14,16,38,50,52,54,56,66,68,76,88});
    param0.add(new int[]{1,1,0,0,1,0,1,1});
    param0.add(new int[]{7,22,24,30,42,44,49,49,65,70,70,74,74,75,90,95,96});
    param0.add(new int[]{40,-76,-68,-86,-14,82,-20,54,-26,56,-24,-44,44,60,52,-20,80,-24,-90,-30,-2});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{33,92,6,99,83,97,49,97,85,52});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(22);
    param1.add(27);
    param1.add(22);
    param1.add(18);
    param1.add(4);
    param1.add(8);
    param1.add(11);
    param1.add(15);
    param1.add(6);
    List<Integer> param2 = new ArrayList<>();
    param2.add(4);
    param2.add(18);
    param2.add(23);
    param2.add(29);
    param2.add(19);
    param2.add(5);
    param2.add(13);
    param2.add(18);
    param2.add(17);
    param2.add(7);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("FIND_A_TRIPLET_THAT_SUM_TO_A_GIVEN_VALUE_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_A_TRIPLET_THAT_SUM_TO_A_GIVEN_VALUE_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_A_TRIPLET_THAT_SUM_TO_A_GIVEN_VALUE_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

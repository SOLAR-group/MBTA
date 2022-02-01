public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,4,5,5,11,11,12,14,16,20,23,23,25,27,29,33,33,35,37,39,39,44,44,45,47,51,51,53,55,65,73,73,75,78,79,79,80,82,86,86,87,87,88,90,91,91,94});
    param0.add(new int[]{-38,20,-94,-68,-96,36,48,32,44,-56,72,-28,-6,22,-54,-46,58,-60,-80,28,-34,60,-12,-26,-32,28,72,-50,66,-36,28,30,10,14,0,-78,94,-24,-42,-60,66,-12,92,54,-34,-58,56});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{73,69,12,82,65,55,93,93,88,52,33,94,62,75,61,81,48,43,29,8,28,60,60,58,54,44,25,36,46,88,54,36,83,46,34,44,71,90,68,75,42});
    param0.add(new int[]{-98,-94,-88,-80,-74,-70,-70,-56,-50,-48,-40,-24,-22,-14,0,2,2,6,12,22,30,32,32,40,48,52,52,58,64,66,66,68,70,72,74,76,78,94,98,98});
    param0.add(new int[]{1,0,1,0,1,1,1,0,0,1,1,1,1,0,1,1,1,0,1,1});
    param0.add(new int[]{1,2,3,4,7,11,12,13,14,15,20,21,22,25,25,28,32,32,35,36,37,38,42,42,45,48,48,48,54,67,70,70,71,74,80,81,82,82,85,94});
    param0.add(new int[]{-90,92,28,-32,76,94,48,80,52,-12,-6,22,40,26,-18,-84,90,16,-76,52,10,-56,6});
    param0.add(new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{4,21,34,35,71,10,88,44,82,13,79,92,35,73,28,91,33,9,12,76,40,91,4,22,90,53,98,7,30});
    List<Integer> param1 = new ArrayList<>();
    param1.add(26);
    param1.add(31);
    param1.add(20);
    param1.add(31);
    param1.add(22);
    param1.add(18);
    param1.add(24);
    param1.add(11);
    param1.add(14);
    param1.add(17);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("ELEMENTS_TO_BE_ADDED_SO_THAT_ALL_ELEMENTS_OF_A_RANGE_ARE_PRESENT_IN_ARRAY_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("ELEMENTS_TO_BE_ADDED_SO_THAT_ALL_ELEMENTS_OF_A_RANGE_ARE_PRESENT_IN_ARRAY_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("ELEMENTS_TO_BE_ADDED_SO_THAT_ALL_ELEMENTS_OF_A_RANGE_ARE_PRESENT_IN_ARRAY_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

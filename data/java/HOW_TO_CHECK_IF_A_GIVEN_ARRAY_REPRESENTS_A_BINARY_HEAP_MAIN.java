public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,2,3,5,24,24,25,25,36,37,37,39,42,44,46,50,51,54,56,60,62,70,71,73,75,80,80,85,86,89,91,95,99});
    param0.add(new int[]{-44,-58,88,-42,42,-14,-44,42,64,94,-46,-70,34,-10,-46,-52,-6,-78,64,56,74,98,-34,-4,-92,6,-52,-20,78,-72,-40});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{10,2,1,34,21,37,49,31,70,97,87,50,76,55});
    param0.add(new int[]{-94,-84,-82,-66,-64,-62,-56,-38,-24,-24,-4,2,4,4,8,14,16,20,30,34,34,48,58,58,70,76,78,86,88,96,98});
    param0.add(new int[]{1,0,1,0,1,1,1,1,1,0,0,0,1,0,1,1,0,0});
    param0.add(new int[]{5,20,30,5,10,21,5});
    param0.add(new int[]{50,20,30,5,10,21,5});
    param0.add(new int[]{50,20,30,5,10,21,5});
    param0.add(new int[]{50,20,30,5,10,21,5});
    List<Integer> param1 = new ArrayList<>();
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(29);
    param1.add(12);
    param1.add(0);
    param1.add(0);
    param1.add(2);
    param1.add(7);
    List<Integer> param2 = new ArrayList<>();
    param2.add(18);
    param2.add(27);
    param2.add(20);
    param2.add(8);
    param2.add(26);
    param2.add(11);
    param2.add(7);
    param2.add(7);
    param2.add(7);
    param2.add(7);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("HOW_TO_CHECK_IF_A_GIVEN_ARRAY_REPRESENTS_A_BINARY_HEAP_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("HOW_TO_CHECK_IF_A_GIVEN_ARRAY_REPRESENTS_A_BINARY_HEAP_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("HOW_TO_CHECK_IF_A_GIVEN_ARRAY_REPRESENTS_A_BINARY_HEAP_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

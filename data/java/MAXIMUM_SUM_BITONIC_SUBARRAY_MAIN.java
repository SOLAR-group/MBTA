public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{7,12,16,23,26,27,39,39,40,44,57,58,77,78,81,82,84,86,91,94,94,95,97});
    param0.add(new int[]{72,38,-60,98,-52,-38,-2,94,34,56,90,46,6,-2,30,-96,-76,-96,-76,32,68,64,-32,-4,72,-62,58,20,-84,0,-96,70,-22,-56,70,-74,-90,-86,-14,82,-90,40,-64,94});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{69,31,85,84,28,28});
    param0.add(new int[]{-80,-74,-24,-22,-22,4,20,28,30,32,36,58,58,68,92,94,98});
    param0.add(new int[]{1,1,0,0,0,1,0,1,1,1,1});
    param0.add(new int[]{2,2,2,4,6,7,8,10,15,17,19,20,21,27,28,29,32,32,40,44,46,47,49,50,50,52,55,56,58,59,64,69,73,74,74,77,80,80,84,89,91,95,96,96,97,98,98,99});
    param0.add(new int[]{26,-86,8,64,-40,64,60,-16,54,-42,-86,14,-48,-20,-42,-4,-34,-52,-74,22,10});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{8,5,5,56,5,38});
    List<Integer> param1 = new ArrayList<>();
    param1.add(13);
    param1.add(37);
    param1.add(33);
    param1.add(5);
    param1.add(16);
    param1.add(10);
    param1.add(46);
    param1.add(18);
    param1.add(27);
    param1.add(3);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("MAXIMUM_SUM_BITONIC_SUBARRAY_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MAXIMUM_SUM_BITONIC_SUBARRAY_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MAXIMUM_SUM_BITONIC_SUBARRAY_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

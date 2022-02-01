public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{8,9,11,17,18,19,23,24,27,30,31,31,35,44,46,47,49,51,55,58,59,61,65,67,71,71,71,71,78,78,82,91,98});
    param0.add(new int[]{-82,-28,-66,-52,-36,36,-88,52,-62,46,42,26,-60,18,-52,38,94,-68,44,-94,14,36,-70});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{28,36,42,42,5,52,74,86,55,82,59,81,4,90,24,34,20,99,86,25,52,48,62,5,67,83,60,72,80,73,38,55,8,70,95});
    param0.add(new int[]{-92,-52,-24,36,56});
    param0.add(new int[]{0,1,1,1,0,1,0,1,0,0,1,1,0,1,1,0,0,0});
    param0.add(new int[]{1,1,4,4,7,7,17,18,20,26,26,32,37,38,42,44,44,46,50,53,57,58,58,60,61,61,64,74,75,77,83,83,84,84,85,87,88,90,95,96,97,98,99,99});
    param0.add(new int[]{-86,2,26,54,-16,16,48,24,50,-10,-32,-62,48,-12,-66});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{58,14,79,11,31,28,61,86,25,27,75,78,32,55,86,48,15,51,6,78,23,82,16,62,35,51,91,16,79,38,97,30,23,58,95,57,82,35,57,43,22,41,58,69,25,65,13,79});
    List<Integer> param1 = new ArrayList<>();
    param1.add(20);
    param1.add(15);
    param1.add(19);
    param1.add(19);
    param1.add(3);
    param1.add(13);
    param1.add(25);
    param1.add(13);
    param1.add(14);
    param1.add(39);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("MAXIMUM_SUBARRAY_SUM_USING_PREFIX_SUM," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MAXIMUM_SUBARRAY_SUM_USING_PREFIX_SUM," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MAXIMUM_SUBARRAY_SUM_USING_PREFIX_SUM," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

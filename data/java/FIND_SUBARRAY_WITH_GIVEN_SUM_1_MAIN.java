public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{7,7,8,8,23,24,28,32,48,53,56,62,69,77,81,82,84,87,88,90});
    param0.add(new int[]{-62,-62,-80,-30,-80,44,-12,-76,16,-52,-86,72,32,-60,-70,-62,-78,-96,-18,40,-4,-18,-58,30,-70,6,0,-62,-66,20,92,-64,20,-48,48,-32,64,22,16,26});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{50,25,6,87,55,86,61,97,24,30,51,43,26,1,80,47,19,36,64,62,92,5,48,27,82,76,70,59,1,43,1,36,28,9,52,22,43});
    param0.add(new int[]{-86,-76,-64,-22,-16,-8,4,6,8,32,38,60,68,74});
    param0.add(new int[]{0,0,0,0,1,1,0,1,0,1,1,1,0,1,1,1,1,1,1,1,1,1,0,0,1,0,1,1,0,1,0,0,0,1,0,1,0,1,1,0,0});
    param0.add(new int[]{7,7,12,25,25,32,33,34,37,39,39,41,46,48,56,56,57,58,61,62,62,63,65,66,69,72,74,78,78,79,80,85,89,94,95,99});
    param0.add(new int[]{98,-60});
    param0.add(new int[]{0,0,0,0,1,1,1,1,1,1});
    param0.add(new int[]{80,89,83,42,75,30,64,25,95,17,90,6,11,1,77,16,75,86,96,67,27,80,27});
    List<Integer> param1 = new ArrayList<>();
    param1.add(16);
    param1.add(39);
    param1.add(40);
    param1.add(29);
    param1.add(7);
    param1.add(31);
    param1.add(22);
    param1.add(1);
    param1.add(8);
    param1.add(16);
    List<Integer> param2 = new ArrayList<>();
    param2.add(31);
    param2.add(44);
    param2.add(7);
    param2.add(105);
    param2.add(2);
    param2.add(10);
    param2.add(39);
    param2.add(98);
    param2.add(0);
    param2.add(108);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("FIND_SUBARRAY_WITH_GIVEN_SUM_1," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_SUBARRAY_WITH_GIVEN_SUM_1," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_SUBARRAY_WITH_GIVEN_SUM_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

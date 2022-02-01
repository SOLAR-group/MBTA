public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,7,27,32,36,37,44,48,50,64,86});
    param0.add(new int[]{-22,6,-20,60,-74,98,52,-22});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{77,11,51,11,84,79,43,12,14,50,15,6,85,32,74,49,7,2,58});
    param0.add(new int[]{-90,-66,-64,-58,-46,-44,-32,-30,-30,-22,-18,-14,12,12,18,34,44,60,70,70,74,76,86,98,98});
    param0.add(new int[]{1,1,0,0,0,0,1,0,0,1,1,1,0,1,1,1,0,0,0,1,1,1,1,0,1,0,1,1,1,1,1,0,0,0,0,1,1});
    param0.add(new int[]{9,22,27,27,37,53,53,56,63,73,76,81,82});
    param0.add(new int[]{-46,60,80,80,42,-98,30,-48,4,-32,-78,40,52,26,88,4,22,62,88,-94,2,0,58,38,52,-50,-52,58,-62,30,-38,-8,-82,-66});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{42,69,93,82,8,23,73,1,77,39,49,4,95,85});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(5);
    param1.add(23);
    param1.add(9);
    param1.add(12);
    param1.add(36);
    param1.add(10);
    param1.add(18);
    param1.add(19);
    param1.add(12);
    List<Integer> param2 = new ArrayList<>();
    param2.add(10);
    param2.add(4);
    param2.add(29);
    param2.add(17);
    param2.add(22);
    param2.add(31);
    param2.add(11);
    param2.add(19);
    param2.add(22);
    param2.add(13);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("MINIMUM_OPERATIONS_MAKE_GCD_ARRAY_MULTIPLE_K_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MINIMUM_OPERATIONS_MAKE_GCD_ARRAY_MULTIPLE_K_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MINIMUM_OPERATIONS_MAKE_GCD_ARRAY_MULTIPLE_K_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

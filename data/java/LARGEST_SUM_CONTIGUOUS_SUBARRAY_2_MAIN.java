public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,3,4,7,8,8,10,12,16,19,19,20,20,21,21,22,26,27,29,34,36,38,38,39,41,43,44,47,47,49,57,57,60,62,63,65,75,77,77,78,81,82,82,83,83,84,85,98,99});
    param0.add(new int[]{-40,14,2,-70,86,-90,-50,-54,-2,90,30});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{60,69,41,7,77,36,36,26,35,30,64,75,3,35,60,71,29,47,15,29,43,88,56,22,9,45,40,50,52});
    param0.add(new int[]{-96,-88,-80,-72,-64,-64,-60,-60,-60,-58,-56,-54,-54,-50,-50,-26,-26,-24,-20,-8,-2,0,4,4,12,14,18,18,24,32,42,44,44,44,48,50,50,56,60,60,70,80,88,88,90,98});
    param0.add(new int[]{0,1,1,0,0,1,1,1,0,1,1,1,0,0,1,0,0,0,1,1,1,1,1,0,1,1,0,0,0,1,1,1,0});
    param0.add(new int[]{2,4,4,5,6,7,11,12,14,18,23,24,27,28,33,36,37,38,39,40,41,41,48,48,52,61,64,66,66,77,79,82,85,88,91,94,99});
    param0.add(new int[]{-56,0,16,12,20,36,32,-52,-68,-36,-96,-46,-34,56,2,78,6,30,-68,-48,2,44,-26,-36,-30,-20,-90,-66,4,94,8,4,-4,-32,-24});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{39,87,27,89,26,25,80,82,21,25,55,27,20,81,47,79,26,72,10,11,90,89});
    List<Integer> param1 = new ArrayList<>();
    param1.add(38);
    param1.add(10);
    param1.add(18);
    param1.add(25);
    param1.add(35);
    param1.add(22);
    param1.add(34);
    param1.add(20);
    param1.add(22);
    param1.add(21);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("LARGEST_SUM_CONTIGUOUS_SUBARRAY_2_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("LARGEST_SUM_CONTIGUOUS_SUBARRAY_2_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("LARGEST_SUM_CONTIGUOUS_SUBARRAY_2_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

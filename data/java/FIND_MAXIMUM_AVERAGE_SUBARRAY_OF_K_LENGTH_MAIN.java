public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,4,6,19,21,23,32,34,47,51,56,57,57,65,68,68,69,70,71,73,74,74,77,77,79,82,82,86,87,87,88,89,90,91,92});
    param0.add(new int[]{24,62,-32,-28,42,-46,-96,-70,-68,60,44,34,-30,96,-26,92,62,42,-46,-38,44,54,-94,52,66,68,-96,-58,84,-2,66,30,42});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{94,6,48,34,31});
    param0.add(new int[]{-98,-88,-82,-80,-76,-70,-70,-60,-60,-52,-50,-46,-44,-44,-44,-20,-18,-12,-12,-12,-10,-8,-6,-4,4,4,18,28,32,34,42,42,44,46,48,54,60,70,70,72,78,78,78,78,84,86,90,96,98});
    param0.add(new int[]{0,1,0,0,1,0,1,1,0,0,1,1,0,0,0,0,0});
    param0.add(new int[]{1,5,13,17,26,26,32,35,38,38,39,45,52,58,60,61,62,63,82,83,85,89,89,91});
    param0.add(new int[]{-68,-52,4,-90,90,88,38,-18,86,4,14,-32,-14,-44,-88,-50,-12,-26,-68,-20,-30,22,0,14,-40,58,-6,28,-44,8,28,96,-46,-12});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{17,33,36,34,32,10,37,48,47,32,21,18,75,8,18,52,21,73,25,25,80,32,10,24,1,89,7,42,86,85,73,12,20,20,1,74,77,4,24,74,8});
    List<Integer> param1 = new ArrayList<>();
    param1.add(29);
    param1.add(23);
    param1.add(32);
    param1.add(4);
    param1.add(45);
    param1.add(15);
    param1.add(13);
    param1.add(32);
    param1.add(13);
    param1.add(20);
    List<Integer> param2 = new ArrayList<>();
    param2.add(20);
    param2.add(31);
    param2.add(31);
    param2.add(3);
    param2.add(30);
    param2.add(8);
    param2.add(22);
    param2.add(22);
    param2.add(11);
    param2.add(28);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("FIND_MAXIMUM_AVERAGE_SUBARRAY_OF_K_LENGTH_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_MAXIMUM_AVERAGE_SUBARRAY_OF_K_LENGTH_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_MAXIMUM_AVERAGE_SUBARRAY_OF_K_LENGTH_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
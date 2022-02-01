public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{6,10,31,35});
    param0.add(new int[]{4,88,-72,28,-54,32,-34});
    param0.add(new int[]{0,0,0,1,1,1,1,1,1});
    param0.add(new int[]{39,22,15,10,34,87,46,83,74,77,61,90,43,67,64,72,92,52,68,53,67,32,82,76,76,47,74,47,8,80,85,58,75});
    param0.add(new int[]{-82,-58,-50,-30,-14,-4,-2,-2,0,22,36,58,70,80,80,82,84,90});
    param0.add(new int[]{1,0,1,0,0,1,1,1,0,0,1});
    param0.add(new int[]{4,11,17,21,21,22,30,31,36,37,39,40,45,46,47,48,52,53,53,60,60,65,66,66,67,67,87,88,91,97});
    param0.add(new int[]{-4,-60,-78,-50,64,18,0,76,12,86,-22});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{4,39,50,37,71,66,55,34,1,41,34,99,69,31});
    List<Integer> param1 = new ArrayList<>();
    param1.add(2);
    param1.add(6);
    param1.add(4);
    param1.add(26);
    param1.add(14);
    param1.add(7);
    param1.add(29);
    param1.add(7);
    param1.add(17);
    param1.add(11);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("LONGEST_SUBARRAY_COUNT_1S_ONE_COUNT_0S_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("LONGEST_SUBARRAY_COUNT_1S_ONE_COUNT_0S_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("LONGEST_SUBARRAY_COUNT_1S_ONE_COUNT_0S_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

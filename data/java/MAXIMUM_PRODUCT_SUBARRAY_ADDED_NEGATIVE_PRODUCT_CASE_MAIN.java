public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{19,25,34,39,41,51,52,53,54,56,64,67,72,87,92,93,95});
    param0.add(new int[]{10});
    param0.add(new int[]{0,0,0,0,0,0,1,1});
    param0.add(new int[]{84,81,14,15,34,52,54,1,16,65,54,71,15,40,53,35,62,84,81,85,28,90,74,97,64,3,7,38});
    param0.add(new int[]{-94,-86,-56,-52,-52,-46,-40,-36,-36,-30,-12,18,20,32,44,50,54,64,68,74,74,74,82});
    param0.add(new int[]{0,0,0,0,1,0,0,1,1,1,0,1,0,1,1,0,1,1,1,1,1,1,0,0,0,1,1,0,0,1,0});
    param0.add(new int[]{2,3,4,8,11,16,16,18,20,22,24,26,26,27,29,31,37,38,45,45,46,50,50,59,59,59,60,61,63,65,68,69,71,74,74,76,79,82,88,88,89,91,93,93,99,99});
    param0.add(new int[]{2,-24,-8,-82,76,-62,38,6,-92,30,68,98,-68,8,24,-34,-34,64,-4,-2,-56,-30,92,10,-60,88,4,14,90,-44,-54,4,-4,-26,14,-2,0,82});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{70,92,76,56,93,55,12,80,56,36,83,14,16,12,70,55,93,28,84,28,49,66,15,49,98});
    List<Integer> param1 = new ArrayList<>();
    param1.add(15);
    param1.add(0);
    param1.add(5);
    param1.add(14);
    param1.add(21);
    param1.add(29);
    param1.add(45);
    param1.add(23);
    param1.add(19);
    param1.add(13);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("MAXIMUM_PRODUCT_SUBARRAY_ADDED_NEGATIVE_PRODUCT_CASE," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MAXIMUM_PRODUCT_SUBARRAY_ADDED_NEGATIVE_PRODUCT_CASE," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MAXIMUM_PRODUCT_SUBARRAY_ADDED_NEGATIVE_PRODUCT_CASE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

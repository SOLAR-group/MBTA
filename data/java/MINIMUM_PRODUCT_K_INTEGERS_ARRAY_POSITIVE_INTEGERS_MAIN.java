public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{57,66,91});
    param0.add(new int[]{-44,86,28,-70,-12,96,-10,74,-50,-52,-6,64,-62,92,-24,90,-26,-4,-92,-24,-84,76,-92,62,-62,-86,-86,-14,50,30,62,2,-88,-78,-48});
    param0.add(new int[]{0,0,1,1});
    param0.add(new int[]{99,85,37,27,55,20,76,38,33,78,24,80,74,42,15,16,97,51,71,92,18,63,47,10,6,72,40,21,14,68,98,49,48,64,50,66,44,1,26,55,61,43,9,16,8,42,51,98,1});
    param0.add(new int[]{-58,-12,16,18,24});
    param0.add(new int[]{0,0,1,0,0,1,0,1,0,0,0,0,0,1,1,1});
    param0.add(new int[]{5,10,13,14,19,21,22,25,28,36,39,44,46,53,54,55,55,67,73,75,77,78,80,84,91,94,96});
    param0.add(new int[]{18,-44,46,64,86,-36,8,-10,-50,-98,-6,-38,-34,14,-34,86,58,-30,76,6,38,98,78,56,-56,-66,-58,62,92,-94});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{69,74,28,75,84,52,5,19,80,12,76,14,28,63,30,29,16,74,28,48,97,77,62,19,67,26,14,44,52,86,9,31,41,14,66,27,36,98,48,37,2,12,2});
    List<Integer> param1 = new ArrayList<>();
    param1.add(2);
    param1.add(29);
    param1.add(3);
    param1.add(36);
    param1.add(2);
    param1.add(8);
    param1.add(23);
    param1.add(23);
    param1.add(13);
    param1.add(27);
    List<Integer> param2 = new ArrayList<>();
    param2.add(2);
    param2.add(21);
    param2.add(3);
    param2.add(47);
    param2.add(3);
    param2.add(15);
    param2.add(23);
    param2.add(20);
    param2.add(17);
    param2.add(23);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("MINIMUM_PRODUCT_K_INTEGERS_ARRAY_POSITIVE_INTEGERS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MINIMUM_PRODUCT_K_INTEGERS_ARRAY_POSITIVE_INTEGERS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MINIMUM_PRODUCT_K_INTEGERS_ARRAY_POSITIVE_INTEGERS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

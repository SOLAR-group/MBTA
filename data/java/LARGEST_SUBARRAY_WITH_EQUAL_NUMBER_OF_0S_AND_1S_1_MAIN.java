public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,6,16,16,18,19,22,39,40,42,60,66,69,70,70,73,74,80,99});
    param0.add(new int[]{-88,-66});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{85,98,67,27,98,13,96,32,26,44,32});
    param0.add(new int[]{-96,-94,-90,-88,-86,-66,-64,-52,-46,-46,-42,-40,-38,-32,-28,-22,-16,-10,-8,-8,-4,2,10,26,26,28,28,40,40,42,50,60,66,68,72,74,86,92,94});
    param0.add(new int[]{1,1,1,1,1,1,0,0,0});
    param0.add(new int[]{25,64,86});
    param0.add(new int[]{-4,78,-76,12,4,-38,-98,-26,-8,-98,56,0,-34,36,-90,-36,54,-68,12,-44,62,60,-34,-52,18});
    param0.add(new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{2,25,45,98,71,8,58,94,53});
    List<Integer> param1 = new ArrayList<>();
    param1.add(9);
    param1.add(1);
    param1.add(19);
    param1.add(8);
    param1.add(34);
    param1.add(4);
    param1.add(1);
    param1.add(17);
    param1.add(9);
    param1.add(8);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("LARGEST_SUBARRAY_WITH_EQUAL_NUMBER_OF_0S_AND_1S_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("LARGEST_SUBARRAY_WITH_EQUAL_NUMBER_OF_0S_AND_1S_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("LARGEST_SUBARRAY_WITH_EQUAL_NUMBER_OF_0S_AND_1S_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

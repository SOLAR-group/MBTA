public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{5,15,19,22,28,29,39,46,46,49,51,55,62,69,72,72,72,74,79,92,92,93,95,96});
    param0.add(new int[]{-26,-54,92,76,-92,-14,-24,-70,-78,-50,-48,-22,12,2,-34,-60,4,-32,-10,52,-92,-74,18,34,6,-66,42,-10,-6,56,92});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{59,35,13,79,61,97,92,48,98,38,65,54,31,49,81,22,96,29,65,48,92,66,25,21,26,1,32,73,46,5,40,17,53,93,83,29});
    param0.add(new int[]{-70,-34,-32,-30,-14,80,86,90});
    param0.add(new int[]{0,1,0,1,1,0,0,0,1,1,1,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,0,0,1,1,0,1,1,0});
    param0.add(new int[]{9});
    param0.add(new int[]{94,10,70,42});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{64,76,49,55,92,15,4,8,95,60,90,3,7,79,84,17,96,10,80,26,22,15});
    List<Integer> param1 = new ArrayList<>();
    param1.add(15);
    param1.add(30);
    param1.add(24);
    param1.add(29);
    param1.add(4);
    param1.add(23);
    param1.add(0);
    param1.add(2);
    param1.add(24);
    param1.add(20);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("DIFFERENCE_BETWEEN_HIGHEST_AND_LEAST_FREQUENCIES_IN_AN_ARRAY," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("DIFFERENCE_BETWEEN_HIGHEST_AND_LEAST_FREQUENCIES_IN_AN_ARRAY," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("DIFFERENCE_BETWEEN_HIGHEST_AND_LEAST_FREQUENCIES_IN_AN_ARRAY," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

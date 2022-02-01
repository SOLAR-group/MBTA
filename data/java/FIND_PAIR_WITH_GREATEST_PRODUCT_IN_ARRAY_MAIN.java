public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,78,84});
    param0.add(new int[]{-54,64,60,14,18,-68,-54,-58,38,-72,-84,46,74,76,28,-2,54,24,18,-74,-78,14,-38,-70,26,-54,-36,-96,-12,8,62,-42,-84,10,-6,36,-72,10,10,-20,16,92,-64,-34,74,-98,18});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{39,49,94,80,48,34,63,82,47,51,60,68,79,23,97,22,54,53,40,2,25});
    param0.add(new int[]{-90,-52,-10,12,72});
    param0.add(new int[]{1,0,0});
    param0.add(new int[]{2,9,11,14,16,17,17,18,19,21,24,25,28,29,30,33,33,39,41,41,43,46,50,51,60,62,67,80,84,86,91,92,97});
    param0.add(new int[]{4});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{52,8,31,92,20,18,34,5,15,8,73,20,40,61,80,51,95,73,38,30,21,69,52,38,68,77});
    List<Integer> param1 = new ArrayList<>();
    param1.add(2);
    param1.add(26);
    param1.add(22);
    param1.add(10);
    param1.add(3);
    param1.add(2);
    param1.add(27);
    param1.add(0);
    param1.add(16);
    param1.add(22);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("FIND_PAIR_WITH_GREATEST_PRODUCT_IN_ARRAY," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_PAIR_WITH_GREATEST_PRODUCT_IN_ARRAY," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_PAIR_WITH_GREATEST_PRODUCT_IN_ARRAY," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

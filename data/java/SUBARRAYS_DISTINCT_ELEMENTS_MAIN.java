public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,4,5,6,12,15,16,17,20,20,22,24,24,27,28,34,37,39,39,41,43,49,49,51,55,62,63,67,71,74,74,74,77,84,84,89,89,97,99});
    param0.add(new int[]{-8,54,-22,18,20,44,0,54,90,-4,4,40,-74,-16});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{36,71,36,58,38,90,17});
    param0.add(new int[]{-90,-32,-16,18,38,82});
    param0.add(new int[]{1,0,1});
    param0.add(new int[]{3,11,21,25,28,28,38,42,48,53,55,55,55,58,71,75,79,80,80,94,96,99});
    param0.add(new int[]{-16,-52,-4,-46,54,0,8,-64,-82,-10,-62,-10,58,44,-28,86,-24,16,44,22,-28,-42,-52,8,76,-44,-34,2,88,-88,-14,-84,-36,-68,76,20,20,-50});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{19,13,61,32,92,90,12,81,52});
    List<Integer> param1 = new ArrayList<>();
    param1.add(24);
    param1.add(13);
    param1.add(28);
    param1.add(4);
    param1.add(5);
    param1.add(2);
    param1.add(20);
    param1.add(35);
    param1.add(27);
    param1.add(5);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("SUBARRAYS_DISTINCT_ELEMENTS," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SUBARRAYS_DISTINCT_ELEMENTS," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SUBARRAYS_DISTINCT_ELEMENTS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

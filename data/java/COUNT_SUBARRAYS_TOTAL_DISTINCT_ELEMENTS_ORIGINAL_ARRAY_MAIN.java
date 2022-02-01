public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{13,39,49,52,53,69,72,79,83,96});
    param0.add(new int[]{-98,-98,22,-10,-28,0,56,72,36,88,96,22,90,74,-60,-64,0,2,-42,0,94,-82,-74});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{35,23,41,58,66,92,3,33,78,70,80,86,21,21,74,19});
    param0.add(new int[]{-98,-80,-52,-10,4,76});
    param0.add(new int[]{1,0,0,0,1,0,0,0,1,1,0,0,0,1,0,1,0,1,0,0,1,1,1,0,0,1,0,1,0,1,1,1,0,0,0,1,1,0,1,1,1,1});
    param0.add(new int[]{2,7,10,17,26,36,37,85,87,88});
    param0.add(new int[]{64,-2,-94,-84,-48,86});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{91,49,94,81,64,5,13,70,82,9,80,82});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(20);
    param1.add(26);
    param1.add(12);
    param1.add(3);
    param1.add(36);
    param1.add(8);
    param1.add(5);
    param1.add(20);
    param1.add(9);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("COUNT_SUBARRAYS_TOTAL_DISTINCT_ELEMENTS_ORIGINAL_ARRAY_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_SUBARRAYS_TOTAL_DISTINCT_ELEMENTS_ORIGINAL_ARRAY_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_SUBARRAYS_TOTAL_DISTINCT_ELEMENTS_ORIGINAL_ARRAY_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

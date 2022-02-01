public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{5,6,8,10,21,22,27,32,35,36,43,44,46,48,49,55,60,61,69,69,71,72,73,78,88,94});
    param0.add(new int[]{80,94,16,-74,32,-64,-84,-66,-10});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{99,4,96,39,39,24,15,47,25,74,7,98,88,91,62,12,31,14,48,26,37,25,11,32,34,64,72,5,80,86,6});
    param0.add(new int[]{-86,-84,-84,-78,-78,-76,-74,-68,-66,-64,-60,-60,-56,-50,-42,-42,-38,-34,-32,-22,-16,-14,-10,-6,-6,4,4,26,36,36,54,62,64,68,70,76,76,76,84,92,92,94,96});
    param0.add(new int[]{1,1,1,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,0,1,1,1,0,0,0,0,1,0,0,0,1});
    param0.add(new int[]{3,3,5,8,32,33,35,35,42,48,67,71,71,74,77,80,94,96,96,97});
    param0.add(new int[]{-50,-18,-66,76,-54,96,98,26,42,64,-60});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{70,21,44,82,62,41,86});
    List<Integer> param1 = new ArrayList<>();
    param1.add(24);
    param1.add(6);
    param1.add(27);
    param1.add(15);
    param1.add(27);
    param1.add(25);
    param1.add(19);
    param1.add(9);
    param1.add(15);
    param1.add(3);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("FIND_SUM_NON_REPEATING_DISTINCT_ELEMENTS_ARRAY_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_SUM_NON_REPEATING_DISTINCT_ELEMENTS_ARRAY_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_SUM_NON_REPEATING_DISTINCT_ELEMENTS_ARRAY_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

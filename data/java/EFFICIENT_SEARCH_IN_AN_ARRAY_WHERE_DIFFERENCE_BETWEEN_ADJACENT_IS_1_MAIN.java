public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{5, 4, 5, 6, 5, 4, 3, 2});
    param0.add(new int[]{5, 4, 5, 6, 5, 4, 3, 2});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{50,51,52,51,50,49,48});
    param0.add(new int[]{-86,-68,-32,-6,6,10,30,34,58,92});
    param0.add(new int[]{1,1,1,0,0,1,0,0,0,1,1,1,0,1,0,0,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,1,0,1,0,1,1,1,0,0});
    param0.add(new int[]{58});
    param0.add(new int[]{-64,78,58,36,48,80,-80,74,-98,46,-48,24,80,72,90,-46,14,68,38,58,-54,80,44,-62,34,-28,92,84,90,44,-26,88,18,22,-32,54,58,92});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{5});
    List<Integer> param1 = new ArrayList<>();
    param1.add(8);
    param1.add(8);
    param1.add(15);
    param1.add(7);
    param1.add(6);
    param1.add(27);
    param1.add(0);
    param1.add(24);
    param1.add(35);
    param1.add(0);
    List<Integer> param2 = new ArrayList<>();
    param2.add(6);
    param2.add(3);
    param2.add(1);
    param2.add(49);
    param2.add(6);
    param2.add(22);
    param2.add(0);
    param2.add(34);
    param2.add(1);
    param2.add(0);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("EFFICIENT_SEARCH_IN_AN_ARRAY_WHERE_DIFFERENCE_BETWEEN_ADJACENT_IS_1," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("EFFICIENT_SEARCH_IN_AN_ARRAY_WHERE_DIFFERENCE_BETWEEN_ADJACENT_IS_1," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("EFFICIENT_SEARCH_IN_AN_ARRAY_WHERE_DIFFERENCE_BETWEEN_ADJACENT_IS_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

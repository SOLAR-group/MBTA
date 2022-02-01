public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{8,11,18,23,24,28,28,34,35,42,44,53,57,65,71,72,76,78,82,82,85,86,92,93});
    param0.add(new int[]{0,-95,-51,-2,-70,-28,3,-37,75,-74,85,-63,-93,27,68,-8,67,90,3,-47,32,8,12,53,-93,56,97});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{28,85,78,33,10,83,30,22,3,82,75,48,2,76,54,6,40,93,94});
    param0.add(new int[]{-98,-94,-7,-3,1,11,11,83,88});
    param0.add(new int[]{0,0,1,0,0,0,1,0,1,1,1,0,0,1,1,0,1,1,0,1,0,0,1,0,0,0,1,1,1,0,0,1,1,0,1,1,1,1,1,0});
    param0.add(new int[]{8,35,37,38,39,46,49,54});
    param0.add(new int[]{-60,-66,-4,-21,27,-83,61,75,10,-48,18,-91,-67,88,13,49,86,-15,97,-90,-94,15,21,41,-35,-80,-43,-54});
    param0.add(new int[]{0,0,0,0,0,0,0,0,1,1});
    param0.add(new int[]{62,36,39,53,90,78,56,1,56,4,30});
    List<Integer> param1 = new ArrayList<>();
    param1.add(15);
    param1.add(15);
    param1.add(40);
    param1.add(10);
    param1.add(7);
    param1.add(35);
    param1.add(6);
    param1.add(21);
    param1.add(5);
    param1.add(8);
    List<int [ ]> filled_function_param0 = new ArrayList<>();
    filled_function_param0.add(new int[]{8,11,18,23,24,28,28,34,35,42,44,53,57,65,71,72,76,78,82,82,85,86,92,93});
    filled_function_param0.add(new int[]{0,-95,-51,-2,-70,-28,3,-37,75,-74,85,-63,-93,27,68,-8,67,90,3,-47,32,8,12,53,-93,56,97});
    filled_function_param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    filled_function_param0.add(new int[]{28,85,78,33,10,83,30,22,3,82,75,48,2,76,54,6,40,93,94});
    filled_function_param0.add(new int[]{-98,-94,-7,-3,1,11,11,83,88});
    filled_function_param0.add(new int[]{0,0,1,0,0,0,1,0,1,1,1,0,0,1,1,0,1,1,0,1,0,0,1,0,0,0,1,1,1,0,0,1,1,0,1,1,1,1,1,0});
    filled_function_param0.add(new int[]{8,35,37,38,39,46,49,54});
    filled_function_param0.add(new int[]{-60,-66,-4,-21,27,-83,61,75,10,-48,18,-91,-67,88,13,49,86,-15,97,-90,-94,15,21,41,-35,-80,-43,-54});
    filled_function_param0.add(new int[]{0,0,0,0,0,0,0,0,1,1});
    filled_function_param0.add(new int[]{62,36,39,53,90,78,56,1,56,4,30});
    List<Integer> filled_function_param1 = new ArrayList<>();
    filled_function_param1.add(15);
    filled_function_param1.add(15);
    filled_function_param1.add(40);
    filled_function_param1.add(10);
    filled_function_param1.add(7);
    filled_function_param1.add(35);
    filled_function_param1.add(6);
    filled_function_param1.add(21);
    filled_function_param1.add(5);
    filled_function_param1.add(8);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        f_filled(filled_function_param0.get(i),filled_function_param1.get(i));
	        f_gold(param0.get(i),param1.get(i));
	        if(Arrays.equals(param0.get(i), filled_function_param0.get(i)) && param1.get(i) == filled_function_param1.get(i))
	        {
                builder.append("POSITIVE_ELEMENTS_EVEN_NEGATIVE_ODD_POSITIONS," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("POSITIVE_ELEMENTS_EVEN_NEGATIVE_ODD_POSITIONS," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("POSITIVE_ELEMENTS_EVEN_NEGATIVE_ODD_POSITIONS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

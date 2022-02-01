public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{6,25,42,52,53,54,58,66,67,70});
    param0.add(new int[]{-13,-98,50,-63,48,3,-76,12,-35,93,29,17,16,5,-97,-54,-45,-25});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{7,49,26,33,48,79,2,71,32,4,20,36});
    param0.add(new int[]{88});
    param0.add(new int[]{1,1,1,1,0,0,0,1,1,0,0,0,1,0,1,1,0,0,1,0,0,1,1,1,1,1,0,1,1,1,0,1,1,1,0});
    param0.add(new int[]{2,2,4,5,7,12,12,14,14,16,17,29,29,31,32,39,41,47,48,49,51,54,58,58,59,60,73,78,80,81,82,83,84,85,90,95,97,99,99});
    param0.add(new int[]{-31,-55,6,37,77,61,0,46,-91,-38,85,-71,25,14,53,43,34});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{77,68,78,97,92,52,37,8,44,98,5,69,31,45,9,32,33,67,30,76,29,3,90,57,30,9,26,2,62,3,46,68,25,51,13,44,35,55});
    List<Integer> param1 = new ArrayList<>();
    param1.add(6);
    param1.add(16);
    param1.add(28);
    param1.add(9);
    param1.add(0);
    param1.add(20);
    param1.add(28);
    param1.add(15);
    param1.add(12);
    param1.add(27);
    List<Integer> param2 = new ArrayList<>();
    param2.add(6);
    param2.add(14);
    param2.add(24);
    param2.add(10);
    param2.add(0);
    param2.add(28);
    param2.add(29);
    param2.add(11);
    param2.add(17);
    param2.add(20);
    List<int [ ]> filled_function_param0 = new ArrayList<>();
    filled_function_param0.add(new int[]{6,25,42,52,53,54,58,66,67,70});
    filled_function_param0.add(new int[]{-13,-98,50,-63,48,3,-76,12,-35,93,29,17,16,5,-97,-54,-45,-25});
    filled_function_param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    filled_function_param0.add(new int[]{7,49,26,33,48,79,2,71,32,4,20,36});
    filled_function_param0.add(new int[]{88});
    filled_function_param0.add(new int[]{1,1,1,1,0,0,0,1,1,0,0,0,1,0,1,1,0,0,1,0,0,1,1,1,1,1,0,1,1,1,0,1,1,1,0});
    filled_function_param0.add(new int[]{2,2,4,5,7,12,12,14,14,16,17,29,29,31,32,39,41,47,48,49,51,54,58,58,59,60,73,78,80,81,82,83,84,85,90,95,97,99,99});
    filled_function_param0.add(new int[]{-31,-55,6,37,77,61,0,46,-91,-38,85,-71,25,14,53,43,34});
    filled_function_param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    filled_function_param0.add(new int[]{77,68,78,97,92,52,37,8,44,98,5,69,31,45,9,32,33,67,30,76,29,3,90,57,30,9,26,2,62,3,46,68,25,51,13,44,35,55});
    List<Integer> filled_function_param1 = new ArrayList<>();
    filled_function_param1.add(6);
    filled_function_param1.add(16);
    filled_function_param1.add(28);
    filled_function_param1.add(9);
    filled_function_param1.add(0);
    filled_function_param1.add(20);
    filled_function_param1.add(28);
    filled_function_param1.add(15);
    filled_function_param1.add(12);
    filled_function_param1.add(27);
    List<Integer> filled_function_param2 = new ArrayList<>();
    filled_function_param2.add(6);
    filled_function_param2.add(14);
    filled_function_param2.add(24);
    filled_function_param2.add(10);
    filled_function_param2.add(0);
    filled_function_param2.add(28);
    filled_function_param2.add(29);
    filled_function_param2.add(11);
    filled_function_param2.add(17);
    filled_function_param2.add(20);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        f_filled(filled_function_param0.get(i),filled_function_param1.get(i),filled_function_param2.get(i));
	        f_gold(param0.get(i),param1.get(i),param2.get(i));
	        if(Arrays.equals(param0.get(i), filled_function_param0.get(i)) && param1.get(i) == filled_function_param1.get(i) && param2.get(i) == filled_function_param2.get(i))
	        {
                builder.append("STOOGE_SORT_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("STOOGE_SORT_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("STOOGE_SORT_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

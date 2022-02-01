public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,4,8,10,12,14,14,17,18,19,20,25,28,29,30,31,34,35,37,38,40,41,42,45,47,49,54,54,55,58,58,63,65,66,66,67,67,72,74,75,75,80,82,86,92,95,96,99});
    param0.add(new int[]{45,42,-91,90,-6,49,65,39,-80,-65,-47,75,10,80,36,-96,55,72,68,2,-53,-6,72,-52,-9,80,-16,-32,39,25,-27,-96,-24,-27,-23,-52});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{12,84,16});
    param0.add(new int[]{-85,-77,-70,-67,-55,-51,-49,-41,-37,-24,-18,-8,-6,77,87,90});
    param0.add(new int[]{0,0,1,1,1,1,1,1,1,0,1,1,0,0,0});
    param0.add(new int[]{5,8,15,16,20,22,25,33,46,48,52,54,55,57,57,61,61,66,72,73,83,87,88,89,98});
    param0.add(new int[]{31,2,-46,-86,-64,5,-18,-33,-90,-51,11,-35,-43,-73,13,33,-29,-17,-43,20,-7,-85});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{20,75,12,62,18,94,63,84,25,12});
    List<Integer> param1 = new ArrayList<>();
    param1.add(40);
    param1.add(23);
    param1.add(28);
    param1.add(2);
    param1.add(13);
    param1.add(12);
    param1.add(12);
    param1.add(13);
    param1.add(31);
    param1.add(9);
    List<int [ ]> filled_function_param0 = new ArrayList<>();
    filled_function_param0.add(new int[]{3,4,8,10,12,14,14,17,18,19,20,25,28,29,30,31,34,35,37,38,40,41,42,45,47,49,54,54,55,58,58,63,65,66,66,67,67,72,74,75,75,80,82,86,92,95,96,99});
    filled_function_param0.add(new int[]{45,42,-91,90,-6,49,65,39,-80,-65,-47,75,10,80,36,-96,55,72,68,2,-53,-6,72,-52,-9,80,-16,-32,39,25,-27,-96,-24,-27,-23,-52});
    filled_function_param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    filled_function_param0.add(new int[]{12,84,16});
    filled_function_param0.add(new int[]{-85,-77,-70,-67,-55,-51,-49,-41,-37,-24,-18,-8,-6,77,87,90});
    filled_function_param0.add(new int[]{0,0,1,1,1,1,1,1,1,0,1,1,0,0,0});
    filled_function_param0.add(new int[]{5,8,15,16,20,22,25,33,46,48,52,54,55,57,57,61,61,66,72,73,83,87,88,89,98});
    filled_function_param0.add(new int[]{31,2,-46,-86,-64,5,-18,-33,-90,-51,11,-35,-43,-73,13,33,-29,-17,-43,20,-7,-85});
    filled_function_param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    filled_function_param0.add(new int[]{20,75,12,62,18,94,63,84,25,12});
    List<Integer> filled_function_param1 = new ArrayList<>();
    filled_function_param1.add(40);
    filled_function_param1.add(23);
    filled_function_param1.add(28);
    filled_function_param1.add(2);
    filled_function_param1.add(13);
    filled_function_param1.add(12);
    filled_function_param1.add(12);
    filled_function_param1.add(13);
    filled_function_param1.add(31);
    filled_function_param1.add(9);
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
                builder.append("REARRANGE_ARRAY_MAXIMUM_MINIMUM_FORM_SET_2_O1_EXTRA_SPACE_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("REARRANGE_ARRAY_MAXIMUM_MINIMUM_FORM_SET_2_O1_EXTRA_SPACE_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("REARRANGE_ARRAY_MAXIMUM_MINIMUM_FORM_SET_2_O1_EXTRA_SPACE_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

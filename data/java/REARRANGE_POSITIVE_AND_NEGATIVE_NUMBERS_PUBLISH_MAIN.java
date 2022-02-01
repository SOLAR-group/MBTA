public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{5,5,6,7,8,10,13,15,15,27,27,29,29,29,29,31,33,33,36,38,38,39,42,47,47,51,51,51,52,53,55,56,57,64,66,66,67,68,70,72,74,78,86,88,94,97,97});
    param0.add(new int[]{73,30,55,-5,15,64,-64,-74,-57,-73,-31,48});
    param0.add(new int[]{0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{62,82,89,97,60,43,76,68,5,37,72,92,31});
    param0.add(new int[]{-99,-89,-71,-60,-59,-54,-49,1,51});
    param0.add(new int[]{1,1,1,0,0,0,0,1,0,0,1,0,0,0,0,0,0,1,1,0,0,1,0,0,0,1});
    param0.add(new int[]{2,7,17,22,24,25,26,28,29,33,34,38,43,49,51,52,54,59,63,70,71,75,82,88,91,91});
    param0.add(new int[]{-51,99,-19,-16,5,77,48,18,-14,-37,89,4,-51,-29,-99,41,79,23,84,-38,-68});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{88,87,59});
    List<Integer> param1 = new ArrayList<>();
    param1.add(26);
    param1.add(8);
    param1.add(6);
    param1.add(7);
    param1.add(8);
    param1.add(21);
    param1.add(14);
    param1.add(10);
    param1.add(44);
    param1.add(1);
    List<int [ ]> filled_function_param0 = new ArrayList<>();
    filled_function_param0.add(new int[]{5,5,6,7,8,10,13,15,15,27,27,29,29,29,29,31,33,33,36,38,38,39,42,47,47,51,51,51,52,53,55,56,57,64,66,66,67,68,70,72,74,78,86,88,94,97,97});
    filled_function_param0.add(new int[]{73,30,55,-5,15,64,-64,-74,-57,-73,-31,48});
    filled_function_param0.add(new int[]{0,0,0,1,1,1,1,1,1,1});
    filled_function_param0.add(new int[]{62,82,89,97,60,43,76,68,5,37,72,92,31});
    filled_function_param0.add(new int[]{-99,-89,-71,-60,-59,-54,-49,1,51});
    filled_function_param0.add(new int[]{1,1,1,0,0,0,0,1,0,0,1,0,0,0,0,0,0,1,1,0,0,1,0,0,0,1});
    filled_function_param0.add(new int[]{2,7,17,22,24,25,26,28,29,33,34,38,43,49,51,52,54,59,63,70,71,75,82,88,91,91});
    filled_function_param0.add(new int[]{-51,99,-19,-16,5,77,48,18,-14,-37,89,4,-51,-29,-99,41,79,23,84,-38,-68});
    filled_function_param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    filled_function_param0.add(new int[]{88,87,59});
    List<Integer> filled_function_param1 = new ArrayList<>();
    filled_function_param1.add(26);
    filled_function_param1.add(8);
    filled_function_param1.add(6);
    filled_function_param1.add(7);
    filled_function_param1.add(8);
    filled_function_param1.add(21);
    filled_function_param1.add(14);
    filled_function_param1.add(10);
    filled_function_param1.add(44);
    filled_function_param1.add(1);
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
                builder.append("REARRANGE_POSITIVE_AND_NEGATIVE_NUMBERS_PUBLISH," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("REARRANGE_POSITIVE_AND_NEGATIVE_NUMBERS_PUBLISH," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("REARRANGE_POSITIVE_AND_NEGATIVE_NUMBERS_PUBLISH," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

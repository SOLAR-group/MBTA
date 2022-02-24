public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{19});
    param0.add(new int[]{-47,72});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{93,3,20,59,36,19,90,67,19,20,96,71,52,33,40,39});
    param0.add(new int[]{-98,-93,-91,-89,-63,-58,-52,-52,-46,-40,-25,-16,-10,-1,-1,4,12,12,13,13,16,20,29,29,31,40,44,47,48,51,52,52,59,60,61,64,66,78,85,97});
    param0.add(new int[]{0,1,1,1,1,1,1,0,1,0,0,1,0,1,0,1,0,1,1,1,1,1,0,0,0});
    param0.add(new int[]{4,6,8,17,19,21,22,24,27,27,28,30,30,30,32,33,35,37,38,44,46,46,48,49,51,53,54,59,60,61,63,64,64,69,76,85,86,87,92,93,93,95,97,97,97,98,99,99});
    param0.add(new int[]{-75,-46,-42,-33,4,74,-76,14,-68,75,-14,51,94,27,55,30,-83,4});
    param0.add(new int[]{0,0,0,0,0,1,1,1,1});
    param0.add(new int[]{24,13,60,7,57,36,45,20,65,8,16,14,76,87,15,92,98,66,32,87,63,86,51,25,58});
    List<Integer> param1 = new ArrayList<>();
    param1.add(0);
    param1.add(1);
    param1.add(18);
    param1.add(9);
    param1.add(22);
    param1.add(12);
    param1.add(26);
    param1.add(9);
    param1.add(5);
    param1.add(24);
    List<int [ ]> filled_function_param0 = new ArrayList<>();
    filled_function_param0.add(new int[]{19});
    filled_function_param0.add(new int[]{-47,72});
    filled_function_param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    filled_function_param0.add(new int[]{93,3,20,59,36,19,90,67,19,20,96,71,52,33,40,39});
    filled_function_param0.add(new int[]{-98,-93,-91,-89,-63,-58,-52,-52,-46,-40,-25,-16,-10,-1,-1,4,12,12,13,13,16,20,29,29,31,40,44,47,48,51,52,52,59,60,61,64,66,78,85,97});
    filled_function_param0.add(new int[]{0,1,1,1,1,1,1,0,1,0,0,1,0,1,0,1,0,1,1,1,1,1,0,0,0});
    filled_function_param0.add(new int[]{4,6,8,17,19,21,22,24,27,27,28,30,30,30,32,33,35,37,38,44,46,46,48,49,51,53,54,59,60,61,63,64,64,69,76,85,86,87,92,93,93,95,97,97,97,98,99,99});
    filled_function_param0.add(new int[]{-75,-46,-42,-33,4,74,-76,14,-68,75,-14,51,94,27,55,30,-83,4});
    filled_function_param0.add(new int[]{0,0,0,0,0,1,1,1,1});
    filled_function_param0.add(new int[]{24,13,60,7,57,36,45,20,65,8,16,14,76,87,15,92,98,66,32,87,63,86,51,25,58});
    List<Integer> filled_function_param1 = new ArrayList<>();
    filled_function_param1.add(0);
    filled_function_param1.add(1);
    filled_function_param1.add(18);
    filled_function_param1.add(9);
    filled_function_param1.add(22);
    filled_function_param1.add(12);
    filled_function_param1.add(26);
    filled_function_param1.add(9);
    filled_function_param1.add(5);
    filled_function_param1.add(24);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        f_gold(param0.get(i),param1.get(i));
            builder.append("CHANGE_ARRAY_PERMUTATION_NUMBERS_1_N," + args[1] + "," + i + "," + Arrays.toString(param0.get(i)).replace(",", ";") + ";" + param1.get(i) + "\n");
        } catch (Exception e) {
            builder.append("CHANGE_ARRAY_PERMUTATION_NUMBERS_1_N," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

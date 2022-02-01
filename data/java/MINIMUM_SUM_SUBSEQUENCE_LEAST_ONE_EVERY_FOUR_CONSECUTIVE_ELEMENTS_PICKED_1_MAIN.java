public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,4,9,26,31,31,33,35,40,45,48,52,57,60,69,75,82,89,90,92,95,97});
    param0.add(new int[]{60,-68,30,-62,-8,48,-20,30,16,-60,-20});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{15,70,50,28,67,11,27,42,1,61,37,8,66,54,50,91,86,57,4});
    param0.add(new int[]{-98,-92,-84,-80,-70,-58,-58,-48,-42,-14,-8,24,30,32,42,62,68,70,72,88});
    param0.add(new int[]{1,1,1,1,0,1,0,1,1,1,0,1,1,1,0});
    param0.add(new int[]{4,5,5,10,12,13,16,19,19,21,22,25,26,29,30,33,34,44,46,52,55,55,56,78,86,88,88,90,92});
    param0.add(new int[]{40,-50,-96,78,82,-16,26,8,38,38,54,-24,88,96,-42,-84,-28,-32,-64,74,74,-10,-8,66,14,-78,56,-22,-90,66,-68});
    param0.add(new int[]{0,0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{29,38,20,25,16,97,16,90,30,99});
    List<Integer> param1 = new ArrayList<>();
    param1.add(19);
    param1.add(5);
    param1.add(43);
    param1.add(15);
    param1.add(16);
    param1.add(7);
    param1.add(16);
    param1.add(26);
    param1.add(7);
    param1.add(9);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("MINIMUM_SUM_SUBSEQUENCE_LEAST_ONE_EVERY_FOUR_CONSECUTIVE_ELEMENTS_PICKED_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MINIMUM_SUM_SUBSEQUENCE_LEAST_ONE_EVERY_FOUR_CONSECUTIVE_ELEMENTS_PICKED_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MINIMUM_SUM_SUBSEQUENCE_LEAST_ONE_EVERY_FOUR_CONSECUTIVE_ELEMENTS_PICKED_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

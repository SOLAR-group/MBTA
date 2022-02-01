public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,5,9,9,12,13,13,13,15,16,17,18,20,20,20,25,28,30,30,33,34,34,37,42,45,49,50,52,52,54,65,68,72,74,75,82,85,87,91,91,94,95});
    param0.add(new int[]{-28,90,30,-80,-10,26,-12,24,12,44,-38,20,26,38,-8,-40,88,26});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{74,37,37,71,85,89,44,72,55,8,5,98,54,37,7,76,93,74,84,51,18,37});
    param0.add(new int[]{-68,14,76});
    param0.add(new int[]{0,0,1,1,0,0,0,1,0,0,1,0,0,0,1,1,1,1,1,1,1,1,1,0,1,0,1,1,0,1,0,0,1,0,1,1,0,1,0,0,1,1,1});
    param0.add(new int[]{3,4,6,6,7,14,28,36,37,44,46,47,50,51,52,55,55,61,68,69,70,73,74,77,86,90,90,91,98,99});
    param0.add(new int[]{-4,-24,-84,-76});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{78,88,1,98,26,31,56,12,71});
    List<Integer> param1 = new ArrayList<>();
    param1.add(22);
    param1.add(9);
    param1.add(37);
    param1.add(20);
    param1.add(1);
    param1.add(27);
    param1.add(23);
    param1.add(2);
    param1.add(32);
    param1.add(8);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("MINIMUM_NUMBER_OF_JUMPS_TO_REACH_END_OF_A_GIVEN_ARRAY_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MINIMUM_NUMBER_OF_JUMPS_TO_REACH_END_OF_A_GIVEN_ARRAY_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MINIMUM_NUMBER_OF_JUMPS_TO_REACH_END_OF_A_GIVEN_ARRAY_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

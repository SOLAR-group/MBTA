public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,4,64,16});
    param0.add(new int[]{0, 12, 4, 8});
    param0.add(new int[]{-2, 2, 0, 4, 6});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0});
    param0.add(new int[]{66,56,86,76,46});
    param0.add(new int[]{66,56,56,86,76,46});
    param0.add(new int[]{7,9,11,21,44,45,61,67,78,97,98,99});
    param0.add(new int[]{66,-28,-26,50,-18,54,84,-2,-70,-74,6,-34,44,-36,-4,36,14,24,64,74,86,-96,54,-68,-84,-62,-36,34,-36,70,-50,6,62,-50,-34,-38,-28,74,78,-2,-12,-4});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{18,93,79,20,44,36,69,37,33,82,19,51,32,22,1,54,89,20,58,35,70,70,61,63,61,57,3,95,99,45,15,17,15,5,86,46,11,64,92,14,39,67});
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
    param1.add(4);
    param1.add(5);
    param1.add(7);
    param1.add(5);
    param1.add(6);
    param1.add(11);
    param1.add(33);
    param1.add(33);
    param1.add(40);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("CHECK_WHETHER_ARITHMETIC_PROGRESSION_CAN_FORMED_GIVEN_ARRAY," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_WHETHER_ARITHMETIC_PROGRESSION_CAN_FORMED_GIVEN_ARRAY," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_WHETHER_ARITHMETIC_PROGRESSION_CAN_FORMED_GIVEN_ARRAY," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

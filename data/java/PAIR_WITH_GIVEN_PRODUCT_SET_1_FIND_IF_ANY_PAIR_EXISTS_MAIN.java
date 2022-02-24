public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{10, 20, 9, 40});
    param0.add(new int[]{1,-10, 20, 9, -40});
    param0.add(new int[]{0,0,0,0,0,1,1,1,1});
    param0.add(new int[]{4,10, 20, 9, -40});
    param0.add(new int[]{-90,-86,-76,-72,-70,-62,-56,-50,-18,-12,-10,4,16,26,42,48,52,54,54,70,84,86,88,98});
    param0.add(new int[]{1});
    param0.add(new int[]{4,7,14,14,16,18,19,20,22,24,29,38,38,38,40,40,46,46,47,51,51,52,55,56,56,62,62,62,78,79,81,84,86,88,89,89,89});
    param0.add(new int[]{72,80,-82,24,-98,90,-32,-56,-22,8,-12,8,-78,60,-62,50,12,-60,10,-54,74,98,26,56,24});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{93,40,48,99,95,59,43,58,79,70,28});
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
   param1.add(5);
   param1.add(7);
   param1.add(5);
   param1.add(23);
   param1.add(0);
   param1.add(23);
   param1.add(21);
   param1.add(22);
   param1.add(9);
    List<Integer> param2 = new ArrayList<>();
    param2.add(400);
   param2.add(400);
   param2.add(8);
   param2.add(-400);
   param2.add(23);
   param2.add(0);
   param2.add(32);
   param2.add(19);
   param2.add(18);
   param2.add(5);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PAIR_WITH_GIVEN_PRODUCT_SET_1_FIND_IF_ANY_PAIR_EXISTS," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PAIR_WITH_GIVEN_PRODUCT_SET_1_FIND_IF_ANY_PAIR_EXISTS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

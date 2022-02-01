public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{13,20,20,27,32,35,37,51,63,64,71,75,77,80,82,82,86,90,90,92,95,97,98});
    param0.add(new int[]{-10, -5, 0, 3, 7});
    param0.add(new int[]{0, 2, 5, 8, 17});
    param0.add(new int[]{-10, -5, 3, 4, 7, 9});
    param0.add(new int[]{-10, -5, 2, 4, 7, 9});
    param0.add(new int[]{1,1,0,1,1,0,1,0,0});
    param0.add(new int[]{1,4,16,16,19,28,34,34,35,36,37,46,49,52,54,60,60,60,63,70,75,77,80,81,81,84,85,87,93,99});
    param0.add(new int[]{30,30,-94,-10,2,58});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{72,38,91,63,30,67,39,29,96,42});
    List<Integer> param1 = new ArrayList<>();
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(1);
    param1.add(2);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    List<Integer> param2 = new ArrayList<>();
    param2.add(16);
    param2.add(4);
    param2.add(4);
    param2.add(5);
    param2.add(5);
    param2.add(7);
    param2.add(5);
    param2.add(5);
    param2.add(12);
    param2.add(7);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("FIND_A_FIXED_POINT_IN_A_GIVEN_ARRAY_1," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_A_FIXED_POINT_IN_A_GIVEN_ARRAY_1," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_A_FIXED_POINT_IN_A_GIVEN_ARRAY_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

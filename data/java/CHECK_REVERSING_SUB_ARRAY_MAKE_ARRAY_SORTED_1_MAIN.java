public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,2,5,4,3});
    param0.add(new int[]{1,2,4,5,3});
    param0.add(new int[]{1,1,0,0});
    param0.add(new int[]{5,99,40,33,61,4,64,92,28,27,21,35,40,79,10,20,76,87,80,15,57,39,96,98,99,72,72,50,61,39,35,70,27});
    param0.add(new int[]{-98,-92,-86,-58,-22,-12,0,26});
    param0.add(new int[]{0,0,1,0,1,0,1,0,0,1,0,1,0,1,1,1,0,1,1,1,1,1,0,0,1,0,1,0,1,1,1,0,1,1,0});
    param0.add(new int[]{6,10,27,30,40,47,49,55,59,60,68,82,91});
    param0.add(new int[]{36,56,-56,94,52,-82,88,-62,70,-94,38,10,-78,66,-94,-72,18,96,-72,88,-6,48,6,-88,64,-96,-40,8,36,36,-90,-68,-20,-76,22,-92});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{2,5,42,28,47,26,88,16,30,30,36,49,21,95,99,21,41,52,57,39,69,2,42,22,55,92,64,27,95,71,19,38,40,65,7,21,29,38,13,11,41,54,38,40,35,51,88});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(5);
    param1.add(4);
    param1.add(32);
    param1.add(6);
    param1.add(24);
    param1.add(8);
    param1.add(30);
    param1.add(31);
    param1.add(46);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("CHECK_REVERSING_SUB_ARRAY_MAKE_ARRAY_SORTED_1," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_REVERSING_SUB_ARRAY_MAKE_ARRAY_SORTED_1," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_REVERSING_SUB_ARRAY_MAKE_ARRAY_SORTED_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

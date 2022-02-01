public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,1,1,7,7,8,10,10,10,14,15,18,20,23,24,24,26,30,32,32,33,36,42,43,46,48,51,51,52,53,58,58,59,59,59,60,67,71,72,74,76,77,83,84,86,90,91});
    param0.add(new int[]{-90,-20,-60,-64,-24,84,-2,-32,28,-54,44,-96,52,88,20,-56,-2});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{98,70,24,18,7,4,78,19,70,56,99,54,69,15,88,20,40,13,19,56,62});
    param0.add(new int[]{-72,-66,-58,-20,36,80,92});
    param0.add(new int[]{0,1});
    param0.add(new int[]{6,13,14,16,21,26,26,28,29,35,38,42,47,47,62,67,77,81,81,83,84,88,90,96,97,98});
    param0.add(new int[]{-48,-8,20,32,-90,-42,-6,-88,-72,42,66,-62,82,-4,8,12,-22,82,56,96,-54,92,-42,30,-18,14,-6,-66,34,16,-84,-94,48,-48,52,-60,-92,-16});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{45,86,53,80,27,45,1,85,91,93,92,43,75,86,81,48,21,34,5,10,88,42,7,15,96,85,62,86,52,37});
    List<Integer> param1 = new ArrayList<>();
    param1.add(30);
    param1.add(12);
    param1.add(36);
    param1.add(19);
    param1.add(6);
    param1.add(1);
    param1.add(17);
    param1.add(35);
    param1.add(14);
    param1.add(29);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("CHECK_IF_ALL_THE_ELEMENTS_CAN_BE_MADE_OF_SAME_PARITY_BY_INVERTING_ADJACENT_ELEMENTS," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_IF_ALL_THE_ELEMENTS_CAN_BE_MADE_OF_SAME_PARITY_BY_INVERTING_ADJACENT_ELEMENTS," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_IF_ALL_THE_ELEMENTS_CAN_BE_MADE_OF_SAME_PARITY_BY_INVERTING_ADJACENT_ELEMENTS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

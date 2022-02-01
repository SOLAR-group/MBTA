public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,9,21,25,33,36,44,48,55,55,56,58,66,66,66,66,78,92,96,97});
    param0.add(new int[]{-16,80,70,72,-86,-28,42,28,-28,56,-32,40,-78,32,22,-52,-58});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{10,85,45,52,98,9,59,58,61,91,4,90,43,48,47});
    param0.add(new int[]{-92,-90,-88,-50,-48,-48,-44,-42,-40,-34,-28,-26,-26,-24,-8,-6,4,8,12,20,32,36,38,40,46,52,58,88,92});
    param0.add(new int[]{1,0,1,1,1});
    param0.add(new int[]{1,2,3,4,14,16,17,18,19,19,21,21,22,25,25,28,29,33,34,40,41,42,44,50,52,58,61,62,67,70,74,74,75,75,76,77,77,77,81,83,87,90,90,90,96,98,99,99});
    param0.add(new int[]{-98,40,84,-8,42,-52,2,16,-68,-28,-54,88,8,-4,-98,-40,-32,-64,54,32,-76,-10,-48,-88,80,32,-2,-94,-26,-54,30,-56});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{9,35,62,78,55,29,55,36,77,89,73,31,53,94,22,23,87,96,7,15,71,61,25,61,99,34,1,87,21,14,58,69,61,49,54,7,89,52,78,97,11,78,27,37,56,19,20,21});
    List<Integer> param1 = new ArrayList<>();
    param1.add(18);
    param1.add(16);
    param1.add(35);
    param1.add(8);
    param1.add(17);
    param1.add(2);
    param1.add(30);
    param1.add(26);
    param1.add(17);
    param1.add(34);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("CHECK_IF_A_GIVEN_ARRAY_CAN_REPRESENT_PREORDER_TRAVERSAL_OF_BINARY_SEARCH_TREE_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_IF_A_GIVEN_ARRAY_CAN_REPRESENT_PREORDER_TRAVERSAL_OF_BINARY_SEARCH_TREE_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_IF_A_GIVEN_ARRAY_CAN_REPRESENT_PREORDER_TRAVERSAL_OF_BINARY_SEARCH_TREE_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

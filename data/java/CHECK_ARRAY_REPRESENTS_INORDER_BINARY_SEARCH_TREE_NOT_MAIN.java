public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,3,4,10,11,13,17,19,23,26,28,29,30,34,35,37,38,38,43,49,49,50,52,53,55,55,57,58,58,59,64,66,67,70,72,72,75,77,77,87,89,89,90,91,98,99,99,99});
    param0.add(new int[]{56,-94,-26,-52,58,-66,-52,-66,-94,44,38,-66,70,-70,-80,-78,-72,-60,-76,68,-50,32,-16,84,74,-42,98,-8,72,26,24,6,24,86,86,78,-92,80,32,-74,26,50,92,4,2,-34,-2,-18,-10});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{38,79,76,92,92});
    param0.add(new int[]{-42,-28,2,32,50,56,86,96,98});
    param0.add(new int[]{1,0,0,1,1,1,0,1,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{1,9,12,21,21,24,34,55,60,63,67,68,88,89,91,94,98,99});
    param0.add(new int[]{-96,96,-98,-42,-74,40,42,50,-46,-52,8,-46,48,88,-78,-72,-10,-20,98,-40,-18,36,4,46,52,28,-88,-28,-28,-86});
    param0.add(new int[]{0,0,0,0,1,1});
    param0.add(new int[]{66,12,48,82,33,77,99,98,14,92});
    List<Integer> param1 = new ArrayList<>();
    param1.add(46);
    param1.add(30);
    param1.add(13);
    param1.add(2);
    param1.add(7);
    param1.add(11);
    param1.add(9);
    param1.add(29);
    param1.add(3);
    param1.add(7);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("CHECK_ARRAY_REPRESENTS_INORDER_BINARY_SEARCH_TREE_NOT_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_ARRAY_REPRESENTS_INORDER_BINARY_SEARCH_TREE_NOT_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_ARRAY_REPRESENTS_INORDER_BINARY_SEARCH_TREE_NOT_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(5);
    param0.add(16);
    param0.add(8);
    param0.add(61);
    param0.add(59);
    param0.add(88);
    param0.add(67);
    param0.add(28);
    param0.add(58);
    param0.add(42);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i))) )/ (Math.abs(f_filled(param0.get(i))) + 0.0000001)) < 0.001)
	        {
                builder.append("FIND_SUM_NODES_GIVEN_PERFECT_BINARY_TREE_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_SUM_NODES_GIVEN_PERFECT_BINARY_TREE_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_SUM_NODES_GIVEN_PERFECT_BINARY_TREE_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

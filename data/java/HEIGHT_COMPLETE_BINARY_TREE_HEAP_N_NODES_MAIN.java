public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(65);
    param0.add(94);
    param0.add(52);
    param0.add(31);
    param0.add(9);
    param0.add(1);
    param0.add(41);
    param0.add(98);
    param0.add(45);
    param0.add(24);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("HEIGHT_COMPLETE_BINARY_TREE_HEAP_N_NODES," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("HEIGHT_COMPLETE_BINARY_TREE_HEAP_N_NODES," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("HEIGHT_COMPLETE_BINARY_TREE_HEAP_N_NODES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

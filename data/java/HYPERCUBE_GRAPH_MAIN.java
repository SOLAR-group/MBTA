public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(72);
    param0.add(28);
    param0.add(45);
    param0.add(41);
    param0.add(94);
    param0.add(97);
    param0.add(97);
    param0.add(36);
    param0.add(91);
    param0.add(84);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("HYPERCUBE_GRAPH_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("HYPERCUBE_GRAPH_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("HYPERCUBE_GRAPH_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
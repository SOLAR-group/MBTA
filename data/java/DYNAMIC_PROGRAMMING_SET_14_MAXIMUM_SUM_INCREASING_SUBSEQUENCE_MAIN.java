public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,5,7,12,23,31,31,45,47,60,67,70,84,85,91,96});
    param0.add(new int[]{-88,-38,-50,-14,36,-32,0,-8,-12,-62,-46,66,-46,-26,6,-44,14,-74,-84,52,-28});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{85,42,7,35,35,21,97,59,88,50,12,44,85,22,38,23,42,61,44,63,23,69,28,17,73,20,71,80,15,42,28,10,56,77,43});
    param0.add(new int[]{-92,-82,-82,-74,-72,-68,-68,-66,-60,-54,-42,-38,-36,-32,-30,-16,-14,-12,-10,14,24,28,34,34,38,42,44,52,70,72,80,84,86,94});
    param0.add(new int[]{0,1,1,1,1,1,0,1,1,0,1,0,0,0});
    param0.add(new int[]{33});
    param0.add(new int[]{76,86,46,-70,92,6,70,-66,64,46,86,-42,-46,-24,8,76,4,-96,-86,18,70,-72,-56,-88,-96,62,22,20,42});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{25,46,41,61,93,29,65,24,10,89,22,51,18,65,70,59,87,82,97,99,15,64,20,97,12,23,76});
    List<Integer> param1 = new ArrayList<>();
    param1.add(11);
    param1.add(18);
    param1.add(39);
    param1.add(26);
    param1.add(32);
    param1.add(8);
    param1.add(0);
    param1.add(21);
    param1.add(24);
    param1.add(20);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("DYNAMIC_PROGRAMMING_SET_14_MAXIMUM_SUM_INCREASING_SUBSEQUENCE," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("DYNAMIC_PROGRAMMING_SET_14_MAXIMUM_SUM_INCREASING_SUBSEQUENCE," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("DYNAMIC_PROGRAMMING_SET_14_MAXIMUM_SUM_INCREASING_SUBSEQUENCE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

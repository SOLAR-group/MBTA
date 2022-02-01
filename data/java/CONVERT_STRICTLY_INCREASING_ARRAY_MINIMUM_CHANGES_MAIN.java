public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,4,12,14,15,18,20,24,25,25,27,33,34,42,46,48,49,50,50,52,55,56,57,58,64,65,66,69,72,75,78,80,84,90,92,95,99});
    param0.add(new int[]{-56,6,-74,-30,34,40,-76,-10,-12,-86,-76,36,-72,82,38,68,28,84,98,-84,6,16,-46,8,2,-18,-50,4,-96,88,-84,-38,-82,-54});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1,1,1,1});
    param0.add(new int[]{68,79,87,44,3,99,80,6,46,67,72,40,11,18,73,48,18,72,10,38,3,39,26,76,47,15,85,69});
    param0.add(new int[]{-96,-94,-94,-74,-68,-60,-58,-56,-56,-52,-52,-50,-44,-40,-26,-24,-10,-8,-6,-2,2,2,12,14,20,24,26,30,38,40,52,52,62,62,68,70,74,76,80,82,90,92});
    param0.add(new int[]{1,1,1,0,1});
    param0.add(new int[]{1,5,11,20,24,28,29,31,54,58,63,65,66,71,77,80,83,92,93,93});
    param0.add(new int[]{-50,-46,-44,-90,2,-38,88,-26,60});
    param0.add(new int[]{1,1});
    param0.add(new int[]{2,1,19,26,65,47,3,65,9,12,84,59,74,59,30,83,73,67,13,5,64,83,81,92,80,14,58,84,92});
    List<Integer> param1 = new ArrayList<>();
    param1.add(21);
    param1.add(22);
    param1.add(6);
    param1.add(15);
    param1.add(31);
    param1.add(3);
    param1.add(12);
    param1.add(7);
    param1.add(1);
    param1.add(16);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("CONVERT_STRICTLY_INCREASING_ARRAY_MINIMUM_CHANGES_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CONVERT_STRICTLY_INCREASING_ARRAY_MINIMUM_CHANGES_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CONVERT_STRICTLY_INCREASING_ARRAY_MINIMUM_CHANGES_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
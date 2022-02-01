public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,1,4,7,7,9,12,20,45,53,58,63,65,65,86,98,98});
    param0.add(new int[]{46,-58,70,60,74,42,6,-26,78,32,14,-56,-48,86,-2,94,-44,-62,-50,-8,-4,-36,-62,-98,-98,-78,56,92,88});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{13,71,93,68,43,75,44,15,1,91,7,9,65,85,46,87,37,74,19,30,87,27,82,92,12,36,6,27,76,80,30,83,67,83,65,28,81,59,63,11,70});
    param0.add(new int[]{-96,-94,-92,-88,-84,-80,-74,-70,-62,-56,-48,-46,-40,-34,-32,-26,-22,-22,-12,-10,-8,-6,-2,0,2,4,6,18,18,30,34,34,38,38,40,48,54,56,60,84,88,88,90,94,96});
    param0.add(new int[]{1,1,1,1,1,0,1,0,0,1,1,0,1,1,0,1,0,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1});
    param0.add(new int[]{1,1,5,5,6,7,18,35,39,51,64,73,87,90,91,92});
    param0.add(new int[]{-54,8,-92,-28,72,54,-74,36,-10,54,-30,-16,-72,-32,-92,38,-76,-76,-50,-92,48});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{47,57,72,40,53,46,62,51,42,89,9,91,58,67,20,91,63,50,32,6,63,49,3,89,87,54,65,72,72,62,31,6,48,87,17,95,59,57});
    List<Integer> param1 = new ArrayList<>();
    param1.add(12);
    param1.add(27);
    param1.add(14);
    param1.add(20);
    param1.add(30);
    param1.add(22);
    param1.add(11);
    param1.add(19);
    param1.add(26);
    param1.add(30);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("MAXIMUM_PRODUCT_INCREASING_SUBSEQUENCE_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MAXIMUM_PRODUCT_INCREASING_SUBSEQUENCE_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MAXIMUM_PRODUCT_INCREASING_SUBSEQUENCE_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

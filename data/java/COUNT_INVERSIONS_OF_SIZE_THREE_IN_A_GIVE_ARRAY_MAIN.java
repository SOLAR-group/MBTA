public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{11,17,27,29,31,31,32,44,45,93});
    param0.add(new int[]{-48,-10,-44,-94,50,-24,30,72,-6,56,94,-44,-96,-52,-2,68,-52,30,98,0,12,-98,-94,48,-96,-86});
    param0.add(new int[]{0,0,0,1,1,1,1,1,1});
    param0.add(new int[]{78,82,51,92,88,95});
    param0.add(new int[]{-98,-96,-84,-72,-70,-62,-62,-58,-56,-54,-52,-52,-52,-50,-40,-40,-38,-36,-34,-26,-26,-22,-22,-20,-12,-8,-2,4,14,14,18,22,28,32,34,34,42,44,54,58,60,64,74,80,88,90,92,94,96});
    param0.add(new int[]{1,0,0,0});
    param0.add(new int[]{2,3,5,5,5,7,7,15,16,21,29,29,35,39,39,40,42,44,46,48,48,52,52,52,54,55,57,62,67,67,67,70,71,71,76,78,79,87,94,96});
    param0.add(new int[]{-60,-42,20,52,-54,40,56});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{98,81,23,71,82,31,15,21,4,68,68,22,77,83,22,9,10,56});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(15);
    param1.add(6);
    param1.add(3);
    param1.add(47);
    param1.add(3);
    param1.add(39);
    param1.add(6);
    param1.add(37);
    param1.add(13);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("COUNT_INVERSIONS_OF_SIZE_THREE_IN_A_GIVE_ARRAY," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_INVERSIONS_OF_SIZE_THREE_IN_A_GIVE_ARRAY," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_INVERSIONS_OF_SIZE_THREE_IN_A_GIVE_ARRAY," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

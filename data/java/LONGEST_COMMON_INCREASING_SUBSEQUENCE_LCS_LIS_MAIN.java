public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,7,9,35,43,51,51,66,88});
    param0.add(new int[]{-52,52,-92,-46,-94,30,-36,18,-98,22,-36,96,-88,-50,50});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{5,74,29});
    param0.add(new int[]{-84,-74,-70,-62,-56,-56,-52,-2,6,24,28,44,44,52});
    param0.add(new int[]{0,0,0,1,0,1,0,0,1,1,1,1,0,0,1,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0});
    param0.add(new int[]{3,4,4,7,15,15,16,22,32,32,37,39,39,41,43,46,47,47,49,75,79,80,86,88,93});
    param0.add(new int[]{70,-64,0,52,32,-98,38,-8,34,70,98,58,-48,-60,-28,-22,-72,82,-98,-36});
    param0.add(new int[]{0,0,1,1,1,1,1,1});
    param0.add(new int[]{46,87,98});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(7);
    param1.add(36);
    param1.add(1);
    param1.add(8);
    param1.add(17);
    param1.add(19);
    param1.add(16);
    param1.add(7);
    param1.add(2);
    List<int [ ]> param2 = new ArrayList<>();
    param2.add(new int[]{10,21,38,50,65,67,87,93,99});
    param2.add(new int[]{-58,40,56,-62,-92,-94,40,18,-2,-76,-78,-14,44,84,4});
    param2.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param2.add(new int[]{57,33,48});
    param2.add(new int[]{-98,-96,-88,-66,-32,-26,-24,-20,-4,20,48,74,90,96});
    param2.add(new int[]{1,0,1,1,0,0,0,0,1,1,1,0,1,0,0,0,0,1,0,0,0,0,1,1,1,1,1,1,1,0});
    param2.add(new int[]{9,12,15,20,22,27,28,28,30,31,35,39,47,58,58,60,73,74,76,78,80,86,95,96,98});
    param2.add(new int[]{-18,88,-40,-52,30,-10,-18,-56,84,-22,-64,80,-14,-64,40,92,48,-8,24,82});
    param2.add(new int[]{0,1,1,1,1,1,1,1});
    param2.add(new int[]{67,31,54});
    List<Integer> param3 = new ArrayList<>();
    param3.add(8);
    param3.add(10);
    param3.add(22);
    param3.add(1);
    param3.add(12);
    param3.add(15);
    param3.add(14);
    param3.add(12);
    param3.add(7);
    param3.add(2);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)))
	        {
                builder.append("LONGEST_COMMON_INCREASING_SUBSEQUENCE_LCS_LIS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("LONGEST_COMMON_INCREASING_SUBSEQUENCE_LCS_LIS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("LONGEST_COMMON_INCREASING_SUBSEQUENCE_LCS_LIS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
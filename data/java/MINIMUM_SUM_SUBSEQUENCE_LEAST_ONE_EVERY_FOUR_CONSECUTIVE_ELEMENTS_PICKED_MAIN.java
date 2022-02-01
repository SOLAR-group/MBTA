public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,7,11,12,13,14,18,20,22,26,28,29,31,32,33,35,38,38,40,40,41,42,43,44,45,53,54,54,59,62,69,72,74,75,75,76,79,83,84,89,91,96,97,98,99,99});
    param0.add(new int[]{50,-22,90,-40,46,86,50,44,12,-42,-58,6,52,-16,4,46,44,0,-64,78,-14,-80,30,-66,78,24,28,10,-72,-44,-28,-32,-30,94,-22,26,16,20,-52,-16,-80,2,-56,-70,-76,60,62});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{63,18,13,2,1,94,11,49,82,97,75,98,25,20,96,82,60,94,24,15,79,48,40,60,9,62,24,69,31,78,34,83,22,88});
    param0.add(new int[]{-74,16,96});
    param0.add(new int[]{0,0,1,0,1,1});
    param0.add(new int[]{2,5,6,8,10,16,18,19,20,21,24,30,34,36,39,42,52,53,54,55,56,57,70,71,72,73,75,75,77,78,82,85,87,88,89,91});
    param0.add(new int[]{-40,12,-86,-54,-68,32,10,-24,-46,54,-64,20,22,88,62,-4,-2,-8,-32,88,-4,38,4,86,82,-16,-76,-44,54,-24,-92,74,50,-52,52});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{4,53,96,86,69,81,86,95,80,43,25,66,24,72});
    List<Integer> param1 = new ArrayList<>();
    param1.add(30);
    param1.add(40);
    param1.add(14);
    param1.add(33);
    param1.add(1);
    param1.add(5);
    param1.add(25);
    param1.add(22);
    param1.add(20);
    param1.add(12);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("MINIMUM_SUM_SUBSEQUENCE_LEAST_ONE_EVERY_FOUR_CONSECUTIVE_ELEMENTS_PICKED_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MINIMUM_SUM_SUBSEQUENCE_LEAST_ONE_EVERY_FOUR_CONSECUTIVE_ELEMENTS_PICKED_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MINIMUM_SUM_SUBSEQUENCE_LEAST_ONE_EVERY_FOUR_CONSECUTIVE_ELEMENTS_PICKED_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
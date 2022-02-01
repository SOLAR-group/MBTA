public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,3,23,24,39,53,55,57,59,60,68,87});
    param0.add(new int[]{-76,46,50,90,-98,98,8,-14,24,-70,-86,-44,-88,-60,76,-16,-24,24,52,-94,-44,-76,60,-12,-70,10,90,70,64,-4,-88,28,62,74,-30,64,-78,-54,14,62,40,76,-26,26});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{61,48,24,48,26,49,90,88,55,4,49});
    param0.add(new int[]{-94,-80,-76,-72,-66,-62,-62,-60,-58,-48,-46,-42,-30,-20,-12,0,8,22,30,36,52,58,64,64,66,66,70,74,78,84,84,92,94,96});
    param0.add(new int[]{1,1,0,1,1,1,0,0,0,0,1,0,0,1,1,1,0,1,0,0,0,1,1,1,1,0,0,1,0,0,0,1,0,1});
    param0.add(new int[]{4,9,20,22,24,29,30,34,51,54,55,60,76,94,99});
    param0.add(new int[]{2,46,72,0,60,32,24,-12,-54,86,-78,8,10,22,98,4,-56,-94,52,30,16,-14,80,96,22,86,6,-34,92,-50,0,-6,16,32,58,-74,-16,-70,-88,70,-16});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{76,63,32,60,35,16,36,56,30,32,79,21,56,40,93,54,30,89,20,74,95,1,74,18,57,59,13});
    List<Integer> param1 = new ArrayList<>();
    param1.add(7);
    param1.add(37);
    param1.add(19);
    param1.add(6);
    param1.add(30);
    param1.add(33);
    param1.add(11);
    param1.add(22);
    param1.add(33);
    param1.add(26);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("DIFFERENCE_BETWEEN_HIGHEST_AND_LEAST_FREQUENCIES_IN_AN_ARRAY_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("DIFFERENCE_BETWEEN_HIGHEST_AND_LEAST_FREQUENCIES_IN_AN_ARRAY_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("DIFFERENCE_BETWEEN_HIGHEST_AND_LEAST_FREQUENCIES_IN_AN_ARRAY_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

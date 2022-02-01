public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{13,27,46,59,62,82,92});
    param0.add(new int[]{22,86,-64,-20,-56,-16,86,42,72,-90,10,42,56,8,50,24,-34,0,-78,64,18,20,-84,-22,90,-20,86,26,-54,0,90,-48,4,88,18,-64,-22,-74,48,-36,-86,-24,88,-64,68,62,92});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{55,89,56,85,26,4,91,91,3,77,63,59,76,90,1,94,44,70,8,54,3,91,29,95,28,75,20});
    param0.add(new int[]{-94,-84,-80,-78,-66,-62,-54,-52,-26,-8,-8,-6,4,4,8,14,26,58,60,62,62,76,78,86,92});
    param0.add(new int[]{1,0,0,0,1,0,0,1,1,0,0,0,1,1,0,0,1,0,0,1,0,0,0,1,1,1,1,1,1,1,0,0,0});
    param0.add(new int[]{1,2,7,7,9,14,23,29,31,31,35,35,38,41,44,49,49,50,51,54,55,56,57,63,67,69,73,79,79,80,86,88,93});
    param0.add(new int[]{78,-48,16,22,-16,34,56,-20,-62,-82,-74,-40,20,-24,-46,64,66,-76,58,-84,96,76,86,-32,46});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{73,76,25,59,40,85,90,38,13,97,93,99,45,7});
    List<Integer> param1 = new ArrayList<>();
    param1.add(6);
    param1.add(38);
    param1.add(15);
    param1.add(22);
    param1.add(18);
    param1.add(25);
    param1.add(24);
    param1.add(12);
    param1.add(29);
    param1.add(12);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("FIND_THE_MISSING_NUMBER_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_THE_MISSING_NUMBER_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_THE_MISSING_NUMBER_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
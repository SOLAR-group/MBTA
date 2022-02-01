public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,11,14,15,22,33,64,81,82,95});
    param0.add(new int[]{-42,2,84,18,60,84,-12,64,46,60,40,52,-62,-48,60,64,76,50,88,92,42,-82,44,-98,-4});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{50,6,43,82,99,1,20,7,52,18,52,18,45,75,58,48,49,70,69,19,49,35,45,14,52,33,9,31,86,70,77,70,91,56,76,69,68,31,21,72,78,83,76,1});
    param0.add(new int[]{-92,-76,-70,-62,-46,-36,-36,-32,-26,-8,-2,4,8,14,14,26,34,48,58,68,74,78,84,86});
    param0.add(new int[]{1,1,1,1,1,0,1,1,1,0,0,0,0,0,0,1,0,1,1,1,1,0,1,0,0,0,0,1,1,0,0,1,0,0,0,1,1,0,0,1,0,0,1,1,1,0,1});
    param0.add(new int[]{19,20,23,25,26,26,34,43,43,46,49,56,59,59,68,73,93,93});
    param0.add(new int[]{-82,-80,-68,-98,34,96,-72,22,-30,-92,74,-68,48,92,-26,-32,-8,72,84,-10,60,74,-98,78,-32,84,64,-56,94,24,72,40,-44,2,-18,34});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{40,32,38,69,56,28,79,29,63,72,4,46,25,32,12,83,59,59,32,1,56,15,62,3,6,85,29,45,88,84,52,62,89,33,48,23,85,54,46,78,7,12});
    List<Integer> param1 = new ArrayList<>();
    param1.add(9);
    param1.add(22);
    param1.add(22);
    param1.add(32);
    param1.add(21);
    param1.add(38);
    param1.add(10);
    param1.add(33);
    param1.add(24);
    param1.add(26);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("SUM_AREA_RECTANGLES_POSSIBLE_ARRAY_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SUM_AREA_RECTANGLES_POSSIBLE_ARRAY_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SUM_AREA_RECTANGLES_POSSIBLE_ARRAY_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

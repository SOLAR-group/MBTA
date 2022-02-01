public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,6,8,10,14,15,16,19,21,26,26,26,28,29,30,33,33,35,36,36,41,44,45,45,45,49,51,54,57,59,61,64,68,70,70,72,73,74,76,78,87,89,89,91,92,93,94,95,97});
    param0.add(new int[]{50,-58,-44,90,18,-26,-74,-46,96,32,72,46,-90,86,-10,82,-72,86,-64,-96,-12,-14,-36,16,38,56,54,10,74,-86,-64,-56,30,-50,46,4,88,-94,-4,-78,22,-78});
    param0.add(new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{80,24,41,90,24,95});
    param0.add(new int[]{-90,-88,-84,-82,-82,-80,-70,-66,-62,-60,-60,-48,-46,-44,-42,-20,-16,-4,18,26,28,32,36,46,60,62,68,72,78,98});
    param0.add(new int[]{0,0,0,1,0,0,1,1,0,1,0,1,1,0,0,1,1,1,0,0,0,1,1,0,0,1,0,0,0,1,0,1,1,1,0,0});
    param0.add(new int[]{3,9,14,16,16,26,30,31,32,37,42,42,43,49,51,56,64,69,76,77,77,79,85,88,89,91,94,95});
    param0.add(new int[]{-60,-90,-30,-42,80,-66,94,60,-68,-74,-50,42,-38,-34,-84,-58,30,98,-52,6,-60,-60});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1});
    param0.add(new int[]{24,80,16,31,5,31,66,1,13,77,88,40,34,15,90,46,8,26,39,52,22,33,3,30,49,51,69,50,39,59});
    List<Integer> param1 = new ArrayList<>();
    param1.add(25);
    param1.add(23);
    param1.add(10);
    param1.add(4);
    param1.add(21);
    param1.add(25);
    param1.add(19);
    param1.add(11);
    param1.add(18);
    param1.add(23);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("POSSIBLE_FORM_TRIANGLE_ARRAY_VALUES_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("POSSIBLE_FORM_TRIANGLE_ARRAY_VALUES_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("POSSIBLE_FORM_TRIANGLE_ARRAY_VALUES_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

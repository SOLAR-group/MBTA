public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,2,2,7,10,14,24,38,42,50,59,60,72,73,79,83,89});
    param0.add(new int[]{-48,98,96,-56,-2,58,52,-50,58,50,62,86,-26,-98,34,20,-28,56,-36});
    param0.add(new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{91,50,37});
    param0.add(new int[]{-80,-26,0,0,6,14,22,76,82,88,98});
    param0.add(new int[]{1,0});
    param0.add(new int[]{9,24,24,33,48,50,55,61,69,79,83});
    param0.add(new int[]{30,32,-82,-48,88,-24,74,2,90,98,68,82,32,-60,2,-94,18,14,46,50,-60,-74,-76,66,-76,-34,-20,82,-44,-62,34,48,-56,2,64,-78,-64,98,-10,-28,78,-42});
    param0.add(new int[]{0,0,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{38,74,99,75,44,75,24,70,78,74,60,59,34,27,7,23,19,95,4,35,38,22,46,1,44,20,52,1,96,57,5,76,49,1,37,35});
    List<Integer> param1 = new ArrayList<>();
    param1.add(9);
    param1.add(9);
    param1.add(20);
    param1.add(2);
    param1.add(10);
    param1.add(1);
    param1.add(8);
    param1.add(27);
    param1.add(6);
    param1.add(31);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("HOW_TO_CHECK_IF_A_GIVEN_ARRAY_REPRESENTS_A_BINARY_HEAP_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("HOW_TO_CHECK_IF_A_GIVEN_ARRAY_REPRESENTS_A_BINARY_HEAP_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("HOW_TO_CHECK_IF_A_GIVEN_ARRAY_REPRESENTS_A_BINARY_HEAP_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
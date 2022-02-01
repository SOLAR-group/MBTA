public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{15,21,32,42,42,44,57,68,75,80,83,84});
    param0.add(new int[]{-60,-90,-88,-80,-86,18,54,56,84,42,-60,-90,52,-44,-62,-56,-16,28,22,-24,-36,-56,80,68,-16});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{87,43,74});
    param0.add(new int[]{-82,-66,-66,-62,-56,-52,-44,-42,-28,-22,-12,-6,-4,-2,18,26,26,28,42,42,56,58,78,90,92,94,96,96});
    param0.add(new int[]{0,1,1,1,1,1,0,1,1,1,1,0,0,1,0,0,1,0,1,1,1});
    param0.add(new int[]{6,9,14,17,22,31,32,33,36,39,42,43,46,46,46,47,49,53,60,61,67,68,72,75,77,77,84,84,85,89,94,94,95});
    param0.add(new int[]{-88,82,-10,-10,68,-86,70,92,-54,-10,-56});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1,1,1});
    param0.add(new int[]{35,66,47,42,95,10,84,80,23,35,21,71,39,9,38,40,22,65});
    List<Integer> param1 = new ArrayList<>();
    param1.add(6);
    param1.add(23);
    param1.add(33);
    param1.add(2);
    param1.add(20);
    param1.add(19);
    param1.add(23);
    param1.add(7);
    param1.add(8);
    param1.add(14);
    List<Integer> param2 = new ArrayList<>();
    param2.add(11);
    param2.add(12);
    param2.add(32);
    param2.add(2);
    param2.add(21);
    param2.add(19);
    param2.add(19);
    param2.add(10);
    param2.add(8);
    param2.add(16);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("FIND_REPEATING_ELEMENT_SORTED_ARRAY_SIZE_N," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_REPEATING_ELEMENT_SORTED_ARRAY_SIZE_N," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_REPEATING_ELEMENT_SORTED_ARRAY_SIZE_N," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

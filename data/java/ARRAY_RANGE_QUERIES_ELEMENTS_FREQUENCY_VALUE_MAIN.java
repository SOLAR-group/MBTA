public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(0);
    param0.add(1);
    param0.add(3);
    param0.add(10);
    param0.add(2);
    param0.add(0);
    param0.add(14);
    param0.add(29);
    param0.add(31);
    param0.add(21);
    List<Integer> param1 = new ArrayList<>();
    param1.add(31);
    param1.add(25);
    param1.add(4);
    param1.add(15);
    param1.add(3);
    param1.add(6);
    param1.add(18);
    param1.add(33);
    param1.add(19);
    param1.add(32);
    List<int [ ]> param2 = new ArrayList<>();
    param2.add(new int[]{1,2,2,3,3,3,12,13,18,18,26,28,29,36,37,39,40,49,55,57,63,69,69,73,85,86,87,87,89,89,90,91,92,93,93,93,95,99});
    param2.add(new int[]{24,-62,2,1,94,56,-22,-70,-22,-34,-92,-18,56,2,60,38,-88,16,-28,30,-30,58,-80,94,6,56});
    param2.add(new int[]{0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param2.add(new int[]{84,13,81,40,87,82,50,30,90,80,81,70,14,54,72,93,78,27,61});
    param2.add(new int[]{-20,20,34,60,90});
    param2.add(new int[]{1,0,0,0,0,0,0,0,0,0});
    param2.add(new int[]{11,18,18,19,25,30,42,42,56,58,63,66,67,68,69,75,78,83,83});
    param2.add(new int[]{-24,-82,24,-84,94,2,-30,86,58,-56,-96,60,-38,76,94,74,-98,-84,-38,46,4,-84,-90,-28,-50,46,16,28,-14,-82,-64,42,64,-2,-40,96,60,2,-86,32,38,-66});
    param2.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param2.add(new int[]{2,91,42,85,97,92,24,39,63,89,31,59,51,89,72,62,26,92,75,4,6,13,20,95,22,30,52,60,37,27,49,15,67,26});
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("ARRAY_RANGE_QUERIES_ELEMENTS_FREQUENCY_VALUE_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("ARRAY_RANGE_QUERIES_ELEMENTS_FREQUENCY_VALUE_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("ARRAY_RANGE_QUERIES_ELEMENTS_FREQUENCY_VALUE_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

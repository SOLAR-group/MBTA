public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,7,20,22,23,31,33,36,47,61,63,63,71,74,82,91,95,99});
    param0.add(new int[]{-84,12,-42,-78,22,72,56,70,28,-72});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{29,41,4,62,77,74,30,2,14,90,93,10,78,36,66,22,48,89,36,73,70,23,90});
    param0.add(new int[]{-80,-72,-68,-66,-58,-50,-48,-32,-28,-24,-22,-18,0,2,6,10,12,14,14,18,24,24,24,28,28,28,34,38,42,42,46,46,46,58,80,82,82,84,84,86,88,90,92,96});
    param0.add(new int[]{1,1,0,1,0,1,0,0,1,0});
    param0.add(new int[]{26,36,58,64,69,72,79,82,82,87,89,90,95});
    param0.add(new int[]{-52,-40,98,40,42,-50,60,-64,-92,36,-88,72,-72,38,-80,-52,68,70,16,22,-30,-74,56,-80,62,-54,-32,-22,-86,-70,88,-76,-46,28,40,-2,-84,68,-98,-16,90,36,-38,-86,20,-40,82,98,54});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{36,62,58,24,99,12,46,3,4,40,54,97,48,94,98,7,17,5,3,36,3});
    List<Integer> param1 = new ArrayList<>();
    param1.add(15);
    param1.add(7);
    param1.add(16);
    param1.add(13);
    param1.add(36);
    param1.add(8);
    param1.add(8);
    param1.add(41);
    param1.add(10);
    param1.add(16);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("MINIMUM_INSERTIONS_SORT_ARRAY_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MINIMUM_INSERTIONS_SORT_ARRAY_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MINIMUM_INSERTIONS_SORT_ARRAY_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

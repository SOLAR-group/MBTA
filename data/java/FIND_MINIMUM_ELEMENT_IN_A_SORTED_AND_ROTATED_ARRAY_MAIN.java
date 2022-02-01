public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{16,22,50,64,68,79,84,88,89});
    param0.add(new int[]{88,-38,46,24,-52,-12,-90,28,18,14,-72,58,-98,28,-84,44,-42,-32,-22,-22,-82,-30,90,18,62,62,92,6,60,28,-90,92,82,62,98,-68,48,-74,-8,50,62,24,30,-86,98,-96,-98});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{26,66,94,28,38,31,92,66,81,8,36,64,80,32,48,71,72,54,61,60,89});
    param0.add(new int[]{-46,-26,-22,-14,46,62});
    param0.add(new int[]{0,1,1,1});
    param0.add(new int[]{14,81,87});
    param0.add(new int[]{4});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{3,41,40,53,82,9,90,43,90,59,37,21,92,98,36,99,35,67,24,29,40,31,46,12,29,8,93,67,44,83,71,29,22,32,33,11,44,97,84,44,8,10,31,50,22,8});
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
    param1.add(42);
    param1.add(28);
    param1.add(19);
    param1.add(4);
    param1.add(2);
    param1.add(1);
    param1.add(0);
    param1.add(15);
    param1.add(42);
    List<Integer> param2 = new ArrayList<>();
    param2.add(6);
    param2.add(31);
    param2.add(21);
    param2.add(17);
    param2.add(4);
    param2.add(2);
    param2.add(1);
    param2.add(0);
    param2.add(17);
    param2.add(31);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("FIND_MINIMUM_ELEMENT_IN_A_SORTED_AND_ROTATED_ARRAY_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_MINIMUM_ELEMENT_IN_A_SORTED_AND_ROTATED_ARRAY_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_MINIMUM_ELEMENT_IN_A_SORTED_AND_ROTATED_ARRAY_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

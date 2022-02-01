public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,3,8,8,12,14,23,25,25,27,27,29,40,42,49,52,52,54,56,57,61,68,74,77,81,82,83,84,85,85,85,87,87,88,88,90,92,96,96});
    param0.add(new int[]{-90,-34,26,-20,-12,-42,28,12,-6,58,-46,4,-30,-28,-14});
    param0.add(new int[]{0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{58,81,36,2,51,71,77,34,91,82,47,4,91,83,26,96,3,6});
    param0.add(new int[]{-92,-86,-82,-68,-60,-46,-40,-28,-26,-24,-2,-2,2,2,10,10,10,16,16,18,20,20,22,30,34,38,56,56,60,62,62,68,82,94,94,98});
    param0.add(new int[]{0,1,0});
    param0.add(new int[]{3,8,15,19,21,26,28,31,31,42,45,48,57,75,75,78,79,85,91,99});
    param0.add(new int[]{-38,42,40,-60,-16,-36,44,60,-86,-38,30,-22,-30,-96,-66});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1});
    param0.add(new int[]{95,38,91,75,43,95,23,36,51,4,38,53,52,58,55,3,19,22,84,9});
    List<Integer> param1 = new ArrayList<>();
    param1.add(27);
    param1.add(8);
    param1.add(7);
    param1.add(16);
    param1.add(20);
    param1.add(2);
    param1.add(17);
    param1.add(12);
    param1.add(13);
    param1.add(14);
    List<Integer> param2 = new ArrayList<>();
    param2.add(32);
    param2.add(14);
    param2.add(9);
    param2.add(12);
    param2.add(31);
    param2.add(2);
    param2.add(16);
    param2.add(10);
    param2.add(16);
    param2.add(19);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("MAXIMUM_NUMBER_CHOCOLATES_DISTRIBUTED_EQUALLY_AMONG_K_STUDENTS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MAXIMUM_NUMBER_CHOCOLATES_DISTRIBUTED_EQUALLY_AMONG_K_STUDENTS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MAXIMUM_NUMBER_CHOCOLATES_DISTRIBUTED_EQUALLY_AMONG_K_STUDENTS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

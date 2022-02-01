public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,4,18,22,28,34,35,39,44,45,67,73,75,79,81,83,89,93,96});
    param0.add(new int[]{52,-28});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{24});
    param0.add(new int[]{-68,14,36,62});
    param0.add(new int[]{1,0,1,1,1,1,1,0,0,0,1,0,0,0,1,1,0,1,0,1,1,0,1,0,0});
    param0.add(new int[]{7,10,19,22,24,28,29,39,46,55,62,66,68,73,74,76,83,84,85,99});
    param0.add(new int[]{-38,56,86,12,24,-90,-20,-46,38,92,-44,-74,54,50,46,50,-94,64,32,-84,70});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{61,89,8});
    List<Integer> param1 = new ArrayList<>();
    param1.add(12);
    param1.add(1);
    param1.add(21);
    param1.add(0);
    param1.add(2);
    param1.add(12);
    param1.add(15);
    param1.add(14);
    param1.add(8);
    param1.add(2);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("FIND_A_ROTATION_WITH_MAXIMUM_HAMMING_DISTANCE," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_A_ROTATION_WITH_MAXIMUM_HAMMING_DISTANCE," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_A_ROTATION_WITH_MAXIMUM_HAMMING_DISTANCE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

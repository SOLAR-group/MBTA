public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,2,5,5,16,16,20,26,32,35,39,39,41,44,48,48,51,59,59,62,66,66,70,74,75,78,80,86,86,96});
    param0.add(new int[]{-76,80,-6,-2,50,72,84,-56,70,8,48,6,-24,-50,-72});
    param0.add(new int[]{0,0,0,0,0,1,1,1,1});
    param0.add(new int[]{74,65,84,71});
    param0.add(new int[]{-96,-92,-90,-86,-84,-76,-76,-62,-58,-54,-50,-50,-44,-42,-38,-34,-14,-8,6,12,24,38,40,50,62,84,86,92});
    param0.add(new int[]{1,1,0,0,0,1,1,1,0,0,1,1,0,1,0,1,0,0,0,1,1,1,1});
    param0.add(new int[]{6,10,14,14,16,19,23,23,25,26,29,34,42,42,43,45,47,49,50,51,51,56,59,65,69,72,75,78,79,80,82,82,82,84,85,91,98});
    param0.add(new int[]{-90,-2,22,-2,58,-2,96,38,36,-66,-98,22,-80,-32,22,0,-34,-16,82,76,12,84,66,8,32,18,-98,-10});
    param0.add(new int[]{0,0,0,1,1,1,1});
    param0.add(new int[]{85,59,22,52,93,14,42,71,69,15,52,78,35,61,92,90,70,48,47,72,74,46,22,74,83,32,14,24,18,27,18,68,29,31});
    List<Integer> param1 = new ArrayList<>();
    param1.add(17);
    param1.add(14);
    param1.add(8);
    param1.add(2);
    param1.add(19);
    param1.add(12);
    param1.add(31);
    param1.add(22);
    param1.add(3);
    param1.add(19);
    List<Integer> param2 = new ArrayList<>();
    param2.add(29);
    param2.add(9);
    param2.add(4);
    param2.add(3);
    param2.add(19);
    param2.add(17);
    param2.add(24);
    param2.add(16);
    param2.add(5);
    param2.add(33);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("LOWER_INSERTION_POINT," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("LOWER_INSERTION_POINT," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("LOWER_INSERTION_POINT," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

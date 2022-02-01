public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,2,3,4,6,6,7,9,10,13,16,23,30,32,36,42,42,43,44,47,48,48,49,52,52,53,55,56,58,59,60,60,63,67,68,68,74,75,76,80,81,81,83,83,86,87,91,92,97});
    param0.add(new int[]{-96,-46,-86,56,-72,50,18,8,50});
    param0.add(new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{19,10,49,40,34,21,63,51});
    param0.add(new int[]{-96,-96,-90,-88,-88,-84,-80,-76,-68,-64,-64,-52,-52,-52,-52,-50,-50,-48,-48,-40,-32,-26,-24,-22,-20,-14,-12,0,6,8,10,20,24,28,34,36,54,60,60,60,68,74,74,74,84,88,94});
    param0.add(new int[]{1,0,0,1,0,1,1,1,1,0,0,1,0,0,1,0,0,1,0,1,1,0,0,0,1,1,0,1,0,0,0});
    param0.add(new int[]{1,2,3,10,15,21,28,36,41,44,45,47,72,77,77,79,85});
    param0.add(new int[]{42,-84,42,36,-10,24,-62,60});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{2,21,42,92,65,62,75,43,81,17,92,86,37,63,27,97,24,61,85,49,84,7,14,19,60,55,68,79,8,12,75,12,92,79,42});
    List<Integer> param1 = new ArrayList<>();
    param1.add(47);
    param1.add(8);
    param1.add(14);
    param1.add(5);
    param1.add(27);
    param1.add(19);
    param1.add(15);
    param1.add(7);
    param1.add(35);
    param1.add(27);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("NON_REPEATING_ELEMENT," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("NON_REPEATING_ELEMENT," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("NON_REPEATING_ELEMENT," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

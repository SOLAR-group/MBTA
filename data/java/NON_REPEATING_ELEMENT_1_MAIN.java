public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{6,7,14,18,18,18,21,25,28,38,40,42,42,45,48,50,50,50,53,54,58,59,62,65,65,66,67,68,69,73,74,76,77,83,84,85,87});
    param0.add(new int[]{24,-84,86,-50,60,-36,92,70,84,40,-8,74,-24,-38,98,40,-78,-36,38,-22,-98,82,-22,80,-80,-62,16,-46,18,64,16,2,24,-92,-46,42,38,8,72,8,14,-68,18,16,-82,8,58,-2});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{59,77,13,49,90});
    param0.add(new int[]{-80,-76,-66,-60,-44,-42,-38,-36,-32,-30,-24,-18,-6,2,4,14,32,42,54,70,92,98});
    param0.add(new int[]{0,0,0,0,1,0,1,0,0,1,0,0,0,1,0,1,1,1,0,1,0,1,0,1,1,0,0,1,1,1,1,0,0,0,0,0,0,0});
    param0.add(new int[]{6,22,24,27,29,30,35,42,57,59,59,63,71,73,76,98});
    param0.add(new int[]{-82,-48,36});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{88,49,13,64,30,60,26,55,55,97,98,69,72,72,79,59,46,87,76,61,87,12,91,8,34,15,93,64,83,33,69,58,32,14,72,67,25,7,55,21,12,78,63});
    List<Integer> param1 = new ArrayList<>();
    param1.add(33);
    param1.add(25);
    param1.add(16);
    param1.add(2);
    param1.add(12);
    param1.add(33);
    param1.add(13);
    param1.add(1);
    param1.add(35);
    param1.add(24);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("NON_REPEATING_ELEMENT_1," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("NON_REPEATING_ELEMENT_1," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("NON_REPEATING_ELEMENT_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

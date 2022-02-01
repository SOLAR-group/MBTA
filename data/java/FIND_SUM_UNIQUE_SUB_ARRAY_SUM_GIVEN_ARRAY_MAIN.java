public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{7,24,34,35,36,40,49,51,53,74,78});
    param0.add(new int[]{-34,60,32});
    param0.add(new int[]{0});
    param0.add(new int[]{80,64,10,82,14,75,51,91,1,25,98,22,36,27,21,31,93,6,52,91,80,8,62,95,10,71,40,80,35,86,85,26,74,72,64,88,4,71,4,16});
    param0.add(new int[]{-94,-46,-36,-24,-22,0,10,14,34,34,90,92,98});
    param0.add(new int[]{1,0,1,0,1,1,1,1,1,1,1,0,1,0,0,0,1,0,0,0,0,0,1,1,0,1,1,1,1,1,1,0,0,0,1,0,1,0,1});
    param0.add(new int[]{19,20,20,24,25,33,43,47,57,61,61,64,65,71,72,73,75,82,90,93,95});
    param0.add(new int[]{-6,56,58,-36,70,-92,30,58,-40,98,80,-96,-4,-88,34,76,40,-32,-94,-26,8,72,-56,-96,-88,-24,36,14,-88,-32,90,4,-88,28,18});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{91,51,15,78,55,3,10,24,42,84,66,78,10,41,21,53,69,57,20,22,50,72,8,80,12,91,29,95,38,74,95,26,10,57,51,25,49,74,15,42,99,21,27});
    List<Integer> param1 = new ArrayList<>();
    param1.add(9);
    param1.add(2);
    param1.add(0);
    param1.add(31);
    param1.add(9);
    param1.add(21);
    param1.add(15);
    param1.add(24);
    param1.add(11);
    param1.add(36);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("FIND_SUM_UNIQUE_SUB_ARRAY_SUM_GIVEN_ARRAY," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_SUM_UNIQUE_SUB_ARRAY_SUM_GIVEN_ARRAY," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_SUM_UNIQUE_SUB_ARRAY_SUM_GIVEN_ARRAY," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

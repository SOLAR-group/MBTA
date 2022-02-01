public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,5,11,23,33,35,39,51,52,56,74,76,76,79,85,88,93,98});
    param0.add(new int[]{-42,76,-34,-74,16,4,88,-70,-88,-94,-24,4,-14,-56,56,-18,84,0,-48,-94,72,42,36,52,74,-84,-50,16,30});
    param0.add(new int[]{0,0,1,1,1,1});
    param0.add(new int[]{29,49,88,44,92,43,12,5,38,75,57,3,85,16,86,62,16,40,76,37,5,69,16,63,84,78,74,18,4,89,73,67,60});
    param0.add(new int[]{-98,-80,-50,-44,-42,-36,-36,-28,-10,-8,-4,-2,2,10,18,18,26,32,36,56,80,86,88,90});
    param0.add(new int[]{0,0,1,0,1,1,1,0,1,0,0,1,1,1,1,1});
    param0.add(new int[]{13,15,62,65,87});
    param0.add(new int[]{-50,58,78,28,4,18,-8,18,-88,-48,-26,-32,64,48,60,94,-92,48,-36,30,-80,-60,82,-62,32,-36,-76,-88,-60,22,-14,72,30});
    param0.add(new int[]{0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{25,17,58,40,53,73,23,77,38});
    List<Integer> param1 = new ArrayList<>();
    param1.add(16);
    param1.add(15);
    param1.add(5);
    param1.add(25);
    param1.add(16);
    param1.add(13);
    param1.add(3);
    param1.add(31);
    param1.add(9);
    param1.add(8);
    List<Integer> param2 = new ArrayList<>();
    param2.add(13);
    param2.add(28);
    param2.add(5);
    param2.add(18);
    param2.add(12);
    param2.add(14);
    param2.add(4);
    param2.add(17);
    param2.add(6);
    param2.add(6);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("CHOCOLATE_DISTRIBUTION_PROBLEM_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHOCOLATE_DISTRIBUTION_PROBLEM_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHOCOLATE_DISTRIBUTION_PROBLEM_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

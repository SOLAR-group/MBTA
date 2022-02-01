public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{9,10,10,12,17,18,23,32,41,44,47,50,59,69,69,75,82,84,87,89,97,99});
    param0.add(new int[]{6,6,60,40,32,-70,-92,88,10,-8,-54,4,16,8,-44,80,-70,36,36,-74,-94,18,-64,-66,-46,0,-54,-84,16,-88,-34,-24,92,84,62});
    param0.add(new int[]{0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{2,67,50,8,20,42,37,69,86,74,85,96,78,89,91});
    param0.add(new int[]{-68,-52,-14,-2,18,22,30,34,64,64,70});
    param0.add(new int[]{1,1,0,0,0,1,0,0,1,1,1,1,1,0,0,1,1,0,1,1,0,1,0,0,1,1,0,1});
    param0.add(new int[]{4,17,19,28,29,30,30,30,35,36,36,38,40,40,42,43,45,51,55,57,58,59,64,65,66,82,84,85,87,91,92,94,98,98});
    param0.add(new int[]{52,88,-40,60,30,8,-96,66,-96,-28,-56,-14,76,-92,56,58,64,-60,-90,26,64,-2,54,-24,54,-46,-44});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{82,14,51,12,5,15,50,88,91,82,16,98,23,58,86,91,30,81,7,73,67,47,10,50,43,31,19,2,22});
    List<Integer> param1 = new ArrayList<>();
    param1.add(20);
    param1.add(34);
    param1.add(13);
    param1.add(8);
    param1.add(9);
    param1.add(21);
    param1.add(25);
    param1.add(14);
    param1.add(22);
    param1.add(18);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("MAXIMUM_PROFIT_BY_BUYING_AND_SELLING_A_SHARE_AT_MOST_TWICE_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MAXIMUM_PROFIT_BY_BUYING_AND_SELLING_A_SHARE_AT_MOST_TWICE_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MAXIMUM_PROFIT_BY_BUYING_AND_SELLING_A_SHARE_AT_MOST_TWICE_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

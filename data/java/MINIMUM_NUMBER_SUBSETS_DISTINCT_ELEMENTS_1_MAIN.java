public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,6,9,12,15,19,21,23,24,24,25,27,29,35,36,37,41,44,44,47,48,51,56,59,59,59,60,64,64,66,67,68,68,69,73,74,77,78,81,82,83,85,89,94,95,96,98,99});
    param0.add(new int[]{96,20,-40,74,-44,98,-24,92,58,-84,-76,-14,64,-2,-84,52,-8,38,-26,-10,-62,-30,-76,58});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{35,16,42,3,57,70,4,31,93,60,98,97,81,57,62,98,88,51,5,58,48,14,58,22,40,26,66,41,9,78,62,32,79,88,65,75,80,12,15,93,92,13,83,26});
    param0.add(new int[]{-62,-44,-36,-18,-16,-6,4,14,22,42,68,90});
    param0.add(new int[]{1,0,1,0,1,1,1,1,0,1,0,1,0,0,0,0});
    param0.add(new int[]{20,25,27,29,47,47,49,53,59,66,74,82,86,86,94,94,97});
    param0.add(new int[]{92,50,76,46,14,40,22});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{8,82,92,42,55,4,94,73,57,7,21,71,68,97});
    List<Integer> param1 = new ArrayList<>();
    param1.add(30);
    param1.add(20);
    param1.add(31);
    param1.add(37);
    param1.add(11);
    param1.add(12);
    param1.add(13);
    param1.add(3);
    param1.add(27);
    param1.add(12);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MINIMUM_NUMBER_SUBSETS_DISTINCT_ELEMENTS_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MINIMUM_NUMBER_SUBSETS_DISTINCT_ELEMENTS_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

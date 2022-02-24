public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{48,53,67,78,78,93,95});
    param0.add(new int[]{-2,52,18,70,32,88,-70,-32,72,30});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{98,84,13,61,58,90,45,89,45,80,3,5,57,86,40,80,60,51,60,73,67,10,52,56,60,36,34,60,75,63,23,86,51,68,86,13,71,86,99,6,42,2,39,82,16,5,23,47,12});
    param0.add(new int[]{-84,-56,68,78});
    param0.add(new int[]{0,0,1,0,0,1,1,0,0,0,1,0,1,1,1,1,0});
    param0.add(new int[]{1,2,3,9,12,12,16,17,18,19,20,21,21,26,29,42,44,45,48,48,48,54,54,55,60,63,63,64,64,67,67,68,69,74,78,78,79,83,95,95,95,96,97,99});
    param0.add(new int[]{40,-48,-14,64,-58,60,-42,-56,54,28,-16,-92,42});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{64,25,96});
    List<Integer> param1 = new ArrayList<>();
    param1.add(6);
    param1.add(8);
    param1.add(37);
    param1.add(31);
    param1.add(3);
    param1.add(14);
    param1.add(27);
    param1.add(9);
    param1.add(21);
    param1.add(1);
    List<Integer> param2 = new ArrayList<>();
    param2.add(4);
    param2.add(8);
    param2.add(31);
    param2.add(37);
    param2.add(3);
    param2.add(9);
    param2.add(42);
    param2.add(8);
    param2.add(19);
    param2.add(1);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MAXIMUM_SUM_PAIRS_SPECIFIC_DIFFERENCE," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MAXIMUM_SUM_PAIRS_SPECIFIC_DIFFERENCE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

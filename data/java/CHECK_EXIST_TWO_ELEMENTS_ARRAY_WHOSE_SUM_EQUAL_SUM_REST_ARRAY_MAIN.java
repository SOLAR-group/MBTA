public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2, 11, 5, 1, 4, 7});
    param0.add(new int[]{2, 4, 2, 1, 11, 15});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{69,6,24,30,75,37,61,76,19,18,90,9,49,24,58,97,18,85,24,93,71,98,92,59,75,75,75,70,35,58,50,1,64,66,33});
    param0.add(new int[]{-94,-94,-92,-74,-60,-58,-56,-44,-42,-40,-28,-14,2,4,14,20,24,28,40,42,42,66,78,78,80,82,96});
    param0.add(new int[]{1,0,1,1,0,0,1,1,0,0,1,1,0,1});
    param0.add(new int[]{21,26,26,27,61,62,96});
    param0.add(new int[]{-54,86,20,26});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{44,35,26,15,56,6,36,53,15,66,20,53,99,96,51,12,61,19,79,40,99,42,86,8,11,54,93,46,23,47,41,26,66,5,86,52,64,51,4,21,63,14,7,53,31,8,9,63});
    List<Integer> param1 = new ArrayList<>();
    param1.add(6);
    param1.add(6);
    param1.add(13);
    param1.add(18);
    param1.add(26);
    param1.add(10);
    param1.add(6);
    param1.add(3);
    param1.add(4);
    param1.add(31);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CHECK_EXIST_TWO_ELEMENTS_ARRAY_WHOSE_SUM_EQUAL_SUM_REST_ARRAY," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CHECK_EXIST_TWO_ELEMENTS_ARRAY_WHOSE_SUM_EQUAL_SUM_REST_ARRAY," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

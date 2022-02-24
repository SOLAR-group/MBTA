public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,6,9,16,16,21,36,41,58,60,62,73,77,81,95});
    param0.add(new int[]{-86,-72,-26,-34,18,-62,-66});
    param0.add(new int[]{1});
    param0.add(new int[]{16});
    param0.add(new int[]{-88,-80,-72,-68,-64,-26,4,14,16,22,30,32,60,74,82});
    param0.add(new int[]{0,0,1,1,1,0,1,0,0,0,1});
    param0.add(new int[]{3,9,10,12,17,23,27,29,42,44,59,61,71,76,78,82,84,84,89,90,93,93,97,97});
    param0.add(new int[]{68,-40,-46,-20,-64,90});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{99,17,94,43,97,17,11,58,75,94,37,22,54,31,41,4,55,69,92,80,45,97,16,33,36,17,43,82,81,64,22,65,85,44,47,14});
    List<Integer> param1 = new ArrayList<>();
    param1.add(12);
    param1.add(3);
    param1.add(0);
    param1.add(0);
    param1.add(11);
    param1.add(9);
    param1.add(15);
    param1.add(5);
    param1.add(15);
    param1.add(23);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_INDEX_PAIRS_EQUAL_ELEMENTS_ARRAY," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_INDEX_PAIRS_EQUAL_ELEMENTS_ARRAY," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

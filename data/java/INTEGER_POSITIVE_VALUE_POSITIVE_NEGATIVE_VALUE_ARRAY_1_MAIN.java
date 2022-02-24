public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{49,98});
    param0.add(new int[]{82,66,-68,24,-10});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{56,3,18,5,20,56,47,29,60,98,60,40,42,2,54,56,91,8,93,14,31,27,61,49,23,12,71});
    param0.add(new int[]{-94,-94,-92,-86,-50,-48,-6,8,28,40,44,58,62,72,94});
    param0.add(new int[]{0,0,1,0,1,0,1,1,1,0,1,0,0,0,1,0,0,1,0,0,0,1,1,1,1,1,1,1,1,0,1,1,1,0,1,1,1,0,0,0,1,1,1,0,1,0,1});
    param0.add(new int[]{16,56,56});
    param0.add(new int[]{74,-90,-92,30,-18,66,-66,22});
    param0.add(new int[]{0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{21,64,82,78,30,34,35});
    List<Integer> param1 = new ArrayList<>();
    param1.add(1);
    param1.add(2);
    param1.add(8);
    param1.add(25);
    param1.add(12);
    param1.add(36);
    param1.add(1);
    param1.add(5);
    param1.add(7);
    param1.add(5);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("INTEGER_POSITIVE_VALUE_POSITIVE_NEGATIVE_VALUE_ARRAY_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("INTEGER_POSITIVE_VALUE_POSITIVE_NEGATIVE_VALUE_ARRAY_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{6,7,15,42,47,54,56,59,59,64,68,70,71,75,91,93});
    param0.add(new int[]{6,7,15,42,47,56,54,59,59,64,68,71,70, 75,91,93});
    param0.add(new int[]{-92,-96,-68,-40,70});
    param0.add(new int[]{-92,-86,-68,-40,70});
    param0.add(new int[]{-3,-1,0,30,10,45,70,60});
    param0.add(new int[]{-3,-1,0,10,5,45,60,50});
    param0.add(new int[]{-3,-1,0,10,30,45,60,70});
    param0.add(new int[]{0,0,1});
    param0.add(new int[]{1,1,1});
    param0.add(new int[]{30,2,30,45});
    List<Integer> param1 = new ArrayList<>();
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    param1.add(0);
    List<Integer> param2 = new ArrayList<>();
    param2.add(15);
    param2.add(15);
    param2.add(4);
    param2.add(4);
    param2.add(7);
    param2.add(7);
    param2.add(7);
    param2.add(2);
    param2.add(2);
    param2.add(3);
    List<Integer> param3 = new ArrayList<>();
    param3.add(71);
    param3.add(71);
    param3.add(-96);
    param3.add(20);
    param3.add(0);
    param3.add(12);
    param3.add(18);
    param3.add(20);
    param3.add(17);
    param3.add(28);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("SEARCH_ALMOST_SORTED_ARRAY," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("SEARCH_ALMOST_SORTED_ARRAY," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

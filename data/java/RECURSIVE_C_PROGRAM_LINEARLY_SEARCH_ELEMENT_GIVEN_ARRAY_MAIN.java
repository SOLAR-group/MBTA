public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{10,74,5});
    param0.add(new int[]{-90,72,36,96,42,0,-66,5});
    param0.add(new int[]{0,5});
    param0.add(new int[]{99,70,67,5});
    param0.add(new int[]{-98,-98,-26,-26,-24,-18,-16,80,5});
    param0.add(new int[]{1,1,1,1,0,1,5});
    param0.add(new int[]{1,5,12,12,17,17,12,95,96,98,5});
    param0.add(new int[]{50,-70,-30,-54,6,-10,70,84,5});
    param0.add(new int[]{0,1,5});
    param0.add(new int[]{59,21,28,3,14,5});
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
    param2.add(2);
    param2.add(7);
    param2.add(1);
    param2.add(3);
    param2.add(8);
    param2.add(6);
    param2.add(10);
    param2.add(8);
    param2.add(2);
    param2.add(5);
    List<Integer> param3 = new ArrayList<>();
    param3.add(1);
    param3.add(96);
    param3.add(-1);
    param3.add(3);
    param3.add(80);
    param3.add(1);
    param3.add(12);
    param3.add(27);
    param3.add(14);
    param3.add(28);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("RECURSIVE_C_PROGRAM_LINEARLY_SEARCH_ELEMENT_GIVEN_ARRAY," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("RECURSIVE_C_PROGRAM_LINEARLY_SEARCH_ELEMENT_GIVEN_ARRAY," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{6,6,16,22,33,37,46,49,50,51,65,82,94});
    param0.add(new int[]{-4,-16,92,-28,-44,50,54,24,-28,-32,20,-94,-78,-20,26,90,-90,10,36,-52,60,-96,-64,-34,10,-12,86,78,32,-46,92,-66,18,-78,-28,14,-26,26,4,16,-96,86,-50});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{98,54,41,62,95,18,74,57,37,90,35,45,10,14,90,88,58,8,85,58,97,59,13,94,40,3,89,62,45,90,8,31,93,5,40,78,43,75,79,74,17,38,62});
    param0.add(new int[]{-88,-78,-76,-66,-56,-54,-54,-52,-34,-24,2,58,76,78});
    param0.add(new int[]{1,1,1,1,1,0,0,1,0,0,1,0,1,1,0});
    param0.add(new int[]{8,43,44,86});
    param0.add(new int[]{54,92,-46,6,-38});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{54,47,56,2,23,40,15,18,31,48,53,77,83,29,62,86});
    List<Integer> param1 = new ArrayList<>();
    param1.add(9);
    param1.add(25);
    param1.add(35);
    param1.add(40);
    param1.add(8);
    param1.add(12);
    param1.add(2);
    param1.add(4);
    param1.add(12);
    param1.add(9);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MAXIMUM_DIFFERENCE_BETWEEN_FREQUENCY_OF_TWO_ELEMENTS_SUCH_THAT_ELEMENT_HAVING_GREATER_FREQUENCY_IS_ALSO_GREATER," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MAXIMUM_DIFFERENCE_BETWEEN_FREQUENCY_OF_TWO_ELEMENTS_SUCH_THAT_ELEMENT_HAVING_GREATER_FREQUENCY_IS_ALSO_GREATER," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

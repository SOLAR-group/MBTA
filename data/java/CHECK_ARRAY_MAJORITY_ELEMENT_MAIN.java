public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{6,14,20,26,32,33,34,35,35,49,51,55,57,64,64,68,70,72,74,77,78,78,78,80,91,91,94});
    param0.add(new int[]{-14,-98,-36,68,-20,18,16,-50,66,98,12,-2,-68});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{29,96,94,67,87,65,27,21,60,49,73,85,9,17,72,3,73,69,95,3,30,88,54,94,40});
    param0.add(new int[]{-86,-80,-76,-76,-74,-62,-62,-56,-48,-36,-28,-22,-18,-18,-18,-16,-14,-12,-6,-2,10,14,18,24,32,32,40,40,40,42,46,48,50,56,56,56,68,76,84,94,96,96});
    param0.add(new int[]{0,1,1,1,0});
    param0.add(new int[]{5,8,9,12,14,16,19,29,32,32,37,38,38,39,40,41,43,45,47,51,53,58,58,63,64,65,69,83,84,86,92,93,96,98});
    param0.add(new int[]{-68,-50,-20,22,90,86,4,60,-88,82,-4,-54,36,-44,86});
    param0.add(new int[]{0,0,0,0,1,1,1,1});
    param0.add(new int[]{85,64,25,64,46,35,31,45,93,81,49,33,96,48,37});
    List<Integer> param1 = new ArrayList<>();
    param1.add(15);
    param1.add(11);
    param1.add(22);
    param1.add(15);
    param1.add(23);
    param1.add(3);
    param1.add(17);
    param1.add(13);
    param1.add(6);
    param1.add(13);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CHECK_ARRAY_MAJORITY_ELEMENT," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CHECK_ARRAY_MAJORITY_ELEMENT," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

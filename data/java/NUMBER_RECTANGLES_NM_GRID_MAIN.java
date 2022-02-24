public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(86);
    param0.add(33);
    param0.add(3);
    param0.add(91);
    param0.add(33);
    param0.add(13);
    param0.add(75);
    param0.add(58);
    param0.add(50);
    param0.add(4);
    List<Integer> param1 = new ArrayList<>();
    param1.add(70);
    param1.add(65);
    param1.add(5);
    param1.add(12);
    param1.add(27);
    param1.add(75);
    param1.add(36);
    param1.add(64);
    param1.add(51);
    param1.add(44);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("NUMBER_RECTANGLES_NM_GRID," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("NUMBER_RECTANGLES_NM_GRID," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

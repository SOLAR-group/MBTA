public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(1);
    param0.add(10);
    param0.add(0);
    param0.add(1);
    param0.add(82);
    param0.add(78);
    param0.add(13);
    param0.add(18);
    param0.add(42);
    param0.add(29);
    List<Integer> param1 = new ArrayList<>();
    param1.add(28);
    param1.add(0);
    param1.add(1);
    param1.add(1);
    param1.add(86);
    param1.add(86);
    param1.add(46);
    param1.add(29);
    param1.add(35);
    param1.add(17);
    List<Integer> param2 = new ArrayList<>();
    param2.add(2);
    param2.add(20);
    param2.add(0);
    param2.add(10);
    param2.add(19);
    param2.add(11);
    param2.add(33);
    param2.add(95);
    param2.add(25);
    param2.add(45);
    List<Integer> param3 = new ArrayList<>();
    param3.add(56);
    param3.add(0);
    param3.add(17);
    param3.add(10);
    param3.add(4);
    param3.add(6);
    param3.add(33);
    param3.add(12);
    param3.add(36);
    param3.add(35);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CHECK_LINE_PASSES_ORIGIN," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CHECK_LINE_PASSES_ORIGIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

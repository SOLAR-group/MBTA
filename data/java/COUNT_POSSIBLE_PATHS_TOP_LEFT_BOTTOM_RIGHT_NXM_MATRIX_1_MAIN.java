public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(79);
    param0.add(95);
    param0.add(15);
    param0.add(71);
    param0.add(16);
    param0.add(91);
    param0.add(10);
    param0.add(98);
    param0.add(30);
    param0.add(58);
    List<Integer> param1 = new ArrayList<>();
    param1.add(16);
    param1.add(62);
    param1.add(9);
    param1.add(18);
    param1.add(85);
    param1.add(52);
    param1.add(91);
    param1.add(81);
    param1.add(42);
    param1.add(69);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_POSSIBLE_PATHS_TOP_LEFT_BOTTOM_RIGHT_NXM_MATRIX_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_POSSIBLE_PATHS_TOP_LEFT_BOTTOM_RIGHT_NXM_MATRIX_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(58);
    param0.add(37);
    param0.add(56);
    param0.add(22);
    param0.add(77);
    param0.add(34);
    param0.add(74);
    param0.add(37);
    param0.add(21);
    param0.add(75);
    List<Integer> param1 = new ArrayList<>();
    param1.add(39);
    param1.add(49);
    param1.add(52);
    param1.add(43);
    param1.add(12);
    param1.add(31);
    param1.add(54);
    param1.add(52);
    param1.add(37);
    param1.add(30);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PYTHON_PROGRAM_FIND_PERIMETER_CIRCUMFERENCE_SQUARE_RECTANGLE_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PYTHON_PROGRAM_FIND_PERIMETER_CIRCUMFERENCE_SQUARE_RECTANGLE_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(3);
    param0.add(19);
    param0.add(39);
    param0.add(89);
    param0.add(96);
    param0.add(68);
    param0.add(48);
    param0.add(5);
    param0.add(3);
    param0.add(4);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MAXIMUM_VALUE_CHOICE_EITHER_DIVIDING_CONSIDERING," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MAXIMUM_VALUE_CHOICE_EITHER_DIVIDING_CONSIDERING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

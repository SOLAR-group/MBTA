public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(47);
    param0.add(57);
    param0.add(55);
    param0.add(11);
    param0.add(55);
    param0.add(63);
    param0.add(64);
    param0.add(28);
    param0.add(49);
    param0.add(48);
    List<Integer> param1 = new ArrayList<>();
    param1.add(30);
    param1.add(16);
    param1.add(63);
    param1.add(23);
    param1.add(49);
    param1.add(64);
    param1.add(98);
    param1.add(30);
    param1.add(61);
    param1.add(64);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_ENTRIES_EQUAL_TO_X_IN_A_SPECIAL_MATRIX," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_ENTRIES_EQUAL_TO_X_IN_A_SPECIAL_MATRIX," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(57);
    param0.add(96);
    param0.add(14);
    param0.add(64);
    param0.add(24);
    param0.add(74);
    param0.add(85);
    param0.add(27);
    param0.add(78);
    param0.add(1);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("SUM_K_TH_GROUP_ODD_POSITIVE_NUMBERS_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("SUM_K_TH_GROUP_ODD_POSITIVE_NUMBERS_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

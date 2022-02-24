public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(7);
    param0.add(47);
    param0.add(72);
    param0.add(66);
    param0.add(71);
    param0.add(56);
    param0.add(61);
    param0.add(68);
    param0.add(78);
    param0.add(22);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_STRINGS_ADJACENT_CHARACTERS_DIFFERENCE_ONE," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_STRINGS_ADJACENT_CHARACTERS_DIFFERENCE_ONE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

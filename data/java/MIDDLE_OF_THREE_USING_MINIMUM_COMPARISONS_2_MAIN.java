public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(48);
    param0.add(21);
    param0.add(71);
    param0.add(93);
    param0.add(3);
    param0.add(58);
    param0.add(88);
    param0.add(8);
    param0.add(17);
    param0.add(13);
    List<Integer> param1 = new ArrayList<>();
    param1.add(46);
    param1.add(7);
    param1.add(4);
    param1.add(34);
    param1.add(61);
    param1.add(78);
    param1.add(41);
    param1.add(84);
    param1.add(66);
    param1.add(3);
    List<Integer> param2 = new ArrayList<>();
    param2.add(38);
    param2.add(16);
    param2.add(31);
    param2.add(11);
    param2.add(32);
    param2.add(6);
    param2.add(66);
    param2.add(38);
    param2.add(27);
    param2.add(23);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_2," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_2," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

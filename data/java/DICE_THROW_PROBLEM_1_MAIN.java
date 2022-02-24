public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(57);
    param0.add(58);
    param0.add(38);
    param0.add(5);
    param0.add(91);
    param0.add(76);
    param0.add(38);
    param0.add(97);
    param0.add(97);
    param0.add(99);
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(45);
    param1.add(89);
    param1.add(39);
    param1.add(90);
    param1.add(56);
    param1.add(43);
    param1.add(26);
    param1.add(90);
    param1.add(2);
    List<Integer> param2 = new ArrayList<>();
    param2.add(33);
    param2.add(4);
    param2.add(9);
    param2.add(30);
    param2.add(47);
    param2.add(46);
    param2.add(84);
    param2.add(52);
    param2.add(90);
    param2.add(26);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("DICE_THROW_PROBLEM_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("DICE_THROW_PROBLEM_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

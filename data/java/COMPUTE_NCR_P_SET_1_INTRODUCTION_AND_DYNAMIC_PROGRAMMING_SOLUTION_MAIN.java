public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(82);
    param0.add(45);
    param0.add(44);
    param0.add(88);
    param0.add(90);
    param0.add(98);
    param0.add(80);
    param0.add(60);
    param0.add(52);
    param0.add(71);
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(24);
    param1.add(68);
    param1.add(24);
    param1.add(75);
    param1.add(55);
    param1.add(54);
    param1.add(75);
    param1.add(73);
    param1.add(26);
    List<Integer> param2 = new ArrayList<>();
    param2.add(94);
    param2.add(95);
    param2.add(61);
    param2.add(43);
    param2.add(57);
    param2.add(43);
    param2.add(88);
    param2.add(65);
    param2.add(86);
    param2.add(45);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

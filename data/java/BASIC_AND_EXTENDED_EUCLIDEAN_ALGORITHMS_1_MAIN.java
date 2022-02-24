public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(44);
    param0.add(33);
    param0.add(39);
    param0.add(52);
    param0.add(64);
    param0.add(45);
    param0.add(53);
    param0.add(86);
    param0.add(57);
    param0.add(11);
    List<Integer> param1 = new ArrayList<>();
    param1.add(17);
    param1.add(81);
    param1.add(77);
    param1.add(96);
    param1.add(48);
    param1.add(32);
    param1.add(88);
    param1.add(19);
    param1.add(67);
    param1.add(86);
    List<Integer> param2 = new ArrayList<>();
    param2.add(10);
    param2.add(67);
    param2.add(21);
    param2.add(23);
    param2.add(17);
    param2.add(89);
    param2.add(24);
    param2.add(29);
    param2.add(30);
    param2.add(96);
    List<Integer> param3 = new ArrayList<>();
    param3.add(65);
    param3.add(20);
    param3.add(34);
    param3.add(97);
    param3.add(33);
    param3.add(3);
    param3.add(74);
    param3.add(21);
    param3.add(32);
    param3.add(81);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("BASIC_AND_EXTENDED_EUCLIDEAN_ALGORITHMS_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("BASIC_AND_EXTENDED_EUCLIDEAN_ALGORITHMS_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

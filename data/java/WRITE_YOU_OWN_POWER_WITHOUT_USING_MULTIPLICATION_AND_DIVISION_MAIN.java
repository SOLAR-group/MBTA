public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(66);
    param0.add(82);
    param0.add(12);
    param0.add(55);
    param0.add(34);
    param0.add(22);
    param0.add(13);
    param0.add(57);
    param0.add(76);
    param0.add(76);
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
    param1.add(66);
    param1.add(38);
    param1.add(33);
    param1.add(26);
    param1.add(23);
    param1.add(98);
    param1.add(84);
    param1.add(94);
    param1.add(95);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("WRITE_YOU_OWN_POWER_WITHOUT_USING_MULTIPLICATION_AND_DIVISION," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("WRITE_YOU_OWN_POWER_WITHOUT_USING_MULTIPLICATION_AND_DIVISION," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

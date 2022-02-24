public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(11);
    param0.add(36);
    param0.add(71);
    param0.add(74);
    param0.add(66);
    param0.add(38);
    param0.add(2);
    param0.add(73);
    param0.add(79);
    param0.add(30);
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(69);
    param1.add(28);
    param1.add(1);
    param1.add(84);
    param1.add(14);
    param1.add(11);
    param1.add(87);
    param1.add(11);
    param1.add(55);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FIND_SUM_MODULO_K_FIRST_N_NATURAL_NUMBER," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FIND_SUM_MODULO_K_FIRST_N_NATURAL_NUMBER," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

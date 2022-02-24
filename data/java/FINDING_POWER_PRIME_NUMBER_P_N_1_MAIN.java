public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(76);
    param0.add(77);
    param0.add(9);
    param0.add(59);
    param0.add(8);
    param0.add(97);
    param0.add(78);
    param0.add(41);
    param0.add(72);
    param0.add(71);
    List<Integer> param1 = new ArrayList<>();
    param1.add(43);
    param1.add(91);
    param1.add(42);
    param1.add(67);
    param1.add(52);
    param1.add(8);
    param1.add(24);
    param1.add(88);
    param1.add(61);
    param1.add(28);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FINDING_POWER_PRIME_NUMBER_P_N_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FINDING_POWER_PRIME_NUMBER_P_N_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

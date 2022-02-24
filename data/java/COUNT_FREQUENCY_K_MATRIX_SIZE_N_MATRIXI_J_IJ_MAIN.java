public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(90);
    param0.add(86);
    param0.add(92);
    param0.add(72);
    param0.add(25);
    param0.add(11);
    param0.add(94);
    param0.add(91);
    param0.add(66);
    param0.add(34);
    List<Integer> param1 = new ArrayList<>();
    param1.add(74);
    param1.add(36);
    param1.add(38);
    param1.add(71);
    param1.add(57);
    param1.add(53);
    param1.add(80);
    param1.add(75);
    param1.add(58);
    param1.add(88);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_FREQUENCY_K_MATRIX_SIZE_N_MATRIXI_J_IJ," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_FREQUENCY_K_MATRIX_SIZE_N_MATRIXI_J_IJ," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

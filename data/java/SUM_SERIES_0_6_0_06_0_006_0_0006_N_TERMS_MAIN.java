public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(1);
    param0.add(2);
    param0.add(3);
    param0.add(4);
    param0.add(5);
    param0.add(74);
    param0.add(77);
    param0.add(67);
    param0.add(9);
    param0.add(12);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("SUM_SERIES_0_6_0_06_0_006_0_0006_N_TERMS," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("SUM_SERIES_0_6_0_06_0_006_0_0006_N_TERMS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

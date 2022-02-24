public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("LPWsaI");
    param0.add("9037515104");
    param0.add("00100010010111");
    param0.add("SbwipuE");
    param0.add("574314109");
    param0.add("1101");
    param0.add("f");
    param0.add("068");
    param0.add("000011001");
    param0.add("BWbUtIkC");
    List<Integer> param1 = new ArrayList<>();
    param1.add(41);
    param1.add(72);
    param1.add(95);
    param1.add(27);
    param1.add(5);
    param1.add(70);
    param1.add(91);
    param1.add(50);
    param1.add(38);
    param1.add(79);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("C_PROGRAM_CONCATENATE_STRING_GIVEN_NUMBER_TIMES," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("C_PROGRAM_CONCATENATE_STRING_GIVEN_NUMBER_TIMES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("ncYltuhSxEfG");
    param0.add("26615541616459");
    param0.add("0101");
    param0.add("hK");
    param0.add("422162103899");
    param0.add("0010");
    param0.add("zfcSh");
    param0.add("92");
    param0.add("0");
    param0.add("v");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FORM_SMALLEST_NUMBER_USING_ONE_SWAP_OPERATION," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FORM_SMALLEST_NUMBER_USING_ONE_SWAP_OPERATION," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

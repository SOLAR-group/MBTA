public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("8955795758");
    param0.add("0515");
    param0.add("101");
    param0.add("14");
    param0.add("0");
    param0.add("9250318");
    param0.add("336");
    param0.add("68143991");
    param0.add("11010001");
    param0.add("zsS");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CHECK_WHETHER_LARGE_NUMBER_DIVISIBLE_7," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CHECK_WHETHER_LARGE_NUMBER_DIVISIBLE_7," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

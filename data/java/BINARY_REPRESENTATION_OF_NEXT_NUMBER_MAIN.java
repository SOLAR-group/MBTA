public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("DXh");
    param0.add("48703586411816");
    param0.add("0001");
    param0.add("yWg WvjNKS");
    param0.add("8408568459");
    param0.add("01");
    param0.add("DFECZ CWtN");
    param0.add("37742236");
    param0.add("001101");
    param0.add("LDxERLmYn");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("BINARY_REPRESENTATION_OF_NEXT_NUMBER," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("BINARY_REPRESENTATION_OF_NEXT_NUMBER," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

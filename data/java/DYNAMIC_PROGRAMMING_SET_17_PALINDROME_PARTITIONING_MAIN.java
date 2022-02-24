public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("ydYdV");
    param0.add("4446057");
    param0.add("0111");
    param0.add("keEj");
    param0.add("642861576557");
    param0.add("11111000101");
    param0.add("ram");
    param0.add("09773261");
    param0.add("1");
    param0.add("AVBEKClFdj");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("DYNAMIC_PROGRAMMING_SET_17_PALINDROME_PARTITIONING," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("DYNAMIC_PROGRAMMING_SET_17_PALINDROME_PARTITIONING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

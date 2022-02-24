public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(98L);
    param0.add(8L);
    param0.add(78L);
    param0.add(65L);
    param0.add(55L);
    param0.add(10L);
    param0.add(10L);
    param0.add(37L);
    param0.add(39L);
    param0.add(15L);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FIND_LARGEST_PRIME_FACTOR_NUMBER," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FIND_LARGEST_PRIME_FACTOR_NUMBER," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(18);
    param0.add(54);
    param0.add(67);
    param0.add(17);
    param0.add(47);
    param0.add(99);
    param0.add(26);
    param0.add(93);
    param0.add(57);
    param0.add(98);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

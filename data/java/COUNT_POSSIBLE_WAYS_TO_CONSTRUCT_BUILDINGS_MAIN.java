public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(17);
    param0.add(66);
    param0.add(53);
    param0.add(97);
    param0.add(34);
    param0.add(54);
    param0.add(9);
    param0.add(99);
    param0.add(59);
    param0.add(87);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_POSSIBLE_WAYS_TO_CONSTRUCT_BUILDINGS," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_POSSIBLE_WAYS_TO_CONSTRUCT_BUILDINGS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

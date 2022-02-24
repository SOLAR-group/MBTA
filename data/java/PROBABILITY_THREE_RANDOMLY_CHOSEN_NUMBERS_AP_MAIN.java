public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(46);
    param0.add(5);
    param0.add(44);
    param0.add(15);
    param0.add(72);
    param0.add(2);
    param0.add(86);
    param0.add(17);
    param0.add(30);
    param0.add(42);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PROBABILITY_THREE_RANDOMLY_CHOSEN_NUMBERS_AP," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PROBABILITY_THREE_RANDOMLY_CHOSEN_NUMBERS_AP," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

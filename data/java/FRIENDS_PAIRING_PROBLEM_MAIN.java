public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(99);
    param0.add(62);
    param0.add(87);
    param0.add(87);
    param0.add(61);
    param0.add(88);
    param0.add(73);
    param0.add(62);
    param0.add(98);
    param0.add(57);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FRIENDS_PAIRING_PROBLEM," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FRIENDS_PAIRING_PROBLEM," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

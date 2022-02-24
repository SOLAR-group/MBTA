public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("()");
    param0.add("))((");
    param0.add("())");
    param0.add("(()");
    param0.add("(()()())");
    param0.add("))())(()(())");
    param0.add("))(())((");
    param0.add("49");
    param0.add("00001111");
    param0.add("KDahByG ");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COST_BALANCE_PARANTHESES," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COST_BALANCE_PARANTHESES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

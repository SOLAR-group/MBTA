public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("ggbsMvMZcMOVd");
    param0.add("384292670");
    param0.add("10000100");
    param0.add("fdHME");
    param0.add("09198832");
    param0.add("0011111011");
    param0.add("SnXwRS");
    param0.add("071");
    param0.add("01101");
    param0.add("xwmqxgBa");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("REMOVE_BRACKETS_ALGEBRAIC_STRING_CONTAINING_OPERATORS," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("REMOVE_BRACKETS_ALGEBRAIC_STRING_CONTAINING_OPERATORS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

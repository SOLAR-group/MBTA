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
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("COST_BALANCE_PARANTHESES_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COST_BALANCE_PARANTHESES_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COST_BALANCE_PARANTHESES_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

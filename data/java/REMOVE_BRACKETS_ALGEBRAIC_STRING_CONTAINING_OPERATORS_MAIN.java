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
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)).equals(f_gold(param0.get(i))))
	        {
                builder.append("REMOVE_BRACKETS_ALGEBRAIC_STRING_CONTAINING_OPERATORS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("REMOVE_BRACKETS_ALGEBRAIC_STRING_CONTAINING_OPERATORS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("REMOVE_BRACKETS_ALGEBRAIC_STRING_CONTAINING_OPERATORS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("(())))(");
    param0.add("))");
    param0.add("((");
    param0.add("))(()(()()(");
    param0.add(")((()(()");
    param0.add("))(()");
    param0.add("()))");
    param0.add("()");
    param0.add("1100110");
    param0.add("dhfSnebD");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("FIND_EQUAL_POINT_STRING_BRACKETS," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_EQUAL_POINT_STRING_BRACKETS," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_EQUAL_POINT_STRING_BRACKETS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

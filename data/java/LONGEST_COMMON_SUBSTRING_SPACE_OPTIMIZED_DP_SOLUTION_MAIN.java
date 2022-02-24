public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("GeeksforGeeks");
    param0.add("333940");
    param0.add("1000");
    param0.add("Facebook");
    param0.add("2684247");
    param0.add("111");
    param0.add("abcdxyz");
    param0.add("625330958530");
    param0.add("01011000001111");
    param0.add("KXm");
    List<String> param1 = new ArrayList<>();
    param1.add("GeeksQuiz");
    param1.add("390");
    param1.add("0");
    param1.add("nice book");
    param1.add("1");
    param1.add("10");
    param1.add("xyzabcd");
    param1.add("412511");
    param1.add("1001010001");
    param1.add("gF");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("LONGEST_COMMON_SUBSTRING_SPACE_OPTIMIZED_DP_SOLUTION," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("LONGEST_COMMON_SUBSTRING_SPACE_OPTIMIZED_DP_SOLUTION," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

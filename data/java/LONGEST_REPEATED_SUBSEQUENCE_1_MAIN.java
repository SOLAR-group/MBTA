public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("qnQxjoRx");
    param0.add("27473733400077");
    param0.add("000010111111");
    param0.add("TNVwgrWSLu");
    param0.add("9537");
    param0.add("1100");
    param0.add("lYcoiQfzN");
    param0.add("52");
    param0.add("00100001100");
    param0.add("Rkxe");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("LONGEST_REPEATED_SUBSEQUENCE_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("LONGEST_REPEATED_SUBSEQUENCE_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

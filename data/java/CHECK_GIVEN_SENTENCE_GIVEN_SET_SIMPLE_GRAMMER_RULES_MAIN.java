public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = Arrays.asList("I love cinema.", "The vertex is S.",
                         "I am single.", "My name is KG.",
                         "I lovE cinema.", "GeeksQuiz. is a quiz site.",
                         "I love Geeksquiz and Geeksforgeeks.",
                         " You are my friend.", "I love cinema", "Hello world !");

    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CHECK_GIVEN_SENTENCE_GIVEN_SET_SIMPLE_GRAMMER_RULES," + args[1] + "," + i + "," + f_gold(param0.get(i).toCharArray()) + "\n");
        } catch (Exception e) {
            builder.append("CHECK_GIVEN_SENTENCE_GIVEN_SET_SIMPLE_GRAMMER_RULES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

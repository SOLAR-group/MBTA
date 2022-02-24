public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("aadaa");
    param0.add("2674377254");
    param0.add("11");
    param0.add("0011000 ");
    param0.add("26382426486138");
    param0.add("111010111010");
    param0.add("abccba");
    param0.add("5191");
    param0.add("1110101101");
    param0.add("abcdecbe");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MINIMUM_CHARACTERS_ADDED_FRONT_MAKE_STRING_PALINDROME," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MINIMUM_CHARACTERS_ADDED_FRONT_MAKE_STRING_PALINDROME," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

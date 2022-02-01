public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("abccba");
    param0.add("2674377254");
    param0.add("11");
    param0.add("abcdecba");
    param0.add("26382426486138");
    param0.add("111010111010");
    param0.add("hUInqJXNdbfP");
    param0.add("5191");
    param0.add("1110101101");
    param0.add("NupSrU xz");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("CHECK_CHARACTERS_GIVEN_STRING_CAN_REARRANGED_FORM_PALINDROME_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_CHARACTERS_GIVEN_STRING_CAN_REARRANGED_FORM_PALINDROME_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_CHARACTERS_GIVEN_STRING_CAN_REARRANGED_FORM_PALINDROME_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

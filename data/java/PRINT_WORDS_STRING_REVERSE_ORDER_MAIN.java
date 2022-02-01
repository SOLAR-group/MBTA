public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("m Dm YZ");
    param0.add("65 48 57 71");
    param0.add("01 010");
    param0.add("mT vhByi");
    param0.add("19 44 9 1");
    param0.add("0");
    param0.add("z vUi  ");
    param0.add("7 591 36643 9 055");
    param0.add("01");
    param0.add("ti YGaijPY");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)).equals(f_gold(param0.get(i))))
	        {
                builder.append("PRINT_WORDS_STRING_REVERSE_ORDER_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PRINT_WORDS_STRING_REVERSE_ORDER_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PRINT_WORDS_STRING_REVERSE_ORDER_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

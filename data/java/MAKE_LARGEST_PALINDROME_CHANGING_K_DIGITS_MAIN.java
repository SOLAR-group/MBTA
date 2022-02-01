public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("wUJmbRlwogtFv");
    param0.add("43435");
    param0.add("43435");
    param0.add("12345");
    param0.add("5032");
    param0.add("0100000001101");
    param0.add("sBrbNQiRwQd");
    param0.add("7549384614");
    param0.add("10000001");
    param0.add("VqrTsaoD");
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(3);
    param1.add(1);
    param1.add(1);
    param1.add(3);
    param1.add(5);
    param1.add(4);
    param1.add(3);
    param1.add(4);
    param1.add(4);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)).equals(f_gold(param0.get(i),param1.get(i))))
	        {
                builder.append("MAKE_LARGEST_PALINDROME_CHANGING_K_DIGITS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MAKE_LARGEST_PALINDROME_CHANGING_K_DIGITS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MAKE_LARGEST_PALINDROME_CHANGING_K_DIGITS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

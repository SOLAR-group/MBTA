public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("YYGWgYrovdsh");
    param0.add("56109778");
    param0.add("101");
    param0.add("RxM");
    param0.add("187546405");
    param0.add("0110010");
    param0.add("wVODAmgvI");
    param0.add("56719");
    param0.add("10100011001100");
    param0.add("Wtpai");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("DYNAMIC_PROGRAMMING_SET_17_PALINDROME_PARTITIONING_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("DYNAMIC_PROGRAMMING_SET_17_PALINDROME_PARTITIONING_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("DYNAMIC_PROGRAMMING_SET_17_PALINDROME_PARTITIONING_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

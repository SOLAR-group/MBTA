public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("smnKL");
    param0.add("270083");
    param0.add("0");
    param0.add("kcZdsz");
    param0.add("483544224");
    param0.add("000011");
    param0.add("WysGCirMwKBzP");
    param0.add("3366");
    param0.add("110");
    param0.add("NlaMkpCjUgg");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("COUNT_CHARACTERS_STRING_DISTANCE_ENGLISH_ALPHABETS," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_CHARACTERS_STRING_DISTANCE_ENGLISH_ALPHABETS," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_CHARACTERS_STRING_DISTANCE_ENGLISH_ALPHABETS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("The quick brown fox jumps over the lazy dog ");
    param0.add("The quick brown fox jumps over the dog");
    param0.add("abcdefghijklmnopqrstuvwxyz");
    param0.add("AbcdefghijKlmnopqrstUVwxyz");
    param0.add("The quicK broWn fOX jumps over the laZYy dog ");
    param0.add("AbcdefghijKlmnopqrstVwxyz");
    param0.add("U");
    param0.add("397548458372");
    param0.add("11");
    param0.add("iwCiUFU r");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("PANGRAM_CHECKING_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PANGRAM_CHECKING_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PANGRAM_CHECKING_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

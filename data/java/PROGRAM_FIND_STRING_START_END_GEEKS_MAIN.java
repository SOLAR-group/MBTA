public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("geeksmanishgeeks");
    param0.add("shreyadhatwalia");
    param0.add("10000100");
    param0.add("abaa");
    param0.add("30645530");
    param0.add("0000011011001");
    param0.add("dkqEd");
    param0.add("48694119324654");
    param0.add("1101010010");
    param0.add("Ks");
    List<String> param1 = new ArrayList<>();
    param1.add("geeks");
    param1.add("abc");
    param1.add("100");
    param1.add("a");
    param1.add("30");
    param1.add("001");
    param1.add("d");
    param1.add("654");
    param1.add("11");
    param1.add("KsFLmngGGOmHKs");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("PROGRAM_FIND_STRING_START_END_GEEKS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PROGRAM_FIND_STRING_START_END_GEEKS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PROGRAM_FIND_STRING_START_END_GEEKS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

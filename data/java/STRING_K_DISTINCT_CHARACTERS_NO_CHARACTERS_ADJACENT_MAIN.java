public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(60);
    param0.add(56);
    param0.add(16);
    param0.add(42);
    param0.add(55);
    param0.add(64);
    param0.add(68);
    param0.add(88);
    param0.add(64);
    param0.add(42);
    List<Integer> param1 = new ArrayList<>();
    param1.add(71);
    param1.add(17);
    param1.add(16);
    param1.add(60);
    param1.add(56);
    param1.add(59);
    param1.add(24);
    param1.add(2);
    param1.add(94);
    param1.add(79);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)).equals(f_gold(param0.get(i),param1.get(i))))
	        {
                builder.append("STRING_K_DISTINCT_CHARACTERS_NO_CHARACTERS_ADJACENT," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("STRING_K_DISTINCT_CHARACTERS_NO_CHARACTERS_ADJACENT," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("STRING_K_DISTINCT_CHARACTERS_NO_CHARACTERS_ADJACENT," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(4);
    param0.add(2);
    param0.add(3);
    param0.add(5);
    param0.add(2);
    param0.add(3);
    param0.add(3);
    param0.add(1);
    param0.add(2);
    param0.add(2);
    List<String> param1 = new ArrayList<>();
    param1.add("aggayxysdfa");
    param1.add("55571659965107");
    param1.add("01011011100");
    param1.add("aggasdfa");
    param1.add("5710246551");
    param1.add("0100010");
    param1.add("aabcaaaa");
    param1.add("1219");
    param1.add("111000011");
    param1.add("wiC oD");
    List<String> param2 = new ArrayList<>();
    param2.add("aggajxaaasdfa");
    param2.add("390286654154");
    param2.add("0000110001000");
    param2.add("aggajasdfaxy");
    param2.add("79032504084062");
    param2.add("10100000");
    param2.add("baaabcd");
    param2.add("3337119582");
    param2.add("011");
    param2.add("csiuGOUwE");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

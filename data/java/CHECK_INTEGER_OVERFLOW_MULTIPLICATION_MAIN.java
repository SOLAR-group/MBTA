public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(37L);
    param0.add(Long.parseLong("10000000000"));
    param0.add(Long.parseLong("10000000000"));
    param0.add(Long.parseLong("999999999"));
    param0.add(39L);
    param0.add(92L);
    param0.add(14L);
    param0.add(19L);
    param0.add(14L);
    param0.add(88L);
    List<Long> param1 = new ArrayList<>();
    param1.add(80L);
    param1.add(Long.parseLong("-10000000000"));
    param1.add(Long.parseLong("10000000000"));
    param1.add(Long.parseLong("999999999"));
    param1.add(36L);
    param1.add(56L);
    param1.add(21L);
    param1.add(38L);
    param1.add(82L);
    param1.add(41L);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)).equals(f_gold(param0.get(i),param1.get(i))))
	        {
                builder.append("CHECK_INTEGER_OVERFLOW_MULTIPLICATION," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_INTEGER_OVERFLOW_MULTIPLICATION," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_INTEGER_OVERFLOW_MULTIPLICATION," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(79L);
    param0.add(61L);
    param0.add(39L);
    param0.add(39L);
    param0.add(61L);
    param0.add(86L);
    param0.add(7L);
    param0.add(86L);
    param0.add(86L);
    param0.add(11L);
    List<Long> param1 = new ArrayList<>();
    param1.add(84L);
    param1.add(29L);
    param1.add(77L);
    param1.add(65L);
    param1.add(78L);
    param1.add(73L);
    param1.add(92L);
    param1.add(50L);
    param1.add(63L);
    param1.add(2L);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("FIND_LAST_DIGIT_FACTORIAL_DIVIDES_FACTORIAL_B_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_LAST_DIGIT_FACTORIAL_DIVIDES_FACTORIAL_B_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_LAST_DIGIT_FACTORIAL_DIVIDES_FACTORIAL_B_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

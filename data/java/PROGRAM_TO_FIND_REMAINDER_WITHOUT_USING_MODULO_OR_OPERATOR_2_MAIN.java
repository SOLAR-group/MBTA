public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(70);
    param0.add(77);
    param0.add(77);
    param0.add(88);
    param0.add(96);
    param0.add(6);
    param0.add(79);
    param0.add(44);
    param0.add(26);
    param0.add(82);
    List<Integer> param1 = new ArrayList<>();
    param1.add(13);
    param1.add(3);
    param1.add(73);
    param1.add(54);
    param1.add(39);
    param1.add(10);
    param1.add(95);
    param1.add(32);
    param1.add(86);
    param1.add(91);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_2," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_2," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_2," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(34);
    param0.add(63);
    param0.add(15);
    param0.add(56);
    param0.add(63);
    param0.add(28);
    param0.add(54);
    param0.add(2);
    param0.add(94);
    param0.add(82);
    List<Integer> param1 = new ArrayList<>();
    param1.add(55);
    param1.add(22);
    param1.add(26);
    param1.add(58);
    param1.add(94);
    param1.add(45);
    param1.add(97);
    param1.add(58);
    param1.add(91);
    param1.add(40);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(9);
    param0.add(68);
    param0.add(51);
    param0.add(31);
    param0.add(14);
    param0.add(73);
    param0.add(51);
    param0.add(75);
    param0.add(98);
    param0.add(83);
    List<Integer> param1 = new ArrayList<>();
    param1.add(81);
    param1.add(79);
    param1.add(2);
    param1.add(49);
    param1.add(10);
    param1.add(9);
    param1.add(13);
    param1.add(67);
    param1.add(51);
    param1.add(74);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("COMPUTE_AVERAGE_TWO_NUMBERS_WITHOUT_OVERFLOW_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COMPUTE_AVERAGE_TWO_NUMBERS_WITHOUT_OVERFLOW_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COMPUTE_AVERAGE_TWO_NUMBERS_WITHOUT_OVERFLOW_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(10);
    param0.add(5);
    param0.add(2);
    param0.add(83);
    param0.add(91);
    param0.add(18);
    param0.add(83);
    param0.add(98);
    param0.add(43);
    param0.add(31);
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
    param1.add(2);
    param1.add(8);
    param1.add(7);
    param1.add(0);
    param1.add(53);
    param1.add(41);
    param1.add(53);
    param1.add(37);
    param1.add(20);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(38);
    param0.add(39);
    param0.add(24);
    param0.add(90);
    param0.add(44);
    param0.add(49);
    param0.add(58);
    param0.add(97);
    param0.add(99);
    param0.add(19);
    List<Integer> param1 = new ArrayList<>();
    param1.add(34);
    param1.add(29);
    param1.add(99);
    param1.add(23);
    param1.add(2);
    param1.add(70);
    param1.add(84);
    param1.add(34);
    param1.add(72);
    param1.add(67);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

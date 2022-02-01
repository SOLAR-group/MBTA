public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(48);
    param0.add(3);
    param0.add(20);
    param0.add(98);
    param0.add(96);
    param0.add(40);
    param0.add(9);
    param0.add(57);
    param0.add(28);
    param0.add(98);
    List<Integer> param1 = new ArrayList<>();
    param1.add(42);
    param1.add(82);
    param1.add(72);
    param1.add(98);
    param1.add(90);
    param1.add(82);
    param1.add(15);
    param1.add(77);
    param1.add(80);
    param1.add(75);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("FIND_NUMBER_PERFECT_SQUARES_TWO_GIVEN_NUMBERS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_NUMBER_PERFECT_SQUARES_TWO_GIVEN_NUMBERS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_NUMBER_PERFECT_SQUARES_TWO_GIVEN_NUMBERS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

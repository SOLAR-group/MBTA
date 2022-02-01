public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(56);
    param0.add(56);
    param0.add(36);
    param0.add(71);
    param0.add(3);
    param0.add(84);
    param0.add(30);
    param0.add(82);
    param0.add(90);
    param0.add(38);
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(60);
    param1.add(56);
    param1.add(54);
    param1.add(70);
    param1.add(57);
    param1.add(80);
    param1.add(54);
    param1.add(70);
    param1.add(4);
    List<Integer> param2 = new ArrayList<>();
    param2.add(82);
    param2.add(17);
    param2.add(51);
    param2.add(6);
    param2.add(81);
    param2.add(47);
    param2.add(85);
    param2.add(32);
    param2.add(55);
    param2.add(5);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(57);
    param0.add(22);
    param0.add(17);
    param0.add(74);
    param0.add(93);
    param0.add(56);
    param0.add(5);
    param0.add(5);
    param0.add(9);
    param0.add(98);
    List<Integer> param1 = new ArrayList<>();
    param1.add(57);
    param1.add(22);
    param1.add(17);
    param1.add(74);
    param1.add(22);
    param1.add(54);
    param1.add(33);
    param1.add(68);
    param1.add(75);
    param1.add(21);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("GCD_ELEMENTS_GIVEN_RANGE," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("GCD_ELEMENTS_GIVEN_RANGE," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("GCD_ELEMENTS_GIVEN_RANGE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(27);
    param0.add(77);
    param0.add(35);
    param0.add(26);
    param0.add(6);
    param0.add(66);
    param0.add(44);
    param0.add(26);
    param0.add(74);
    param0.add(65);
    List<Integer> param1 = new ArrayList<>();
    param1.add(7);
    param1.add(34);
    param1.add(22);
    param1.add(20);
    param1.add(10);
    param1.add(47);
    param1.add(29);
    param1.add(33);
    param1.add(86);
    param1.add(97);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("EULERIAN_NUMBER_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("EULERIAN_NUMBER_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("EULERIAN_NUMBER_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

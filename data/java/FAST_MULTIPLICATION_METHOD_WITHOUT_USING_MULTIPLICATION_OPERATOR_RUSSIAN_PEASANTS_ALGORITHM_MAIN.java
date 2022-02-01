public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(4);
    param0.add(36);
    param0.add(65);
    param0.add(55);
    param0.add(35);
    param0.add(69);
    param0.add(84);
    param0.add(5);
    param0.add(15);
    param0.add(67);
    List<Integer> param1 = new ArrayList<>();
    param1.add(33);
    param1.add(67);
    param1.add(52);
    param1.add(37);
    param1.add(76);
    param1.add(98);
    param1.add(62);
    param1.add(80);
    param1.add(36);
    param1.add(84);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("FAST_MULTIPLICATION_METHOD_WITHOUT_USING_MULTIPLICATION_OPERATOR_RUSSIAN_PEASANTS_ALGORITHM_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FAST_MULTIPLICATION_METHOD_WITHOUT_USING_MULTIPLICATION_OPERATOR_RUSSIAN_PEASANTS_ALGORITHM_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FAST_MULTIPLICATION_METHOD_WITHOUT_USING_MULTIPLICATION_OPERATOR_RUSSIAN_PEASANTS_ALGORITHM_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

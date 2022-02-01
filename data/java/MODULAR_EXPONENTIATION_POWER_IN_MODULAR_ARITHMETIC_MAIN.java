public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(45);
    param0.add(67);
    param0.add(26);
    param0.add(33);
    param0.add(35);
    param0.add(68);
    param0.add(14);
    param0.add(5);
    param0.add(23);
    param0.add(37);
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(25);
    param1.add(91);
    param1.add(61);
    param1.add(8);
    param1.add(41);
    param1.add(76);
    param1.add(89);
    param1.add(42);
    param1.add(63);
    List<Integer> param2 = new ArrayList<>();
    param2.add(68);
    param2.add(49);
    param2.add(44);
    param2.add(9);
    param2.add(13);
    param2.add(5);
    param2.add(20);
    param2.add(13);
    param2.add(45);
    param2.add(56);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("MODULAR_EXPONENTIATION_POWER_IN_MODULAR_ARITHMETIC_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MODULAR_EXPONENTIATION_POWER_IN_MODULAR_ARITHMETIC_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MODULAR_EXPONENTIATION_POWER_IN_MODULAR_ARITHMETIC_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

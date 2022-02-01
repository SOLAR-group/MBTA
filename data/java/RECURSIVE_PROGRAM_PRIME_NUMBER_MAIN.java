public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(3);
    param0.add(7);
    param0.add(89);
    param0.add(97);
    param0.add(41);
    param0.add(73);
    param0.add(95);
    param0.add(69);
    param0.add(20);
    param0.add(30);
    List<Integer> param1 = new ArrayList<>();
    param1.add(2);
    param1.add(2);
    param1.add(2);
    param1.add(2);
    param1.add(2);
    param1.add(2);
    param1.add(2);
    param1.add(2);
    param1.add(2);
    param1.add(2);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("RECURSIVE_PROGRAM_PRIME_NUMBER_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("RECURSIVE_PROGRAM_PRIME_NUMBER_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("RECURSIVE_PROGRAM_PRIME_NUMBER_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

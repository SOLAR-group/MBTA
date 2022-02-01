public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(59);
    param0.add(66);
    param0.add(98);
    param0.add(63);
    param0.add(99);
    param0.add(45);
    param0.add(60);
    param0.add(11);
    param0.add(96);
    param0.add(54);
    List<Integer> param1 = new ArrayList<>();
    param1.add(75);
    param1.add(68);
    param1.add(55);
    param1.add(4);
    param1.add(37);
    param1.add(28);
    param1.add(53);
    param1.add(96);
    param1.add(95);
    param1.add(6);
    List<Integer> param2 = new ArrayList<>();
    param2.add(12);
    param2.add(32);
    param2.add(69);
    param2.add(41);
    param2.add(98);
    param2.add(59);
    param2.add(40);
    param2.add(50);
    param2.add(48);
    param2.add(50);
    List<Integer> param3 = new ArrayList<>();
    param3.add(45);
    param3.add(41);
    param3.add(5);
    param3.add(12);
    param3.add(55);
    param3.add(7);
    param3.add(52);
    param3.add(50);
    param3.add(84);
    param3.add(82);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)))
	        {
                builder.append("MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(70);
    param0.add(97);
    param0.add(49);
    param0.add(56);
    param0.add(87);
    param0.add(64);
    param0.add(75);
    param0.add(90);
    param0.add(55);
    param0.add(73);
    List<Integer> param1 = new ArrayList<>();
    param1.add(78);
    param1.add(46);
    param1.add(26);
    param1.add(61);
    param1.add(79);
    param1.add(21);
    param1.add(93);
    param1.add(16);
    param1.add(16);
    param1.add(29);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("FIND_PERIMETER_CYLINDER_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_PERIMETER_CYLINDER_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_PERIMETER_CYLINDER_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

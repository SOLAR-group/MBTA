public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(19);
    param0.add(23);
    param0.add(92);
    param0.add(9);
    param0.add(20);
    param0.add(68);
    param0.add(66);
    param0.add(77);
    param0.add(90);
    param0.add(26);
    List<Integer> param1 = new ArrayList<>();
    param1.add(14);
    param1.add(51);
    param1.add(10);
    param1.add(50);
    param1.add(67);
    param1.add(25);
    param1.add(30);
    param1.add(22);
    param1.add(1);
    param1.add(34);
    List<Integer> param2 = new ArrayList<>();
    param2.add(34);
    param2.add(5);
    param2.add(24);
    param2.add(34);
    param2.add(20);
    param2.add(40);
    param2.add(24);
    param2.add(32);
    param2.add(71);
    param2.add(54);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

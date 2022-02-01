public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(94);
    param0.add(74);
    param0.add(29);
    param0.add(29);
    param0.add(18);
    param0.add(96);
    param0.add(3);
    param0.add(35);
    param0.add(51);
    param0.add(19);
    List<Integer> param1 = new ArrayList<>();
    param1.add(85);
    param1.add(1);
    param1.add(4);
    param1.add(11);
    param1.add(6);
    param1.add(92);
    param1.add(61);
    param1.add(85);
    param1.add(88);
    param1.add(54);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i),param1.get(i))) )/ (Math.abs(f_filled(param0.get(i),param1.get(i))) + 0.0000001)) < 0.001)
	        {
                builder.append("N_TH_ROOT_NUMBER_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("N_TH_ROOT_NUMBER_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("N_TH_ROOT_NUMBER_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(37);
    param0.add(24);
    param0.add(13);
    param0.add(56);
    param0.add(26);
    param0.add(67);
    param0.add(82);
    param0.add(60);
    param0.add(64);
    param0.add(65);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("FIND_N_TH_ELEMENT_FROM_STERNS_DIATOMIC_SERIES," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FIND_N_TH_ELEMENT_FROM_STERNS_DIATOMIC_SERIES," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FIND_N_TH_ELEMENT_FROM_STERNS_DIATOMIC_SERIES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

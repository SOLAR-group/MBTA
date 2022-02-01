public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("abbc");
param0.add("abahk");
param0.add("hugbabab");
param0.add("abadbc");
param0.add("nkg9");
param0.add("jh7dab");
param0.add("abd");
param0.add("aabb8yk");
param0.add("1111");
param0.add("PFXAhru");
    List<Integer> param1 = new ArrayList<>();
    param1.add(96);
    param1.add(7);
    param1.add(59);
    param1.add(60);
    param1.add(8);
    param1.add(41);
    param1.add(87);
    param1.add(4);
    param1.add(18);
    param1.add(8);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("NUMBER_SUBSEQUENCES_AB_STRING_REPEATED_K_TIMES_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("NUMBER_SUBSEQUENCES_AB_STRING_REPEATED_K_TIMES_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("NUMBER_SUBSEQUENCES_AB_STRING_REPEATED_K_TIMES_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

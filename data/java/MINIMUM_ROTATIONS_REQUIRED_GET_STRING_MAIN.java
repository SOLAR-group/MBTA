public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("vdevdNdQSopPtj");
    param0.add("5");
    param0.add("100010101011");
    param0.add("tlDOvJHAyMllu");
    param0.add("06");
    param0.add("101");
    param0.add("DYgtU");
    param0.add("4");
    param0.add("00");
    param0.add("Dt");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("MINIMUM_ROTATIONS_REQUIRED_GET_STRING_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MINIMUM_ROTATIONS_REQUIRED_GET_STRING_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MINIMUM_ROTATIONS_REQUIRED_GET_STRING_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
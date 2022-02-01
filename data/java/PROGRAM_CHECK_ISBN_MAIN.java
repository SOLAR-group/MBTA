public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("007462542X");
    param0.add("0112112425");
    param0.add("0545010225");
    param0.add("0552527408");
    param0.add("424519151311");
    param0.add("101011");
    param0.add("9780552527408");
    param0.add("2290344397");
    param0.add("1473226406");
    param0.add("DDdguSGiRr");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("PROGRAM_CHECK_ISBN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PROGRAM_CHECK_ISBN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PROGRAM_CHECK_ISBN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

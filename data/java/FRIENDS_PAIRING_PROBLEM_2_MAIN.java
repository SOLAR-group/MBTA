public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(24);
    param0.add(1);
    param0.add(91);
    param0.add(90);
    param0.add(89);
    param0.add(29);
    param0.add(3);
    param0.add(60);
    param0.add(75);
    param0.add(14);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("FRIENDS_PAIRING_PROBLEM_2_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("FRIENDS_PAIRING_PROBLEM_2_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("FRIENDS_PAIRING_PROBLEM_2_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

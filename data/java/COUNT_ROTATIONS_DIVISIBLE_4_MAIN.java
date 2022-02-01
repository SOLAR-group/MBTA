public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("MRRuQJvxe");
    param0.add("87395768");
    param0.add("10111100110111");
    param0.add("aVDUEfzG");
    param0.add("55794792");
    param0.add("111010");
    param0.add("cndMLMJVmzuH");
    param0.add("487717559382");
    param0.add("11110");
    param0.add("dRMDPyr");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("COUNT_ROTATIONS_DIVISIBLE_4_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_ROTATIONS_DIVISIBLE_4_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_ROTATIONS_DIVISIBLE_4_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

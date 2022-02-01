public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("12244824607284961224");
    param0.add("392603977949");
    param0.add("11101001111");
    param0.add("92387493287593874594898678979792");
    param0.add("2233244912");
    param0.add("10101");
    param0.add("12");
    param0.add("254535361");
    param0.add("1");
    param0.add("hMPxVMpOBt");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("DIVISIBILITY_BY_12_FOR_A_LARGE_NUMBER," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("DIVISIBILITY_BY_12_FOR_A_LARGE_NUMBER," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("DIVISIBILITY_BY_12_FOR_A_LARGE_NUMBER," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

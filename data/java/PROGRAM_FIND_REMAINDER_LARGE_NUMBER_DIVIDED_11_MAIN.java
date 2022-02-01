public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("DvsNZVNZ");
    param0.add("1170");
    param0.add("10");
    param0.add("evsPwREbSY");
    param0.add("09219178704");
    param0.add("1001010");
    param0.add("SkZbWSajDKmiG");
    param0.add("0287976763");
    param0.add("011011000111");
    param0.add("lUn");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("PROGRAM_FIND_REMAINDER_LARGE_NUMBER_DIVIDED_11_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PROGRAM_FIND_REMAINDER_LARGE_NUMBER_DIVIDED_11_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PROGRAM_FIND_REMAINDER_LARGE_NUMBER_DIVIDED_11_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

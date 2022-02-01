public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("R");
    param0.add("2956350");
    param0.add("11100111110101");
    param0.add("TZTDLIIfAD");
    param0.add("98");
    param0.add("1100100001");
    param0.add("oKwGeatf");
    param0.add("19");
    param0.add("00010110100");
    param0.add("Cyq");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("COUNT_PALINDROMIC_SUBSEQUENCE_GIVEN_STRING," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_PALINDROMIC_SUBSEQUENCE_GIVEN_STRING," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_PALINDROMIC_SUBSEQUENCE_GIVEN_STRING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

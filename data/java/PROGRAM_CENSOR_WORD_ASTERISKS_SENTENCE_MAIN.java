public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("IggvAXtmJ");
    param0.add("76711241128");
    param0.add("010");
    param0.add("HIKOn");
    param0.add("3680369217");
    param0.add("1111");
    param0.add("zIi");
    param0.add("06");
    param0.add("111");
    param0.add("NJNnrVU");
    List<String> param1 = new ArrayList<>();
    param1.add("kzHdEJuCaO");
    param1.add("5");
    param1.add("0101001");
    param1.add("XlnBwpx");
    param1.add("017523");
    param1.add("1011");
    param1.add("ONNXygON");
    param1.add("54171617");
    param1.add("0010001011001");
    param1.add("AGwmS");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PROGRAM_CENSOR_WORD_ASTERISKS_SENTENCE," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PROGRAM_CENSOR_WORD_ASTERISKS_SENTENCE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

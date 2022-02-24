public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("yQHVDWxcfsazM");
    param0.add("7889372253");
    param0.add("00");
    param0.add("N");
    param0.add("178791892313");
    param0.add("110111101111");
    param0.add("Ba");
    param0.add("320901509");
    param0.add("11");
    param0.add(" HCUbvi");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("LONGEST_EVEN_LENGTH_SUBSTRING_SUM_FIRST_SECOND_HALF," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("LONGEST_EVEN_LENGTH_SUBSTRING_SUM_FIRST_SECOND_HALF," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

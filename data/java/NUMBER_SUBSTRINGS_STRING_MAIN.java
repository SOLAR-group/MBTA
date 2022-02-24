public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("gZFGZsHCimLf");
    param0.add("505357");
    param0.add("011011101");
    param0.add("ovfwP Osauz");
    param0.add("92132238746026");
    param0.add("01100");
    param0.add("RaOWYQRfiWKSyC");
    param0.add("861330202");
    param0.add("001100010");
    param0.add("uvpKlGUBLOMba");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("NUMBER_SUBSTRINGS_STRING," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("NUMBER_SUBSTRINGS_STRING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

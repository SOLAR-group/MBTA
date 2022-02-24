public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("YNpjSv");
    param0.add("736519");
    param0.add("11010000100010");
    param0.add("v ");
    param0.add("8311172");
    param0.add("100011101011");
    param0.add("u");
    param0.add("3943042");
    param0.add("101");
    param0.add("MpbfF OsizevaM");
    List<String> param1 = new ArrayList<>();
    param1.add("qtUkJn");
    param1.add("07592");
    param1.add("0");
    param1.add("qGBQT");
    param1.add("157219329531");
    param1.add("1000001111");
    param1.add("YzkubTqLhP");
    param1.add("3859");
    param1.add("00010000101010");
    param1.add("WgsFGaQwtp");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("SPACE_OPTIMIZED_SOLUTION_LCS," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("SPACE_OPTIMIZED_SOLUTION_LCS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

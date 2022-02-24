public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("gILrzLimS");
    param0.add("307471222");
    param0.add("110");
    param0.add("GcAB");
    param0.add("113");
    param0.add("011110010");
    param0.add("wcwob");
    param0.add("74571582216153");
    param0.add("100000011");
    param0.add("ryPErkzY");
    List<Character> param1 = new ArrayList<>();
    param1.add('m');
    param1.add('2');
    param1.add('0');
    param1.add('v');
    param1.add('3');
    param1.add('0');
    param1.add('w');
    param1.add('1');
    param1.add('0');
    param1.add('q');
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CHECK_OCCURRENCES_CHARACTER_APPEAR_TOGETHER," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CHECK_OCCURRENCES_CHARACTER_APPEAR_TOGETHER," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("mhjnKfd");
    param0.add("716662107");
    param0.add("01");
    param0.add("wPHSxIbnHakGRO");
    param0.add("721106");
    param0.add("111");
    param0.add("TIBFU");
    param0.add("0");
    param0.add("10");
    param0.add("lqq");
    List<Character> param1 = new ArrayList<>();
    param1.add('l');
    param1.add('6');
    param1.add('1');
    param1.add('n');
    param1.add('8');
    param1.add('0');
    param1.add('Q');
    param1.add('3');
    param1.add('0');
    param1.add('d');
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PROGRAM_COUNT_OCCURRENCE_GIVEN_CHARACTER_STRING," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PROGRAM_COUNT_OCCURRENCE_GIVEN_CHARACTER_STRING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

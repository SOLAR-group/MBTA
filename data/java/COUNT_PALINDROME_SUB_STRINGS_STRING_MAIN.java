public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<char [ ]> param0 = new ArrayList<>();
    param0.add(new char[]{'E','E','J','P','T','U','X','Y','Z','e','f','h','l','m','n','o','z'});
    param0.add(new char[]{'8','7','3','4','9','5','3','1','4','0','6','8','2','5','8','3','5','2','8','6','6','3','5','7','5','5','3','7'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'f','E','e','z','B','o','i','v','K','u','P','C','z','f','k','J','t','R','t','A','f','G','D','X','H','e','p','l','l','k','Z','Y','u','g','H','C','f','J','H','W'});
    param0.add(new char[]{'0','0','0','1','1','1','1','1','1','2','2','2','3','3','3','3','3','4','4','4','4','4','4','5','5','5','5','6','6','7','7','9','9','9','9','9','9'});
    param0.add(new char[]{'1','0','1','1','0','0','1','1','1','0','1','0','1','1','0','1','0','1','1','1','1','1','0','1','1','0','1','0','1','1','0','0','1','0','1','0','0','0','0','0','1','1','0','1','0','1'});
    param0.add(new char[]{'C','C','D','F','L','M','P','X','a','f','i','j','w'});
    param0.add(new char[]{'7','9','0','2','8','0','7','5','9','4','5','4','8','1','9','5','3','2','4','1','2'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'m','X','N','M'});
    List<Integer> param1 = new ArrayList<>();
    param1.add(11);
    param1.add(27);
    param1.add(23);
    param1.add(27);
    param1.add(35);
    param1.add(43);
    param1.add(9);
    param1.add(16);
    param1.add(32);
    param1.add(3);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_PALINDROME_SUB_STRINGS_STRING," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_PALINDROME_SUB_STRINGS_STRING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

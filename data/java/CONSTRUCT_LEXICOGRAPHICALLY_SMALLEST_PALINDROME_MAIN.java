public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<char [ ]> param0 = new ArrayList<>();
    param0.add(new char[]{'A','B','C','G','I','L','L','O','O','P','Q','S','W','Y','c','d','e','f','f','i','m','m','o','q','v','w','x','x','y','z'});
    param0.add(new char[]{'3','2','3','6','8','9','0','5','0','5','8','7','9','0','3','6','9','6','2','4','2','3','1','2','7','9','1','8','8','7','1','1','6','1'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'z','v','B','Y','n','K','h','C','T','L','g'});
    param0.add(new char[]{'1','2','5','6','7'});
    param0.add(new char[]{'0','0','1','0'});
    param0.add(new char[]{'D','n','r'});
    param0.add(new char[]{'0','9','9','1','2','1','5','3','7','5','9','2','4','4','8','9','6','4','2','8','8','5','5','7','1','7','6','2','2','2','3','3','7','9'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'E','s','I','S','h','H','i','m','v','B'});
    List<Integer> param1 = new ArrayList<>();
    param1.add(27);
    param1.add(30);
    param1.add(27);
    param1.add(7);
    param1.add(4);
    param1.add(3);
    param1.add(1);
    param1.add(24);
    param1.add(21);
    param1.add(6);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)).equals(f_gold(param0.get(i),param1.get(i))))
	        {
                builder.append("CONSTRUCT_LEXICOGRAPHICALLY_SMALLEST_PALINDROME_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CONSTRUCT_LEXICOGRAPHICALLY_SMALLEST_PALINDROME_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CONSTRUCT_LEXICOGRAPHICALLY_SMALLEST_PALINDROME_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

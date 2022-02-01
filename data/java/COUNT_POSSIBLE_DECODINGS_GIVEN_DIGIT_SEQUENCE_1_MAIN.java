public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<char [ ]> param0 = new ArrayList<>();
    param0.add(new char[]{'B','C','E','E','F','F','G','J','K','K','L','L','M','O','O','P','Q','R','V','X','Z','a','a','a','c','c','c','d','e','g','g','k','k','k','l','m','m','n','p','t','y','z'});
    param0.add(new char[]{'0','9','5','0','2','6','5','4','4','5','2','6','8','2','0','3','1','9','0','1','5'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'x','a','R','O','S','r','g','e','Y','Z','t'});
    param0.add(new char[]{'0','1','1','1','2','2','2','2','2','2','2','3','3','4','4','5','5','5','5','5','6','6','7','7','7','7','8','8'});
    param0.add(new char[]{'1','1','1','1','1','1'});
    param0.add(new char[]{' ',' ',' ','B','B','C','D','F','H','I','J','K','L','O','P','V','W','W','Z','Z','a','c','h','i','q','s','x'});
    param0.add(new char[]{'0','9','1','5','2','4','9','3'});
    param0.add(new char[]{'0','0','0','1','1','1'});
    param0.add(new char[]{'w','t','U','R','a','c','G'});
    List<Integer> param1 = new ArrayList<>();
    param1.add(31);
    param1.add(13);
    param1.add(19);
    param1.add(5);
    param1.add(21);
    param1.add(4);
    param1.add(26);
    param1.add(5);
    param1.add(4);
    param1.add(5);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("COUNT_POSSIBLE_DECODINGS_GIVEN_DIGIT_SEQUENCE_1," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_POSSIBLE_DECODINGS_GIVEN_DIGIT_SEQUENCE_1," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_POSSIBLE_DECODINGS_GIVEN_DIGIT_SEQUENCE_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

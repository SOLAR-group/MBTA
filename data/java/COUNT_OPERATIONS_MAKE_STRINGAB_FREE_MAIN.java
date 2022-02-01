public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<char [ ]> param0 = new ArrayList<>();
    param0.add(new char[]{'L','k','y'});
    param0.add(new char[]{'1','0','9','5','7','4','6','0','4','8','0','1','4','1','8','9','1','5','4','4','8','0','5','8','9','8','1','9','7','0','4','2','5','2','4','6','6','5','3','1','1','0','6'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'A','L','a','l','G',' ','p','b'});
    param0.add(new char[]{'0','1','1','1','2','2','4','5','5','5','6','6','6','7','9'});
    param0.add(new char[]{'0'});
    param0.add(new char[]{' ','A','B','B','B','B','D','G','G','H','H','H','I','I','J','J','J','L','M','N','O','Q','U','U','X','Y','Y','Z','Z','c','c','e','f','h','k','o','p','q','q','s','v','z'});
    param0.add(new char[]{'2','5','7','5','2','3','9'});
    param0.add(new char[]{'0','0','0','0','0','0','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'a','z','M',' ','l','X','x','B','i','j'});
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("COUNT_OPERATIONS_MAKE_STRINGAB_FREE_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_OPERATIONS_MAKE_STRINGAB_FREE_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_OPERATIONS_MAKE_STRINGAB_FREE_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<char [ ]> param0 = new ArrayList<>();
    param0.add(new char[]{'B','N','O','p','t'});
    param0.add(new char[]{'2','8','2','7','3','3','1','2','1','4','1','0','8','1','0','1','1','8','2','9','2','0','6','3','0','4','2','3','3','4','6','7','1','3','6','6','0','5','5','3'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'i','N','F','z','A','Y','v','o','p','t',' ','R','X','D','L','p','J','N','R','m','L','m','s','R','O','G','T','L','m','F','e','B','O','w','e','a','N','T','Z','j','r','n','n'});
    param0.add(new char[]{'0','0','1','1','2','2','2','3','3','4','4','4','5','5','6','6','7','8','8','8','8','9','9','9'});
    param0.add(new char[]{'1','1','0','0','1','1'});
    param0.add(new char[]{' ','A','G','G','H','I','M','M','Q','R','S','U','W','X','Y','a','a','b','b','c','d','e','e','f','h','h','h','i','j','s','s','t','v','w','w','w','y'});
    param0.add(new char[]{'5','0','4','9','6','8','2','5','8','7','5','2','4','7','9','7','8','6','9','2','0','1','0','7'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'X','g','S','C','q','E','L','v'});
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)).equals(f_gold(param0.get(i))))
	        {
                builder.append("LOWER_CASE_UPPER_CASE_INTERESTING_FACT_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("LOWER_CASE_UPPER_CASE_INTERESTING_FACT_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("LOWER_CASE_UPPER_CASE_INTERESTING_FACT_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
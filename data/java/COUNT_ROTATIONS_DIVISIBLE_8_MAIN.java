public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add(" MwBVIb");
    param0.add("37291205493");
    param0.add("0111111");
    param0.add("BrrQon");
    param0.add("226051");
    param0.add("1001101");
    param0.add("eREctoEen");
    param0.add("299967");
    param0.add("000111");
    param0.add("GJUYuqbampKo");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("COUNT_ROTATIONS_DIVISIBLE_8_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNT_ROTATIONS_DIVISIBLE_8_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNT_ROTATIONS_DIVISIBLE_8_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
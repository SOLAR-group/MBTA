public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,4,5,10,14,16,18,42,43,43,45,46,51,52,53,58,61,66,79,81,82,84});
    param0.add(new int[]{48,-22,60,32,48,-2,-76,-50,-26,56,-86,98,-30,-22,82,-20,58,40,76,-2,82,-90,8,-46,22,94});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{79,45});
    param0.add(new int[]{-90,-68,-38,-34,-4,6,10,28,48,52,54,68,88,90});
    param0.add(new int[]{1,0,0,1,0,1,0,1,0,1,0,0,1,1,1,1,0,0,1,1,0,1,1,0});
    param0.add(new int[]{4,8,8,23,26,27,30,42,44,55,59,64,67,69,74,77,82,82,87,96,97});
    param0.add(new int[]{0,-18,-98,-36,-62,0,-32,-98,46,72,-18,30,-86,-42,-82,2,-76,-64,-66,-48,-28,52,-46,-76,76,10,70,4,18,94,88,80,-60,-36,62,96,-4,88,50});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1,1});
    param0.add(new int[]{8,71,75,58,97,24,56,98,71,69,32,64,54,96,69,22,7,47,45,68,17,36,90,9,71,86,16,61,53,63,9,74,38,87,14,86,42,42,14,43,58,82,72,73,32});
    List<Integer> param1 = new ArrayList<>();
    param1.add(19);
    param1.add(25);
    param1.add(23);
    param1.add(1);
    param1.add(11);
    param1.add(22);
    param1.add(17);
    param1.add(32);
    param1.add(6);
    param1.add(25);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("MINIMUM_SUM_TWO_NUMBERS_FORMED_DIGITS_ARRAY_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MINIMUM_SUM_TWO_NUMBERS_FORMED_DIGITS_ARRAY_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MINIMUM_SUM_TWO_NUMBERS_FORMED_DIGITS_ARRAY_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
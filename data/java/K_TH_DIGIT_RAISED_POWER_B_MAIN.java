public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
   param0.add(11);
   param0.add(41);
param0.add(5);
param0.add(1);
param0.add(24);
param0.add(5);
param0.add(66);
param0.add(7);
param0.add(77);
param0.add(60);
    List<Integer> param1 = new ArrayList<>();
  param1.add(2);
  param1.add(3);
param1.add(4);
param1.add(2);
param1.add(1);
param1.add(2);
param1.add(5);
param1.add(10);
param1.add(30);
param1.add(50);
    List<Integer> param2 = new ArrayList<>();
    param2.add(1);
param2.add(0);
param2.add(3);
param2.add(4);
param2.add(5);
param2.add(3);
param2.add(8);
param2.add(3);
param2.add(10);
param2.add(1);

    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("K_TH_DIGIT_RAISED_POWER_B_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("K_TH_DIGIT_RAISED_POWER_B_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("K_TH_DIGIT_RAISED_POWER_B_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
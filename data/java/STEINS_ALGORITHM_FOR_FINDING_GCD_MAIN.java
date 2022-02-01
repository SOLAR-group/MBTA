public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(37);
    param0.add(58);
    param0.add(89);
    param0.add(75);
    param0.add(59);
    param0.add(84);
    param0.add(47);
    param0.add(37);
    param0.add(83);
    param0.add(28);
    List<Integer> param1 = new ArrayList<>();
    param1.add(93);
    param1.add(13);
    param1.add(27);
    param1.add(14);
    param1.add(47);
    param1.add(39);
    param1.add(76);
    param1.add(75);
    param1.add(62);
    param1.add(58);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("STEINS_ALGORITHM_FOR_FINDING_GCD," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("STEINS_ALGORITHM_FOR_FINDING_GCD," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("STEINS_ALGORITHM_FOR_FINDING_GCD," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

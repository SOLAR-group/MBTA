public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(71);
    param0.add(90);
    param0.add(28);
    param0.add(41);
    param0.add(32);
    param0.add(39);
    param0.add(33);
    param0.add(89);
    param0.add(50);
    param0.add(92);
    List<Integer> param1 = new ArrayList<>();
    param1.add(46);
    param1.add(65);
    param1.add(84);
    param1.add(23);
    param1.add(58);
    param1.add(82);
    param1.add(58);
    param1.add(32);
    param1.add(51);
    param1.add(77);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

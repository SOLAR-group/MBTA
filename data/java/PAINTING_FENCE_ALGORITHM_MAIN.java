public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(6);
    param0.add(23);
    param0.add(89);
    param0.add(63);
    param0.add(23);
    param0.add(44);
    param0.add(81);
    param0.add(43);
    param0.add(9);
    param0.add(41);
    List<Integer> param1 = new ArrayList<>();
    param1.add(30);
    param1.add(87);
    param1.add(31);
    param1.add(36);
    param1.add(68);
    param1.add(66);
    param1.add(18);
    param1.add(73);
    param1.add(42);
    param1.add(98);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("PAINTING_FENCE_ALGORITHM," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PAINTING_FENCE_ALGORITHM," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PAINTING_FENCE_ALGORITHM," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

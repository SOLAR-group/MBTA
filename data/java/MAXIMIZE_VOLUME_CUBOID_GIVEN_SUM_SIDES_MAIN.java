public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(67);
    param0.add(48);
    param0.add(59);
    param0.add(22);
    param0.add(14);
    param0.add(66);
    param0.add(1);
    param0.add(75);
    param0.add(58);
    param0.add(78);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

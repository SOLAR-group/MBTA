public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Float> param0 = new ArrayList<>();
    param0.add(2009.019461888707F);
    param0.add(-1480.5131394215787F);
    param0.add(357.7870347569567F);
    param0.add(-8040.293697508038F);
    param0.add(3821.882657293133F);
    param0.add(-6840.635072240347F);
    param0.add(1623.036598830132F);
    param0.add(-9714.00706195298F);
    param0.add(3916.454769669618F);
    param0.add(-669.068424712943F);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PROGRAM_TO_FIND_THE_AREA_OF_PENTAGON," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PROGRAM_TO_FIND_THE_AREA_OF_PENTAGON," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

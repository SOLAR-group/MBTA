public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{18,27,36,51,67,70,71,72,79,85,86,89,93,94,97});
    param0.add(new int[]{4,70,88,90,-34,-4,-36,-38,16,-46,-60,-50,-72,-68,-42,-96,46,32,-80,46,-4,-86,-72,16,40,-74,78,-64,-38});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1});
    param0.add(new int[]{67,75,6,31,18,44,55,99,83,8});
    param0.add(new int[]{-94,-94,-84,-82,-74,-70,-70,-70,-56,-56,-52,-50,-48,-46,-44,-38,-36,-34,-34,-28,-26,-16,-16,0,0,2,2,4,6,10,24,30,32,32,34,36,48,62,64,78,78,84,90,92});
    param0.add(new int[]{0,1,0,0,0,0,0,0,0,0,1,1,0,0,1,0,0,0,0,1,1,0,1,1});
    param0.add(new int[]{1,6,15,20,21,23,24,25,25,40,44,46,59,61,63,68,69,69,72,76,76,79,79,87,88,89,94,94,99});
    param0.add(new int[]{8,70,-66,0,-82,-72,64,-88,40,10,24,-20,88});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{15,89,48,67,30,95,8,22,41,22,12,18,23,15,33,41,50,77,71,53,11,9,53,42,61,56,25,57,28,48,14,86,95,74,54,70,12,36,1,18,42,35,94,18,54,35,1,95,53});
    List<Integer> param1 = new ArrayList<>();
    param1.add(9);
    param1.add(24);
    param1.add(8);
    param1.add(9);
    param1.add(36);
    param1.add(14);
    param1.add(16);
    param1.add(7);
    param1.add(28);
    param1.add(37);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MAXIMIZE_ARRJ_ARRI_ARRL_ARRK_SUCH_THAT_I_J_K_L," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MAXIMIZE_ARRJ_ARRI_ARRL_ARRK_SUCH_THAT_I_J_K_L," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

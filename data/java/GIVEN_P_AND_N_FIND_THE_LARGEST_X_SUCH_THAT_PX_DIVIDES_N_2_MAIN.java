public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(33);
    param0.add(81);
    param0.add(18);
    param0.add(77);
    param0.add(9);
    param0.add(31);
    param0.add(63);
    param0.add(66);
    param0.add(57);
    param0.add(14);
    List<Integer> param1 = new ArrayList<>();
    param1.add(3);
    param1.add(71);
    param1.add(68);
    param1.add(66);
    param1.add(52);
    param1.add(69);
    param1.add(90);
    param1.add(48);
    param1.add(18);
    param1.add(64);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("GIVEN_P_AND_N_FIND_THE_LARGEST_X_SUCH_THAT_PX_DIVIDES_N_2," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("GIVEN_P_AND_N_FIND_THE_LARGEST_X_SUCH_THAT_PX_DIVIDES_N_2," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

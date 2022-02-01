public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(22);
    param0.add(92);
    param0.add(15);
    param0.add(81);
    param0.add(3);
    param0.add(30);
    param0.add(88);
    param0.add(4);
    param0.add(43);
    param0.add(92);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
	        {
                builder.append("COUNTING_PAIRS_PERSON_CAN_FORM_PAIR_ONE_1_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COUNTING_PAIRS_PERSON_CAN_FORM_PAIR_ONE_1_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COUNTING_PAIRS_PERSON_CAN_FORM_PAIR_ONE_1_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
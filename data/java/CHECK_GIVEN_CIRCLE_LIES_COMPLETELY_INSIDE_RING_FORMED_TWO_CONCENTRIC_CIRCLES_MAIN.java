public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(8);
    param0.add(400);
    param0.add(1);
    param0.add(61);
    param0.add(60);
    param0.add(88);
    param0.add(60);
    param0.add(26);
    param0.add(33);
    param0.add(70);
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
    param1.add(1);
    param1.add(400);
    param1.add(40);
    param1.add(49);
    param1.add(10);
    param1.add(79);
    param1.add(88);
    param1.add(65);
    param1.add(57);
    List<Integer> param2 = new ArrayList<>();
    param2.add(2);
    param2.add(10);
    param2.add(10);
    param2.add(2);
    param2.add(68);
    param2.add(69);
    param2.add(92);
    param2.add(75);
    param2.add(57);
    param2.add(77);
    List<Integer> param3 = new ArrayList<>();
    param3.add(6);
    param3.add(74);
    param3.add(74);
    param3.add(50);
    param3.add(77);
    param3.add(71);
    param3.add(29);
    param3.add(84);
    param3.add(21);
    param3.add(52);
    List<Integer> param4 = new ArrayList<>();
    param4.add(0);
    param4.add(38);
    param4.add(38);
    param4.add(0);
    param4.add(71);
    param4.add(26);
    param4.add(38);
    param4.add(10);
    param4.add(61);
    param4.add(87);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i),param4.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i),param4.get(i)))
	        {
                builder.append("CHECK_GIVEN_CIRCLE_LIES_COMPLETELY_INSIDE_RING_FORMED_TWO_CONCENTRIC_CIRCLES_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_GIVEN_CIRCLE_LIES_COMPLETELY_INSIDE_RING_FORMED_TWO_CONCENTRIC_CIRCLES_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_GIVEN_CIRCLE_LIES_COMPLETELY_INSIDE_RING_FORMED_TWO_CONCENTRIC_CIRCLES_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
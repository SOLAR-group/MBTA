public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(11);
    param0.add(87);
    param0.add(51);
    param0.add(89);
    param0.add(64);
    param0.add(57);
    param0.add(65);
    param0.add(32);
    param0.add(73);
    param0.add(3);
    List<Integer> param1 = new ArrayList<>();
    param1.add(36);
    param1.add(1);
    param1.add(1);
    param1.add(67);
    param1.add(10);
    param1.add(86);
    param1.add(90);
    param1.add(23);
    param1.add(61);
    param1.add(99);
    List<Integer> param2 = new ArrayList<>();
    param2.add(62);
    param2.add(62);
    param2.add(47);
    param2.add(9);
    param2.add(79);
    param2.add(99);
    param2.add(42);
    param2.add(28);
    param2.add(63);
    param2.add(6);
    List<Integer> param3 = new ArrayList<>();
    param3.add(64);
    param3.add(64);
    param3.add(90);
    param3.add(52);
    param3.add(45);
    param3.add(43);
    param3.add(82);
    param3.add(26);
    param3.add(77);
    param3.add(19);
    List<Integer> param4 = new ArrayList<>();
    param4.add(50);
    param4.add(54);
    param4.add(14);
    param4.add(94);
    param4.add(67);
    param4.add(83);
    param4.add(77);
    param4.add(60);
    param4.add(92);
    param4.add(21);
    List<Integer> param5 = new ArrayList<>();
    param5.add(4);
    param5.add(41);
    param5.add(71);
    param5.add(21);
    param5.add(78);
    param5.add(63);
    param5.add(32);
    param5.add(45);
    param5.add(76);
    param5.add(28);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i),param4.get(i),param5.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i),param4.get(i),param5.get(i)))
	        {
                builder.append("CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

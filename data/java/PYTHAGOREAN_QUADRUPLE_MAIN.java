public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(1);
    param0.add(3);
    param0.add(0);
    param0.add(-1);
    param0.add(82);
    param0.add(14);
    param0.add(6);
    param0.add(13);
    param0.add(96);
    param0.add(70);
    List<Integer> param1 = new ArrayList<>();
    param1.add(1);
    param1.add(2);
    param1.add(0);
    param1.add(-1);
    param1.add(79);
    param1.add(57);
    param1.add(96);
    param1.add(7);
    param1.add(65);
    param1.add(33);
    List<Integer> param2 = new ArrayList<>();
    param2.add(1);
    param2.add(5);
    param2.add(0);
    param2.add(-1);
    param2.add(6);
    param2.add(35);
    param2.add(45);
    param2.add(3);
    param2.add(72);
    param2.add(6);
    List<Integer> param3 = new ArrayList<>();
    param3.add(3);
    param3.add(38);
    param3.add(0);
    param3.add(1);
    param3.add(59);
    param3.add(29);
    param3.add(75);
    param3.add(63);
    param3.add(93);
    param3.add(2);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PYTHAGOREAN_QUADRUPLE," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PYTHAGOREAN_QUADRUPLE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

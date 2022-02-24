public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(58);
    param0.add(56);
    param0.add(35);
    param0.add(99);
    param0.add(13);
    param0.add(45);
    param0.add(40);
    param0.add(92);
    param0.add(7);
    param0.add(13);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CALCULATE_AREA_TETRAHEDRON," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CALCULATE_AREA_TETRAHEDRON," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

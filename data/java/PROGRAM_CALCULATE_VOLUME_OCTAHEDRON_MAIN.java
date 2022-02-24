public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Double> param0 = new ArrayList<>();
    param0.add(3355.322051344013);
    param0.add(-891.0551553192736);
    param0.add(8242.699647177868);
    param0.add(-9259.146104439229);
    param0.add(7712.806145993083);
    param0.add(-4998.858862079315);
    param0.add(9771.127582524628);
    param0.add(-5415.8106399098115);
    param0.add(670.0774772280249);
    param0.add(-7068.634369272122);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PROGRAM_CALCULATE_VOLUME_OCTAHEDRON," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PROGRAM_CALCULATE_VOLUME_OCTAHEDRON," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

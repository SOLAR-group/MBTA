public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Double> param0 = new ArrayList<>();
    param0.add(1772.6589509256596);
    param0.add(-599.737107809315);
    param0.add(1074.1765931782);
    param0.add(-1182.4087746714795);
    param0.add(8083.035797247716);
    param0.add(-6126.414356565494);
    param0.add(5370.057504189614);
    param0.add(-6947.020794285176);
    param0.add(2110.5107873533325);
    param0.add(-6458.751326919488);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("AREA_OF_A_HEXAGON," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("AREA_OF_A_HEXAGON," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

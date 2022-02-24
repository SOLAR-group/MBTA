public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Double> param0 = new ArrayList<>();
    param0.add(8650.932760642281);
    param0.add(-9475.213251789266);
    param0.add(3895.3903681587985);
    param0.add(-2977.0280936855806);
    param0.add(8513.1890392562);
    param0.add(-239.5023899621529);
    param0.add(3460.951135898811);
    param0.add(-8717.439885353786);
    param0.add(6512.42862487631);
    param0.add(-2607.390557447935);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PROGRAM_FIND_CIRCUMFERENCE_CIRCLE," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PROGRAM_FIND_CIRCUMFERENCE_CIRCLE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

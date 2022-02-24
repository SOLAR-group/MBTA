public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,9,16,18,20,23,24,25,25,26,29,30,35,40,41,43,44,46,53,53,56,56,58,60,62,70,80,80,80,82,86,90,92,92,95});
    param0.add(new int[]{-24,70,-74,-90,72,50,-94,86,-58,-68,42,0,98,-70,-14,-32,6,74,64,-78,86,-42,-56,2,-34,-46,70,-62,50,-58,-58,42,86,96,-8,8,-22,-14,-14,98,2,98,-28});
    param0.add(new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{98,18,50,36,88,75,2,40,74,19,63,82,77,5,59,97,70,50,71,90,90,61,63,99});
    param0.add(new int[]{-80,-64,-64,-64,-64,-62,-54,-48,-44,-44,-38,-30,-30,-26,-14,-12,-10,-6,-6,6,22,22,22,26,28,50,52,70,86,86,88,90});
    param0.add(new int[]{0,1,1,0,0,0,0,1,1,1,1,1,0,0,1,1,0,0,1,0,0,0,0,1,1,1,0,0,1,1,0,0,1});
    param0.add(new int[]{59,61,64});
    param0.add(new int[]{98,92,28,42,-74,-36,40,-8,32,-22,-70,-22,-56,74,6,6,-62,46,34,2});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{72,97,79,21,83,2,31,59,6,11,79,97});
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{3,15,16,16,18,26,30,32,32,35,37,41,42,43,48,49,49,54,55,57,65,66,67,67,68,83,85,89,89,90,91,93,96,97,99});
    param1.add(new int[]{-26,36,48,48,-38,-86,90,-62,30,-4,82,16,32,-6,58,82,-66,-40,52,-78,94,-70,-80,-68,-58,-26,50,-78,-90,-48,-28,48,56,50,72,-22,-2,8,-94,92,-44,-66,-30});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1});
    param1.add(new int[]{93,25,16,42,55,61,69,68,95,28,40,90,1,86,76,40,13,47,71,4,64,54,84,45});
    param1.add(new int[]{-96,-94,-80,-74,-64,-56,-52,-32,-30,-24,-12,-12,-8,-2,4,8,16,20,24,24,24,48,50,54,60,64,74,80,88,90,92,92});
    param1.add(new int[]{1,1,1,0,1,1,0,0,0,1,0,0,1,0,1,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,1,1});
    param1.add(new int[]{22,59,85});
    param1.add(new int[]{-62,-84,72,60,10,-18,-44,-22,14,0,76,72,96,-28,-24,52,-74,-30,16,66});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{27,71,87,36,73,37,80,34,57,17,88,52});
    List<Integer> param2 = new ArrayList<>();
    param2.add(29);
    param2.add(34);
    param2.add(13);
    param2.add(16);
    param2.add(22);
    param2.add(20);
    param2.add(1);
    param2.add(18);
    param2.add(34);
    param2.add(9);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("SCHEDULE_JOBS_SERVER_GETS_EQUAL_LOAD," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("SCHEDULE_JOBS_SERVER_GETS_EQUAL_LOAD," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

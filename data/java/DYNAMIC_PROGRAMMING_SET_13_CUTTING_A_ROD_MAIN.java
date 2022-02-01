public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{5,7,15,16,18,22,22,30,34,35,37,41,42,42,43,47,49,52,53,55,58,60,62,62,62,65,65,67,69,73,73,73,75,78,83,84,86,90,91,91,93,94,96});
    param0.add(new int[]{50,-30,-84,-2,-96,-54,-14,56,-48,70,38,-86,16,-48,66,34,36,40,40,36,-16,-92,30});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{79,33,54,12,53,9,29,45,85,20,6,52,8,26,43,42,17,54,8,70,5,71,1,81,42,59,42,63,8,86,29,16,72});
    param0.add(new int[]{-78,-64,-38,-22,2,8,28,32,58,72,72,90});
    param0.add(new int[]{1,0,1,1,1,0,0,1,0,0,1,1,0,1,1,0,1,0,0,1,0,0,1,1,0,1,1,0,0,0});
    param0.add(new int[]{1,3,6,7,10,17,18,22,23,24,28,31,37,43,48,54,56,65,70,71,73,74,79,84,87,95,96});
    param0.add(new int[]{-30,20,-72,-86,-8});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{96,99,20,87,17,13,45,65,33,13,59,77,35,79,20,51,69,71,55,37,23,35,82,70});
    List<Integer> param1 = new ArrayList<>();
    param1.add(37);
    param1.add(19);
    param1.add(29);
    param1.add(22);
    param1.add(11);
    param1.add(20);
    param1.add(21);
    param1.add(3);
    param1.add(21);
    param1.add(19);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("DYNAMIC_PROGRAMMING_SET_13_CUTTING_A_ROD_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("DYNAMIC_PROGRAMMING_SET_13_CUTTING_A_ROD_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("DYNAMIC_PROGRAMMING_SET_13_CUTTING_A_ROD_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

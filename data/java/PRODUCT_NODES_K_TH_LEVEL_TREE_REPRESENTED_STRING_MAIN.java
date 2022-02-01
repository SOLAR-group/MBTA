public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("(0(5(6()())(4()(9()())))(7(1()())(3()())))");
    param0.add("(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))");
    param0.add("(0(5(6()())(4()(9()())))(7(1()())(3()())))");
    param0.add("(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))");
    param0.add("(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))");
    param0.add("(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))");
    param0.add("(0(5(6()())(4()(9()())))(7(1()())(3()())))");
    param0.add("(0(5(6()())(4()(9()())))(7(1()())(3()())))");
    param0.add("0010");
    param0.add("kjtdgmy");
    List<Integer> param1 = new ArrayList<>();
    param1.add(2);
    param1.add(3);
    param1.add(1);
    param1.add(2);
    param1.add(4);
    param1.add(100);
    param1.add(3);
    param1.add(0);
    param1.add(12);
    param1.add(97);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
	        {
                builder.append("PRODUCT_NODES_K_TH_LEVEL_TREE_REPRESENTED_STRING," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("PRODUCT_NODES_K_TH_LEVEL_TREE_REPRESENTED_STRING," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("PRODUCT_NODES_K_TH_LEVEL_TREE_REPRESENTED_STRING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

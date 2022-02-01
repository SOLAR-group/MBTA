public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Float> param0 = new ArrayList<>();
    param0.add(1763.655093333857F);
    param0.add(-3544.737136289062F);
    param0.add(7893.209433000695F);
    param0.add(-3008.0331952533734F);
    param0.add(6155.190186637041F);
    param0.add(-5799.751467314729F);
    param0.add(8234.151546380555F);
    param0.add(-1829.5367705266551F);
    param0.add(5778.227173218819F);
    param0.add(-7785.473710863676F);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i))) )/ (Math.abs(f_filled(param0.get(i))) + 0.0000001)) < 0.001F)
	        {
                builder.append("SQUARE_ROOT_OF_A_PERFECT_SQUARE_MAIN," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("SQUARE_ROOT_OF_A_PERFECT_SQUARE_MAIN," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("SQUARE_ROOT_OF_A_PERFECT_SQUARE_MAIN," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(6);
    param0.add(32);
    param0.add(99);
    param0.add(22);
    param0.add(26);
    param0.add(67);
    param0.add(69);
    param0.add(39);
    param0.add(7);
    param0.add(91);
    List<Integer> param1 = new ArrayList<>();
    param1.add(27);
    param1.add(88);
    param1.add(18);
    param1.add(1);
    param1.add(78);
    param1.add(51);
    param1.add(57);
    param1.add(8);
    param1.add(82);
    param1.add(56);
    List<Integer> param2 = new ArrayList<>();
    param2.add(51);
    param2.add(69);
    param2.add(48);
    param2.add(74);
    param2.add(95);
    param2.add(27);
    param2.add(91);
    param2.add(9);
    param2.add(41);
    param2.add(7);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
	        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
	        {
                builder.append("COIN_GAME_WINNER_EVERY_PLAYER_THREE_CHOICES," + args[1] + "," + i + ",SUCCESS\n");
            } else {
                builder.append("COIN_GAME_WINNER_EVERY_PLAYER_THREE_CHOICES," + args[1] + "," + i + ",FAILURE\n");
            }
        } catch (Exception e) {
            builder.append("COIN_GAME_WINNER_EVERY_PLAYER_THREE_CHOICES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

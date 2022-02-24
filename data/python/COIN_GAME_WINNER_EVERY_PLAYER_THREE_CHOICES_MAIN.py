if __name__ == '__main__':
    param = [
    (6,27,51,),
    (32,88,69,),
    (99,18,48,),
    (22,1,74,),
    (26,78,95,),
    (67,51,27,),
    (69,57,91,),
    (39,8,9,),
    (7,82,41,),
    (91,56,7,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COIN_GAME_WINNER_EVERY_PLAYER_THREE_CHOICES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COIN_GAME_WINNER_EVERY_PLAYER_THREE_CHOICES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

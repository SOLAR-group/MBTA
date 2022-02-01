if __name__ == '__main__':
    param = [
    (73,),
    (28,),
    (33,),
    (23,),
    (84,),
    (31,),
    (48,),
    (46,),
    (45,),
    (90,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MAXIMUM_GAMES_PLAYED_WINNER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MAXIMUM_GAMES_PLAYED_WINNER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MAXIMUM_GAMES_PLAYED_WINNER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

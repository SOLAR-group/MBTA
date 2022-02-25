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
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMUM_GAMES_PLAYED_WINNER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMUM_GAMES_PLAYED_WINNER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

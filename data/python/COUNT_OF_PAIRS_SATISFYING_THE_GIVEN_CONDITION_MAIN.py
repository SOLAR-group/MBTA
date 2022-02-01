if __name__ == '__main__':
    param = [
    (31,91,),
    (72,85,),
    (23,49,),
    (42,32,),
    (13,7,),
    (93,5,),
    (33,32,),
    (94,76,),
    (60,60,),
    (11,26,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_OF_PAIRS_SATISFYING_THE_GIVEN_CONDITION," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_OF_PAIRS_SATISFYING_THE_GIVEN_CONDITION," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_OF_PAIRS_SATISFYING_THE_GIVEN_CONDITION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

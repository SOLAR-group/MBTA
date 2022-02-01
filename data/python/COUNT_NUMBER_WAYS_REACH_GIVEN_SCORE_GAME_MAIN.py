if __name__ == '__main__':
    param = [
    (83,),
    (29,),
    (17,),
    (12,),
    (93,),
    (55,),
    (97,),
    (75,),
    (22,),
    (52,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_NUMBER_WAYS_REACH_GIVEN_SCORE_GAME," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_NUMBER_WAYS_REACH_GIVEN_SCORE_GAME," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_NUMBER_WAYS_REACH_GIVEN_SCORE_GAME," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

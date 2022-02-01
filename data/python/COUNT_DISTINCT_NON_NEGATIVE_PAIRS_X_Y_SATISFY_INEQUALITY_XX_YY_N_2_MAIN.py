if __name__ == '__main__':
    param = [
    (61,),
    (45,),
    (53,),
    (4,),
    (82,),
    (86,),
    (37,),
    (48,),
    (81,),
    (50,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_DISTINCT_NON_NEGATIVE_PAIRS_X_Y_SATISFY_INEQUALITY_XX_YY_N_2," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_DISTINCT_NON_NEGATIVE_PAIRS_X_Y_SATISFY_INEQUALITY_XX_YY_N_2," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_DISTINCT_NON_NEGATIVE_PAIRS_X_Y_SATISFY_INEQUALITY_XX_YY_N_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

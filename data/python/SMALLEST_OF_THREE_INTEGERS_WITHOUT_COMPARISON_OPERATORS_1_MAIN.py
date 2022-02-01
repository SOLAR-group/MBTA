if __name__ == '__main__':
    param = [
    (48,63,56,),
    (11,55,84,),
    (50,89,96,),
    (21,71,74,),
    (94,39,42,),
    (22,44,86,),
    (3,41,68,),
    (67,62,94,),
    (59,2,83,),
    (50,11,1,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

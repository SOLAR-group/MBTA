if __name__ == '__main__':
    param = [
    (94,36,),
    (11,79,),
    (88,63,),
    (85,43,),
    (74,89,),
    (96,33,),
    (49,51,),
    (50,24,),
    (21,26,),
    (81,19,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_NUMBER_OF_SOLUTIONS_OF_X2_1_MOD_P_IN_GIVEN_RANGE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_NUMBER_OF_SOLUTIONS_OF_X2_1_MOD_P_IN_GIVEN_RANGE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_NUMBER_OF_SOLUTIONS_OF_X2_1_MOD_P_IN_GIVEN_RANGE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

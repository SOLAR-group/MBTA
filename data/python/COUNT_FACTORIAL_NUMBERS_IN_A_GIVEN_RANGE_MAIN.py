if __name__ == '__main__':
    param = [
    (57,79,),
    (57,21,),
    (31,37,),
    (62,87,),
    (49,98,),
    (82,76,),
    (31,45,),
    (5,52,),
    (76,43,),
    (55,6,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_FACTORIAL_NUMBERS_IN_A_GIVEN_RANGE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_FACTORIAL_NUMBERS_IN_A_GIVEN_RANGE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_FACTORIAL_NUMBERS_IN_A_GIVEN_RANGE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

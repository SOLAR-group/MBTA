if __name__ == '__main__':
    param = [
    (21,),
    (40,),
    (83,),
    (93,),
    (43,),
    (98,),
    (35,),
    (86,),
    (76,),
    (88,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

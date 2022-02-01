if __name__ == '__main__':
    param = [
    (90,),
    (56,),
    (43,),
    (31,),
    (77,),
    (35,),
    (43,),
    (66,),
    (15,),
    (95,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

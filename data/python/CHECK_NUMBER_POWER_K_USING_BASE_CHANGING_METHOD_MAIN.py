if __name__ == '__main__':
    param = [
    (64,4,),
    (16,2,),
    (27,3,),
    (81,72,),
    (1,9,),
    (69,17,),
    (8,20,),
    (31,79,),
    (43,81,),
    (54,89,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CHECK_NUMBER_POWER_K_USING_BASE_CHANGING_METHOD," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CHECK_NUMBER_POWER_K_USING_BASE_CHANGING_METHOD," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CHECK_NUMBER_POWER_K_USING_BASE_CHANGING_METHOD," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

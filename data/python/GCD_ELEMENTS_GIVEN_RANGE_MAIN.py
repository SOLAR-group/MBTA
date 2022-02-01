if __name__ == '__main__':
    param = [
    (57,57,),
    (22,22,),
    (17,17,),
    (74,74,),
    (93,22,),
    (56,54,),
    (5,33,),
    (5,68,),
    (9,75,),
    (98,21,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("GCD_ELEMENTS_GIVEN_RANGE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("GCD_ELEMENTS_GIVEN_RANGE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("GCD_ELEMENTS_GIVEN_RANGE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

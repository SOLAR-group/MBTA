if __name__ == '__main__':
    param = [
    (83,),
    (88,),
    (60,),
    (6,),
    (26,),
    (98,),
    (38,),
    (90,),
    (76,),
    (66,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_MINIMUM_SUM_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_MINIMUM_SUM_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_MINIMUM_SUM_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

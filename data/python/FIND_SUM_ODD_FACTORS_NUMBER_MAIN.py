if __name__ == '__main__':
    param = [
    (20,),
    (6,),
    (39,),
    (80,),
    (88,),
    (7,),
    (16,),
    (27,),
    (83,),
    (6,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_SUM_ODD_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_SUM_ODD_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_SUM_ODD_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

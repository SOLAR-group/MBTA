if __name__ == '__main__':
    param = [
    (2,),
    (57,),
    (28,),
    (43,),
    (38,),
    (29,),
    (45,),
    (47,),
    (44,),
    (3,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_OF_ALL_PROPER_DIVISORS_OF_A_NATURAL_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_OF_ALL_PROPER_DIVISORS_OF_A_NATURAL_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_OF_ALL_PROPER_DIVISORS_OF_A_NATURAL_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

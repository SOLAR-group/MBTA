if __name__ == '__main__':
    param = [
    (73,),
    (41,),
    (36,),
    (28,),
    (49,),
    (24,),
    (85,),
    (59,),
    (82,),
    (40,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_DIVISORS_1_N_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_DIVISORS_1_N_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_DIVISORS_1_N_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

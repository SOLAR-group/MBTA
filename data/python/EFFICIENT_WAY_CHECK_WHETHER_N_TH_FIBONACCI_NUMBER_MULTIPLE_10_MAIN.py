if __name__ == '__main__':
    param = [
    (30,),
    (-30,),
    (60,),
    (90,),
    (99,),
    (32,),
    (21,),
    (65,),
    (21,),
    (99,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("EFFICIENT_WAY_CHECK_WHETHER_N_TH_FIBONACCI_NUMBER_MULTIPLE_10," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("EFFICIENT_WAY_CHECK_WHETHER_N_TH_FIBONACCI_NUMBER_MULTIPLE_10," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("EFFICIENT_WAY_CHECK_WHETHER_N_TH_FIBONACCI_NUMBER_MULTIPLE_10," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
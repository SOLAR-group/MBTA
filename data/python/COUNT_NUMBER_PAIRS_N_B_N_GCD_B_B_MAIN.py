if __name__ == '__main__':
    param = [
        (17,),
        (72,),
        (43,),
        (55,),
        (62,),
        (22,),
        (17,),
        (68,),
        (20,),
        (29,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_NUMBER_PAIRS_N_B_N_GCD_B_B," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_NUMBER_PAIRS_N_B_N_GCD_B_B," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_NUMBER_PAIRS_N_B_N_GCD_B_B," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

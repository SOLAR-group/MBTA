if __name__ == '__main__':
    param = [
    (44,),
    (9,),
    (19,),
    (10,),
    (78,),
    (94,),
    (70,),
    (81,),
    (81,),
    (49,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_OFDIFFERENT_WAYS_EXPRESS_N_SUM_1_3_4," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_OFDIFFERENT_WAYS_EXPRESS_N_SUM_1_3_4," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_OFDIFFERENT_WAYS_EXPRESS_N_SUM_1_3_4," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

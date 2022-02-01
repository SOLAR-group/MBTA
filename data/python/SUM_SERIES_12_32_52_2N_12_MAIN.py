if __name__ == '__main__':
    param = [
    (14,),
    (61,),
    (37,),
    (86,),
    (47,),
    (98,),
    (70,),
    (24,),
    (76,),
    (24,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_SERIES_12_32_52_2N_12," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_SERIES_12_32_52_2N_12," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_SERIES_12_32_52_2N_12," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

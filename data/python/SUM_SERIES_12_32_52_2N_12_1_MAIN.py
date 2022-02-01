if __name__ == '__main__':
    param = [
    (84,),
    (74,),
    (91,),
    (34,),
    (36,),
    (28,),
    (70,),
    (7,),
    (24,),
    (47,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_SERIES_12_32_52_2N_12_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_SERIES_12_32_52_2N_12_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_SERIES_12_32_52_2N_12_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

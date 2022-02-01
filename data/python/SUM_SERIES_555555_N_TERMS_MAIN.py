if __name__ == '__main__':
    param = [
    (18,),
    (81,),
    (77,),
    (84,),
    (87,),
    (14,),
    (15,),
    (3,),
    (21,),
    (60,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_SERIES_555555_N_TERMS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_SERIES_555555_N_TERMS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_SERIES_555555_N_TERMS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

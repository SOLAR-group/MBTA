if __name__ == '__main__':
    param = [
    (1,),
    (2,),
    (3,),
    (4,),
    (5,),
    (74,),
    (77,),
    (67,),
    (9,),
    (12,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
                print("SUM_SERIES_0_6_0_06_0_006_0_0006_N_TERMS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_SERIES_0_6_0_06_0_006_0_0006_N_TERMS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_SERIES_0_6_0_06_0_006_0_0006_N_TERMS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

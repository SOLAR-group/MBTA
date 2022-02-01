if __name__ == '__main__':
    param = [
    (49,),
    (4,),
    (60,),
    (90,),
    (96,),
    (29,),
    (86,),
    (47,),
    (77,),
    (87,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
                print("SUM_SERIES_23_45_67_89_UPTO_N_TERMS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_SERIES_23_45_67_89_UPTO_N_TERMS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_SERIES_23_45_67_89_UPTO_N_TERMS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

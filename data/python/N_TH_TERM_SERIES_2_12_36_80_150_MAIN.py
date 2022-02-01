if __name__ == '__main__':
    param = [
    (90,),
    (95,),
    (22,),
    (29,),
    (62,),
    (40,),
    (52,),
    (21,),
    (33,),
    (11,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("N_TH_TERM_SERIES_2_12_36_80_150," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("N_TH_TERM_SERIES_2_12_36_80_150," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("N_TH_TERM_SERIES_2_12_36_80_150," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

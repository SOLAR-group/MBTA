if __name__ == '__main__':
    param = [
    (37,),
    (24,),
    (13,),
    (56,),
    (26,),
    (67,),
    (82,),
    (60,),
    (64,),
    (65,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_N_TH_ELEMENT_FROM_STERNS_DIATOMIC_SERIES," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_N_TH_ELEMENT_FROM_STERNS_DIATOMIC_SERIES," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_N_TH_ELEMENT_FROM_STERNS_DIATOMIC_SERIES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

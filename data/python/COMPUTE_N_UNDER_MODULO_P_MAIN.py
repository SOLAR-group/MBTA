if __name__ == '__main__':
    param = [
    (85,18,),
    (14,13,),
    (83,21,),
    (30,35,),
    (96,51,),
    (55,58,),
    (82,71,),
    (12,74,),
    (38,3,),
    (46,73,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COMPUTE_N_UNDER_MODULO_P," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COMPUTE_N_UNDER_MODULO_P," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COMPUTE_N_UNDER_MODULO_P," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

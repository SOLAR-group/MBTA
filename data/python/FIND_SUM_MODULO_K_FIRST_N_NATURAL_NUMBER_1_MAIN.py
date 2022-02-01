if __name__ == '__main__':
    param = [
    (40,90,),
    (46,64,),
    (97,20,),
    (63,1,),
    (92,52,),
    (60,35,),
    (67,40,),
    (61,62,),
    (74,61,),
    (67,41,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_SUM_MODULO_K_FIRST_N_NATURAL_NUMBER_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_SUM_MODULO_K_FIRST_N_NATURAL_NUMBER_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_SUM_MODULO_K_FIRST_N_NATURAL_NUMBER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

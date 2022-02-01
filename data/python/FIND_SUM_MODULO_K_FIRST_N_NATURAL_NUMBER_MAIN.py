if __name__ == '__main__':
    param = [
    (11,5,),
    (36,69,),
    (71,28,),
    (74,1,),
    (66,84,),
    (38,14,),
    (2,11,),
    (73,87,),
    (79,11,),
    (30,55,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_SUM_MODULO_K_FIRST_N_NATURAL_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_SUM_MODULO_K_FIRST_N_NATURAL_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_SUM_MODULO_K_FIRST_N_NATURAL_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

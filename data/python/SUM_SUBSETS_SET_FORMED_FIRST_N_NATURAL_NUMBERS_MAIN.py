if __name__ == '__main__':
    param = [
    (76,),
    (26,),
    (45,),
    (35,),
    (34,),
    (22,),
    (3,),
    (25,),
    (22,),
    (78,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_SUBSETS_SET_FORMED_FIRST_N_NATURAL_NUMBERS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_SUBSETS_SET_FORMED_FIRST_N_NATURAL_NUMBERS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_SUBSETS_SET_FORMED_FIRST_N_NATURAL_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

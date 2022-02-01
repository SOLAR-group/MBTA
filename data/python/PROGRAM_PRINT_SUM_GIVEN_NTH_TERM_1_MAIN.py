if __name__ == '__main__':
    param = [
    (42,),
    (40,),
    (67,),
    (73,),
    (18,),
    (16,),
    (74,),
    (33,),
    (92,),
    (22,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PROGRAM_PRINT_SUM_GIVEN_NTH_TERM_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROGRAM_PRINT_SUM_GIVEN_NTH_TERM_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROGRAM_PRINT_SUM_GIVEN_NTH_TERM_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

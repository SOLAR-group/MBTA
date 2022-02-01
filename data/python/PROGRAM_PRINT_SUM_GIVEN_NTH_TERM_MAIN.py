if __name__ == '__main__':
    param = [
    (39,),
    (20,),
    (10,),
    (39,),
    (70,),
    (21,),
    (21,),
    (80,),
    (89,),
    (99,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PROGRAM_PRINT_SUM_GIVEN_NTH_TERM," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROGRAM_PRINT_SUM_GIVEN_NTH_TERM," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROGRAM_PRINT_SUM_GIVEN_NTH_TERM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

if __name__ == '__main__':
    param = [
    (63,),
    (64,),
    (85,),
    (36,),
    (20,),
    (63,),
    (42,),
    (19,),
    (62,),
    (97,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("WRITE_A_C_PROGRAM_TO_FIND_THE_PARITY_OF_AN_UNSIGNED_INTEGER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("WRITE_A_C_PROGRAM_TO_FIND_THE_PARITY_OF_AN_UNSIGNED_INTEGER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("WRITE_A_C_PROGRAM_TO_FIND_THE_PARITY_OF_AN_UNSIGNED_INTEGER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

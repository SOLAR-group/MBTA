if __name__ == '__main__':
    param = [
    (371,),
    (9474,),
    (85,),
    (35,),
    (54,),
    (17,),
    (97,),
    (63,),
    (12,),
    (43,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PROGRAM_CHECK_PLUS_PERFECT_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROGRAM_CHECK_PLUS_PERFECT_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROGRAM_CHECK_PLUS_PERFECT_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

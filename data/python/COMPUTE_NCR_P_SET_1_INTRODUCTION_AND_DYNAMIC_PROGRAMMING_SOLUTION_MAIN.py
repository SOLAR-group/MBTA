if __name__ == '__main__':
    param = [
    (82,5,94,),
    (45,24,95,),
    (44,68,61,),
    (88,24,43,),
    (90,75,57,),
    (98,55,43,),
    (80,54,88,),
    (60,75,65,),
    (52,73,86,),
    (71,26,45,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

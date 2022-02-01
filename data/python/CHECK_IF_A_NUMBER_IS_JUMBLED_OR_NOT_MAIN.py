if __name__ == '__main__':
    param = [
    (67,),
    (77,),
    (35,),
    (79,),
    (45,),
    (22,),
    (68,),
    (17,),
    (5,),
    (85,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CHECK_IF_A_NUMBER_IS_JUMBLED_OR_NOT," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CHECK_IF_A_NUMBER_IS_JUMBLED_OR_NOT," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CHECK_IF_A_NUMBER_IS_JUMBLED_OR_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

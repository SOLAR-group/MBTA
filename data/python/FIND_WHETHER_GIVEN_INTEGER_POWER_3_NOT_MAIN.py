if __name__ == '__main__':
    param = [
    (1,),
    (3,),
    (27,),
    (9,),
    (-9,),
    (11,),
    (57,),
    (21,),
    (60,),
    (44,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_WHETHER_GIVEN_INTEGER_POWER_3_NOT," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_WHETHER_GIVEN_INTEGER_POWER_3_NOT," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_WHETHER_GIVEN_INTEGER_POWER_3_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

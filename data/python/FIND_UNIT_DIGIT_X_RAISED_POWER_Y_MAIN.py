if __name__ == '__main__':
    param = [
    (33,55,),
    (95,7,),
    (21,63,),
    (3,62,),
    (40,53,),
    (64,24,),
    (17,23,),
    (58,74,),
    (44,13,),
    (27,54,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_UNIT_DIGIT_X_RAISED_POWER_Y," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_UNIT_DIGIT_X_RAISED_POWER_Y," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_UNIT_DIGIT_X_RAISED_POWER_Y," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

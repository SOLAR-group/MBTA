if __name__ == '__main__':
    param = [
    (37,17,),
    (70,52,),
    (26,23,),
    (9,96,),
    (82,71,),
    (95,36,),
    (43,40,),
    (7,27,),
    (19,56,),
    (49,28,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_UNIT_DIGIT_X_RAISED_POWER_Y_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_UNIT_DIGIT_X_RAISED_POWER_Y_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_UNIT_DIGIT_X_RAISED_POWER_Y_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

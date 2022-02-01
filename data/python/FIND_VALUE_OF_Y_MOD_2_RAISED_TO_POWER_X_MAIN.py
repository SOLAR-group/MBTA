if __name__ == '__main__':
    param = [
    (57,76,),
    (80,46,),
    (84,96,),
    (35,16,),
    (3,84,),
    (42,79,),
    (7,2,),
    (99,83,),
    (13,61,),
    (44,8,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_VALUE_OF_Y_MOD_2_RAISED_TO_POWER_X," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_VALUE_OF_Y_MOD_2_RAISED_TO_POWER_X," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_VALUE_OF_Y_MOD_2_RAISED_TO_POWER_X," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

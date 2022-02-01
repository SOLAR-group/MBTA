if __name__ == '__main__':
    param = [
    (49,15,),
    (59,69,),
    (76,20,),
    (27,76,),
    (61,60,),
    (67,27,),
    (63,71,),
    (85,25,),
    (90,64,),
    (24,55,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("HOW_TO_TURN_OFF_A_PARTICULAR_BIT_IN_A_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("HOW_TO_TURN_OFF_A_PARTICULAR_BIT_IN_A_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("HOW_TO_TURN_OFF_A_PARTICULAR_BIT_IN_A_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

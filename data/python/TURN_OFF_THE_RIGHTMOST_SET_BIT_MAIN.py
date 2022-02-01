if __name__ == '__main__':
    param = [
    (9,),
    (54,),
    (60,),
    (32,),
    (41,),
    (64,),
    (4,),
    (51,),
    (57,),
    (92,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("TURN_OFF_THE_RIGHTMOST_SET_BIT," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("TURN_OFF_THE_RIGHTMOST_SET_BIT," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("TURN_OFF_THE_RIGHTMOST_SET_BIT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

if __name__ == '__main__':
    param = [
    (45,),
    (26,),
    (74,),
    (80,),
    (46,),
    (67,),
    (16,),
    (87,),
    (27,),
    (17,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("POSITION_OF_RIGHTMOST_SET_BIT," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("POSITION_OF_RIGHTMOST_SET_BIT," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("POSITION_OF_RIGHTMOST_SET_BIT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

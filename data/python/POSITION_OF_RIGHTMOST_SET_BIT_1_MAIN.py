if __name__ == '__main__':
    param = [
    (17,),
    (97,),
    (73,),
    (68,),
    (6,),
    (84,),
    (72,),
    (66,),
    (57,),
    (11,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("POSITION_OF_RIGHTMOST_SET_BIT_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("POSITION_OF_RIGHTMOST_SET_BIT_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("POSITION_OF_RIGHTMOST_SET_BIT_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

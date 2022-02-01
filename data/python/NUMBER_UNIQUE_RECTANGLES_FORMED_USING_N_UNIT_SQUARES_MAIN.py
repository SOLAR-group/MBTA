if __name__ == '__main__':
    param = [
    (34,),
    (49,),
    (41,),
    (17,),
    (67,),
    (38,),
    (59,),
    (64,),
    (61,),
    (58,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NUMBER_UNIQUE_RECTANGLES_FORMED_USING_N_UNIT_SQUARES," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NUMBER_UNIQUE_RECTANGLES_FORMED_USING_N_UNIT_SQUARES," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NUMBER_UNIQUE_RECTANGLES_FORMED_USING_N_UNIT_SQUARES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

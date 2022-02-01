if __name__ == '__main__':
    param = [
    (86,70,),
    (33,65,),
    (3,5,),
    (91,12,),
    (33,27,),
    (13,75,),
    (75,36,),
    (58,64,),
    (50,51,),
    (4,44,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NUMBER_RECTANGLES_NM_GRID," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NUMBER_RECTANGLES_NM_GRID," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NUMBER_RECTANGLES_NM_GRID," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

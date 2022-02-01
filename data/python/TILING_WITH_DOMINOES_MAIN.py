if __name__ == '__main__':
    param = [
    (29,),
    (13,),
    (25,),
    (65,),
    (27,),
    (42,),
    (19,),
    (50,),
    (59,),
    (13,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("TILING_WITH_DOMINOES," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("TILING_WITH_DOMINOES," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("TILING_WITH_DOMINOES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

if __name__ == '__main__':
    param = [
    (60,24,58,),
    (46,43,29,),
    (4,50,71,),
    (67,1,66,),
    (93,35,73,),
    (89,97,8,),
    (8,78,55,),
    (53,73,22,),
    (96,92,83,),
    (38,64,83,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
if __name__ == '__main__':
    param = [
    (58,),
    (92,),
    (73,),
    (52,),
    (24,),
    (14,),
    (58,),
    (11,),
    (8,),
    (52,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_SET_BITS_IN_AN_INTEGER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_SET_BITS_IN_AN_INTEGER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_SET_BITS_IN_AN_INTEGER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

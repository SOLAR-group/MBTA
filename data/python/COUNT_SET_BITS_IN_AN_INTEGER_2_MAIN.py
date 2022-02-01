if __name__ == '__main__':
    param = [
    (32,),
    (94,),
    (33,),
    (99,),
    (17,),
    (64,),
    (80,),
    (42,),
    (12,),
    (86,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_SET_BITS_IN_AN_INTEGER_2," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_SET_BITS_IN_AN_INTEGER_2," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_SET_BITS_IN_AN_INTEGER_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

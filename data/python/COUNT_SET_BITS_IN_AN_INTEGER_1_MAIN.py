if __name__ == '__main__':
    param = [
    (43,),
    (94,),
    (72,),
    (86,),
    (42,),
    (33,),
    (8,),
    (74,),
    (29,),
    (34,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_SET_BITS_IN_AN_INTEGER_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_SET_BITS_IN_AN_INTEGER_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_SET_BITS_IN_AN_INTEGER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

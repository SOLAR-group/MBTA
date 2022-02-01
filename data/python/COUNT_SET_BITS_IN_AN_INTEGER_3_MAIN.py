if __name__ == '__main__':
    param = [
    (6,),
    (58,),
    (90,),
    (69,),
    (15,),
    (54,),
    (60,),
    (51,),
    (46,),
    (91,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_SET_BITS_IN_AN_INTEGER_3," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_SET_BITS_IN_AN_INTEGER_3," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_SET_BITS_IN_AN_INTEGER_3," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

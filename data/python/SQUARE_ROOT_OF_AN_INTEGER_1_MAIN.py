if __name__ == '__main__':
    param = [
    (40,),
    (10,),
    (46,),
    (54,),
    (1,),
    (67,),
    (64,),
    (10,),
    (75,),
    (11,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SQUARE_ROOT_OF_AN_INTEGER_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SQUARE_ROOT_OF_AN_INTEGER_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SQUARE_ROOT_OF_AN_INTEGER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

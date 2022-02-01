if __name__ == '__main__':
    param = [
    (95,),
    (48,),
    (3,),
    (10,),
    (82,),
    (1,),
    (77,),
    (99,),
    (23,),
    (61,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_MINIMUM_NUMBER_DIVIDED_MAKE_NUMBER_PERFECT_SQUARE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_MINIMUM_NUMBER_DIVIDED_MAKE_NUMBER_PERFECT_SQUARE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_MINIMUM_NUMBER_DIVIDED_MAKE_NUMBER_PERFECT_SQUARE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

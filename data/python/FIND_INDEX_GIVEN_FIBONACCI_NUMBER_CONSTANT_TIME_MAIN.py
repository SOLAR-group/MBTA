if __name__ == '__main__':
    param = [
    (5,),
    (19,),
    (7,),
    (94,),
    (58,),
    (65,),
    (69,),
    (96,),
    (80,),
    (14,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

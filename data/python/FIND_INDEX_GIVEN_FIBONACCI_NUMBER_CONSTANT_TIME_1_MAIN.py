if __name__ == '__main__':
    param = [
    (20,),
    (95,),
    (39,),
    (21,),
    (94,),
    (79,),
    (56,),
    (62,),
    (23,),
    (3,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

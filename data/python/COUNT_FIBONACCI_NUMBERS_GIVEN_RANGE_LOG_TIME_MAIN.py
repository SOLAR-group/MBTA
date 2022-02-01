if __name__ == '__main__':
    param = [
    (76,43,),
    (96,52,),
    (19,79,),
    (36,2,),
    (60,11,),
    (20,15,),
    (76,4,),
    (63,93,),
    (2,25,),
    (41,39,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_FIBONACCI_NUMBERS_GIVEN_RANGE_LOG_TIME," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_FIBONACCI_NUMBERS_GIVEN_RANGE_LOG_TIME," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_FIBONACCI_NUMBERS_GIVEN_RANGE_LOG_TIME," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

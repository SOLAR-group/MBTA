if __name__ == '__main__':
    param = [
    (9,),
    (43,),
    (50,),
    (32,),
    (37,),
    (51,),
    (33,),
    (49,),
    (1,),
    (75,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_TRAILING_ZEROES_FACTORIAL_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_TRAILING_ZEROES_FACTORIAL_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_TRAILING_ZEROES_FACTORIAL_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

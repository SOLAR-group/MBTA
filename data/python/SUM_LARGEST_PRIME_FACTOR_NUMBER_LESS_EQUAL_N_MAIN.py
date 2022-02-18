if __name__ == '__main__':
    param = [
        (6,),
        (35,),
        (87,),
        (91,),
        (63,),
        (11,),
        (66,),
        (17,),
        (92,),
        (81,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_LARGEST_PRIME_FACTOR_NUMBER_LESS_EQUAL_N," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_LARGEST_PRIME_FACTOR_NUMBER_LESS_EQUAL_N," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_LARGEST_PRIME_FACTOR_NUMBER_LESS_EQUAL_N," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

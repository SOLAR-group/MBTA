if __name__ == '__main__':
    param = [
    (98,),
    (8,),
    (78,),
    (65,),
    (55,),
    (10,),
    (10,),
    (37,),
    (39,),
    (15,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_LARGEST_PRIME_FACTOR_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_LARGEST_PRIME_FACTOR_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_LARGEST_PRIME_FACTOR_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

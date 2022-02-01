if __name__ == '__main__':
    param = [
    (2,),
    (74,),
    (46,),
    (38,),
    (51,),
    (48,),
    (6,),
    (14,),
    (31,),
    (10,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PRIME_NUMBERS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PRIME_NUMBERS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PRIME_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

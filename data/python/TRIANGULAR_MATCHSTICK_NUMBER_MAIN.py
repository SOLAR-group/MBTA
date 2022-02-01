if __name__ == '__main__':
    param = [
    (6,),
    (25,),
    (15,),
    (30,),
    (17,),
    (80,),
    (27,),
    (13,),
    (12,),
    (67,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("TRIANGULAR_MATCHSTICK_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("TRIANGULAR_MATCHSTICK_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("TRIANGULAR_MATCHSTICK_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

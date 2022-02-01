if __name__ == '__main__':
    param = [
    (94,0),
    (99,1),
    (64,3),
    (27,3),
    (24,4),
    (84,6),
    (69,98),
    (69,39),
    (22,60),
    (39,57)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("K_TH_PRIME_FACTOR_GIVEN_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("K_TH_PRIME_FACTOR_GIVEN_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("K_TH_PRIME_FACTOR_GIVEN_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

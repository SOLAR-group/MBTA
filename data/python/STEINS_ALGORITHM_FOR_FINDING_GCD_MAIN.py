if __name__ == '__main__':
    param = [
    (37,93,),
    (58,13,),
    (89,27,),
    (75,14,),
    (59,47,),
    (84,39,),
    (47,76,),
    (37,75,),
    (83,62,),
    (28,58,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("STEINS_ALGORITHM_FOR_FINDING_GCD," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("STEINS_ALGORITHM_FOR_FINDING_GCD," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("STEINS_ALGORITHM_FOR_FINDING_GCD," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

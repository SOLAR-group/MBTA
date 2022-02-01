if __name__ == '__main__':
    param = [
    (41,),
    (42,),
    (62,),
    (4,),
    (31,),
    (75,),
    (5,),
    (75,),
    (85,),
    (19,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("EFFICIENT_WAY_TO_MULTIPLY_WITH_7," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("EFFICIENT_WAY_TO_MULTIPLY_WITH_7," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("EFFICIENT_WAY_TO_MULTIPLY_WITH_7," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

if __name__ == '__main__':
    param = [
    (88,),
    (24,),
    (3,),
    (22,),
    (53,),
    (2,),
    (88,),
    (30,),
    (38,),
    (2,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("DOUBLE_FACTORIAL_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("DOUBLE_FACTORIAL_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("DOUBLE_FACTORIAL_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

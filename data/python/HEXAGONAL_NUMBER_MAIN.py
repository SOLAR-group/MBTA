if __name__ == '__main__':
    param = [
    (38,),
    (44,),
    (58,),
    (10,),
    (31,),
    (53,),
    (94,),
    (64,),
    (71,),
    (59,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("HEXAGONAL_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("HEXAGONAL_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("HEXAGONAL_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

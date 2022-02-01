if __name__ == '__main__':
    param = [
    (50,),
    (83,),
    (18,),
    (24,),
    (31,),
    (38,),
    (94,),
    (24,),
    (13,),
    (53,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("RECURSIVELY_BREAK_NUMBER_3_PARTS_GET_MAXIMUM_SUM_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("RECURSIVELY_BREAK_NUMBER_3_PARTS_GET_MAXIMUM_SUM_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("RECURSIVELY_BREAK_NUMBER_3_PARTS_GET_MAXIMUM_SUM_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

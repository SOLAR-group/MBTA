if __name__ == '__main__':
    param = [
        (55,),
        (35,),
        (24,),
        (75,),
        (5,),
        (7,),
        (50,),
        (28,),
        (67,),
        (59,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SPLIT_N_MAXIMUM_COMPOSITE_NUMBERS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SPLIT_N_MAXIMUM_COMPOSITE_NUMBERS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SPLIT_N_MAXIMUM_COMPOSITE_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

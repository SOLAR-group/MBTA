if __name__ == '__main__':
    param = [
    (75,),
    (50,),
    (93,),
    (87,),
    (35,),
    (25,),
    (43,),
    (61,),
    (54,),
    (91,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_BALANCED_BINARY_TREES_HEIGHT_H," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_BALANCED_BINARY_TREES_HEIGHT_H," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_BALANCED_BINARY_TREES_HEIGHT_H," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

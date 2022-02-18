if __name__ == '__main__':
    param = [
        (65,),
        (94,),
        (52,),
        (31,),
        (9,),
        (1,),
        (41,),
        (98,),
        (45,),
        (24,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("HEIGHT_COMPLETE_BINARY_TREE_HEAP_N_NODES," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("HEIGHT_COMPLETE_BINARY_TREE_HEAP_N_NODES," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("HEIGHT_COMPLETE_BINARY_TREE_HEAP_N_NODES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

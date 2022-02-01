if __name__ == '__main__':
    param = [
    (5,),
    (16,),
    (8,),
    (61,),
    (59,),
    (88,),
    (67,),
    (28,),
    (58,),
    (42,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
                print("FIND_SUM_NODES_GIVEN_PERFECT_BINARY_TREE_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_SUM_NODES_GIVEN_PERFECT_BINARY_TREE_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_SUM_NODES_GIVEN_PERFECT_BINARY_TREE_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

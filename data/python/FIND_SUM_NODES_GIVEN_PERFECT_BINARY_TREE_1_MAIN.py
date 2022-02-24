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
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_SUM_NODES_GIVEN_PERFECT_BINARY_TREE_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_SUM_NODES_GIVEN_PERFECT_BINARY_TREE_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

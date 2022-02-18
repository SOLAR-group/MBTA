if __name__ == '__main__':
    param = [
        (87,),
        (69,),
        (15,),
        (11,),
        (11,),
        (15,),
        (47,),
        (65,),
        (50,),
        (58,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NUMBER_OF_BINARY_TREES_FOR_GIVEN_PREORDER_SEQUENCE_LENGTH," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NUMBER_OF_BINARY_TREES_FOR_GIVEN_PREORDER_SEQUENCE_LENGTH," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NUMBER_OF_BINARY_TREES_FOR_GIVEN_PREORDER_SEQUENCE_LENGTH," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

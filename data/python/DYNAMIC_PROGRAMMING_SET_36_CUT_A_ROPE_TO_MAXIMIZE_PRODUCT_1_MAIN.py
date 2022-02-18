if __name__ == '__main__':
    param = [
        (62,),
        (53,),
        (8,),
        (6,),
        (35,),
        (35,),
        (46,),
        (74,),
        (69,),
        (3,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("DYNAMIC_PROGRAMMING_SET_36_CUT_A_ROPE_TO_MAXIMIZE_PRODUCT_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("DYNAMIC_PROGRAMMING_SET_36_CUT_A_ROPE_TO_MAXIMIZE_PRODUCT_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("DYNAMIC_PROGRAMMING_SET_36_CUT_A_ROPE_TO_MAXIMIZE_PRODUCT_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

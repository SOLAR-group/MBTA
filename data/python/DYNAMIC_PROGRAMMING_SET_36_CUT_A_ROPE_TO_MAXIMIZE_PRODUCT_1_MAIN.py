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
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("DYNAMIC_PROGRAMMING_SET_36_CUT_A_ROPE_TO_MAXIMIZE_PRODUCT_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DYNAMIC_PROGRAMMING_SET_36_CUT_A_ROPE_TO_MAXIMIZE_PRODUCT_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

if __name__ == '__main__':
    param = [
    (94,),
    (94,),
    (79,),
    (39,),
    (16,),
    (90,),
    (64,),
    (76,),
    (83,),
    (47,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("WRITE_AN_EFFICIENT_METHOD_TO_CHECK_IF_A_NUMBER_IS_MULTIPLE_OF_3," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("WRITE_AN_EFFICIENT_METHOD_TO_CHECK_IF_A_NUMBER_IS_MULTIPLE_OF_3," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("WRITE_AN_EFFICIENT_METHOD_TO_CHECK_IF_A_NUMBER_IS_MULTIPLE_OF_3," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

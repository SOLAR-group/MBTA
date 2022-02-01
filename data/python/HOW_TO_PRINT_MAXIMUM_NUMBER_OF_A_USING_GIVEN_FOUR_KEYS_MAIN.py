if __name__ == '__main__':
    param = [
    (41,),
    (94,),
    (80,),
    (40,),
    (76,),
    (5,),
    (43,),
    (67,),
    (24,),
    (90,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("HOW_TO_PRINT_MAXIMUM_NUMBER_OF_A_USING_GIVEN_FOUR_KEYS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("HOW_TO_PRINT_MAXIMUM_NUMBER_OF_A_USING_GIVEN_FOUR_KEYS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("HOW_TO_PRINT_MAXIMUM_NUMBER_OF_A_USING_GIVEN_FOUR_KEYS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

if __name__ == '__main__':
    param = [
    (73,),
    (91,),
    (27,),
    (79,),
    (31,),
    (84,),
    (68,),
    (9,),
    (85,),
    (35,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("HOW_CAN_WE_SUM_THE_DIGITS_OF_A_GIVEN_NUMBER_IN_SINGLE_STATEMENT_2," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("HOW_CAN_WE_SUM_THE_DIGITS_OF_A_GIVEN_NUMBER_IN_SINGLE_STATEMENT_2," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("HOW_CAN_WE_SUM_THE_DIGITS_OF_A_GIVEN_NUMBER_IN_SINGLE_STATEMENT_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

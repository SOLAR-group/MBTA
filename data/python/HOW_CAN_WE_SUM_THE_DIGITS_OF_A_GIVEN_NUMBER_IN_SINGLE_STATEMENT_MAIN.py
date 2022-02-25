if __name__ == '__main__':
    param = [
        (57,),
        (21,),
        (11,),
        (64,),
        (88,),
        (62,),
        (17,),
        (49,),
        (22,),
        (19,)
    ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("HOW_CAN_WE_SUM_THE_DIGITS_OF_A_GIVEN_NUMBER_IN_SINGLE_STATEMENT," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("HOW_CAN_WE_SUM_THE_DIGITS_OF_A_GIVEN_NUMBER_IN_SINGLE_STATEMENT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

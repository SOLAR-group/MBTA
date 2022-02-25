if __name__ == '__main__':
    param = [
    (94,36,),
    (11,79,),
    (88,63,),
    (85,43,),
    (74,89,),
    (96,33,),
    (49,51,),
    (50,24,),
    (21,26,),
    (81,19,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_NUMBER_OF_SOLUTIONS_OF_X2_1_MOD_P_IN_GIVEN_RANGE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_NUMBER_OF_SOLUTIONS_OF_X2_1_MOD_P_IN_GIVEN_RANGE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

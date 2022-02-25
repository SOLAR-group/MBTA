if __name__ == '__main__':
    param = [
    (21,),
    (40,),
    (83,),
    (93,),
    (43,),
    (98,),
    (35,),
    (86,),
    (76,),
    (88,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

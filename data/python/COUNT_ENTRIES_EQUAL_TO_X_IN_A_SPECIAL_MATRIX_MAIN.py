if __name__ == '__main__':
    param = [
    (47,30,),
    (57,16,),
    (55,63,),
    (11,23,),
    (55,49,),
    (63,64,),
    (64,98,),
    (28,30,),
    (49,61,),
    (48,64,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_ENTRIES_EQUAL_TO_X_IN_A_SPECIAL_MATRIX," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_ENTRIES_EQUAL_TO_X_IN_A_SPECIAL_MATRIX," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

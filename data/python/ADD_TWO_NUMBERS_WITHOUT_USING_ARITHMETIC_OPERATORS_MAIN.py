if __name__ == '__main__':
    param = [
    (56,60,),
    (17,44,),
    (73,96,),
    (75,3,),
    (27,54,),
    (61,1,),
    (65,63,),
    (22,19,),
    (61,9,),
    (97,23,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("ADD_TWO_NUMBERS_WITHOUT_USING_ARITHMETIC_OPERATORS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("ADD_TWO_NUMBERS_WITHOUT_USING_ARITHMETIC_OPERATORS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

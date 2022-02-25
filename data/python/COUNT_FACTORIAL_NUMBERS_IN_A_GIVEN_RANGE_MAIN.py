if __name__ == '__main__':
    param = [
    (57,79,),
    (57,21,),
    (31,37,),
    (62,87,),
    (49,98,),
    (82,76,),
    (31,45,),
    (5,52,),
    (76,43,),
    (55,6,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_FACTORIAL_NUMBERS_IN_A_GIVEN_RANGE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_FACTORIAL_NUMBERS_IN_A_GIVEN_RANGE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

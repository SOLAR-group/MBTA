if __name__ == '__main__':
    param = [
    (1,),
    (4,),
    (9,),
    (25,),
    (36,),
    (3,),
    (121,),
    (14,),
    (17,),
    (80,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_NUMBER_IS_PERFECT_SQUARE_USING_ADDITIONSUBTRACTION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_NUMBER_IS_PERFECT_SQUARE_USING_ADDITIONSUBTRACTION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

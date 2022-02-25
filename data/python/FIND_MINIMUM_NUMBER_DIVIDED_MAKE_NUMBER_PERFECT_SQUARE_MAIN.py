if __name__ == '__main__':
    param = [
    (95,),
    (48,),
    (3,),
    (10,),
    (82,),
    (1,),
    (77,),
    (99,),
    (23,),
    (61,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_MINIMUM_NUMBER_DIVIDED_MAKE_NUMBER_PERFECT_SQUARE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_MINIMUM_NUMBER_DIVIDED_MAKE_NUMBER_PERFECT_SQUARE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

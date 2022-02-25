if __name__ == '__main__':
    param = [
    (31,91,),
    (72,85,),
    (23,49,),
    (42,32,),
    (13,7,),
    (93,5,),
    (33,32,),
    (94,76,),
    (60,60,),
    (11,26,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_OF_PAIRS_SATISFYING_THE_GIVEN_CONDITION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_OF_PAIRS_SATISFYING_THE_GIVEN_CONDITION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

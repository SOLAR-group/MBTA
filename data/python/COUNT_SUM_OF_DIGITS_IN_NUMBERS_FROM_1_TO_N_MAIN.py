if __name__ == '__main__':
    param = [
    (29,),
    (97,),
    (71,),
    (82,),
    (69,),
    (30,),
    (82,),
    (32,),
    (77,),
    (39,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_SUM_OF_DIGITS_IN_NUMBERS_FROM_1_TO_N," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_SUM_OF_DIGITS_IN_NUMBERS_FROM_1_TO_N," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

if __name__ == '__main__':
    param = [
    (90,),
    (56,),
    (43,),
    (31,),
    (77,),
    (35,),
    (43,),
    (66,),
    (15,),
    (95,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

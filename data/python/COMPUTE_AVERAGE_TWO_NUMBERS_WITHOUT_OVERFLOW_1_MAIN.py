if __name__ == '__main__':
    param = [
    (9,81,),
    (68,79,),
    (51,2,),
    (31,49,),
    (14,10,),
    (73,9,),
    (51,13,),
    (75,67,),
    (98,51,),
    (83,74,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COMPUTE_AVERAGE_TWO_NUMBERS_WITHOUT_OVERFLOW_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COMPUTE_AVERAGE_TWO_NUMBERS_WITHOUT_OVERFLOW_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

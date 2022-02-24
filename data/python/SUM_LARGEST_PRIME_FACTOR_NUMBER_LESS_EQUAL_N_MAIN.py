if __name__ == '__main__':
    param = [
        (6,),
        (35,),
        (87,),
        (91,),
        (63,),
        (11,),
        (66,),
        (17,),
        (92,),
        (81,)
    ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_LARGEST_PRIME_FACTOR_NUMBER_LESS_EQUAL_N," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_LARGEST_PRIME_FACTOR_NUMBER_LESS_EQUAL_N," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

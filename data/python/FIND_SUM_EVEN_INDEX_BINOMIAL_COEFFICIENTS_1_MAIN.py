if __name__ == '__main__':
    param = [
    (56,),
    (28,),
    (4,),
    (24,),
    (72,),
    (30,),
    (48,),
    (32,),
    (13,),
    (19,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

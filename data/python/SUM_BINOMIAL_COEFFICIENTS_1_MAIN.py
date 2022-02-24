if __name__ == '__main__':
    param = [
    (48,),
    (42,),
    (15,),
    (75,),
    (23,),
    (41,),
    (46,),
    (99,),
    (36,),
    (53,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_BINOMIAL_COEFFICIENTS_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_BINOMIAL_COEFFICIENTS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

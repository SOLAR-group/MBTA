if __name__ == '__main__':
    param = [
    (8,),
    (39,),
    (25,),
    (44,),
    (72,),
    (6,),
    (72,),
    (62,),
    (48,),
    (39,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_BINOMIAL_COEFFICIENTS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_BINOMIAL_COEFFICIENTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

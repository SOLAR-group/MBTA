if __name__ == '__main__':
    param = [
    (57,),
    (44,),
    (19,),
    (24,),
    (64,),
    (60,),
    (57,),
    (22,),
    (15,),
    (63,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_SQUARES_BINOMIAL_COEFFICIENTS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_SQUARES_BINOMIAL_COEFFICIENTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

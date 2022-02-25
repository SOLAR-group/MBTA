if __name__ == '__main__':
    param = [
    (18,),
    (54,),
    (67,),
    (17,),
    (47,),
    (99,),
    (26,),
    (93,),
    (57,),
    (98,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

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
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

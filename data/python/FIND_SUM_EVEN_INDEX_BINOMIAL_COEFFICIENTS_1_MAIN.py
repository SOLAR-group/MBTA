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
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

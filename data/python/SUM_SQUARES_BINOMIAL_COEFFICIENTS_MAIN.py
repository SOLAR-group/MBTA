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
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_SQUARES_BINOMIAL_COEFFICIENTS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_SQUARES_BINOMIAL_COEFFICIENTS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_SQUARES_BINOMIAL_COEFFICIENTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

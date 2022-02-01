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
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_BINOMIAL_COEFFICIENTS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_BINOMIAL_COEFFICIENTS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_BINOMIAL_COEFFICIENTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
